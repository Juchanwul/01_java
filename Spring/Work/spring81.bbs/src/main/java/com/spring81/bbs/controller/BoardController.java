package com.spring81.bbs.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring81.bbs.common.PagingHelper;
import com.spring81.bbs.common.WebConstants;
import com.spring81.bbs.inf.IServiceBoard;
import com.spring81.bbs.model.ModelArticle;
import com.spring81.bbs.model.ModelAttachFile;
import com.spring81.bbs.model.ModelBoard;
import com.spring81.bbs.model.ModelComments;

/**
 * Handles requests for the application home page.
 */
@Controller
public class BoardController {

    private static final Logger logger = LoggerFactory.getLogger(BoardController.class);

    @Autowired
    IServiceBoard svrboard;

    @RequestMapping(value = "/board/boardlist", method = RequestMethod.GET)
    public String boardlist(Model model, @RequestParam(defaultValue = "") String searchWord,
            @RequestParam(defaultValue = "1") Integer curPage) {
        logger.info("/board/boardlist");

        // 전체 레코드 수 가져오기
        int totalRecord = svrboard.getBoardTotalRecord(searchWord);

        // 페이징을 위한 코드 추가
        PagingHelper paging = new PagingHelper(totalRecord, curPage, 5, 5);
        int start = paging.getStartRecord();
        int end = paging.getEndRecord();

        List<ModelBoard> result = svrboard.getBoardPaging("", searchWord, start, end);

        model.addAttribute("list", result);

        // 페이징을 위한 변수들 추가
        model.addAttribute("curPage", curPage);
        model.addAttribute("searchWord", searchWord);

        // 페이징을 처리하기 위한 변수 추가
        model.addAttribute("no", paging.getListNo());
        model.addAttribute("prevLink", paging.getPrevLink());
        model.addAttribute("pageLinks", paging.getPageLinks());
        model.addAttribute("nextLink", paging.getNextLink());

        return "board/boardlist";
    }

    @RequestMapping(value = "/board/boardview", method = RequestMethod.GET)
    public String boardview(Model model, @RequestParam(defaultValue = "free") String boardcd) {
        logger.info("/board/boardview");

        ModelBoard result = svrboard.getBoardOne(boardcd);
        String boardNm = svrboard.getBoardName(boardcd);

        model.addAttribute("boardNm", boardNm);
        model.addAttribute("board", result);

        return "board/boardview";
    }

    @RequestMapping(value = "/board/boardview/{boardcd}", method = RequestMethod.GET)
    public String boardviewPath(Model model, @PathVariable(value = "boardcd") String boardcd) {
        logger.info("/board/boardview");

        ModelBoard result = svrboard.getBoardOne(boardcd);

        model.addAttribute("boardNm", result.getBoardnm());
        model.addAttribute("board", result);

        return "board/boardview";
    }

    @RequestMapping(value = "/board/boardmodify", method = RequestMethod.GET)
    public String boardmodify(Model model, @RequestParam(defaultValue = "") String boardcd,
            HttpServletRequest request) {
        logger.info("/board/boardmodify");

        ModelBoard result = svrboard.getBoardOne(boardcd);

        String actionurl = request.getRequestURL().toString();

        model.addAttribute("boardNm", result.getBoardnm());
        model.addAttribute("board", result);
        model.addAttribute("actionurl", actionurl);

        return "board/boardmodify";
    }

    @RequestMapping(value = "/board/boardmodify/{boardcd}", method = RequestMethod.GET)
    public String boardmodifyPath(Model model, @PathVariable(value = "boardcd") String boardcd,
            HttpServletRequest request) {
        logger.info("/board/boardmodify/{boardcd}");

        ModelBoard result = svrboard.getBoardOne(boardcd);

        String actionurl = request.getRequestURL().toString();

        model.addAttribute("boardNm", result.getBoardnm());
        model.addAttribute("board", result);
        model.addAttribute("actionurl", actionurl);

        return "board/boardmodify";
    }

    @RequestMapping(value = "/board/boardmodify", method = RequestMethod.POST)
    public String boardmodify(Model model, @ModelAttribute ModelBoard setValue, RedirectAttributes rttr) {
        logger.info("/board/boardmodify");

        ModelBoard whereValue = new ModelBoard();
        whereValue.setBoardcd(setValue.getBoardcd());

        int result = svrboard.updateBoard(setValue, whereValue);

        if (result > 0) {
            return "redirect:/board/boardlist";
        } else {
            rttr.addFlashAttribute("msg", WebConstants.MSG_FAIL_UPDATE_TABLE);
            return "redirect:/board/boardmodify";
        }

    }

    @RequestMapping(value = "/board/boardwrite", method = RequestMethod.GET)
    public String boardwrite(Model model) {
        logger.info("/board/boardwrite");

        return "board/boardwrite";
    }

    @RequestMapping(value = "/board/boardwrite", method = RequestMethod.POST)
    public String boardwrite(Model model, @ModelAttribute ModelBoard board, RedirectAttributes rttr) {
        logger.info("/board/boardwrite");

        int result = svrboard.insertBoard(board);

        if (result > 0) {
            return "redirect:/board/boardview/" + board.getBoardcd();
        } else {
            rttr.addFlashAttribute("msg", WebConstants.MSG_FAIL_INSERT_TABLE);
            rttr.addFlashAttribute("board", board);
            return "redirect:/board/boardwrite";
        }

    }

    @RequestMapping(value = "/board/boarddelete", method = RequestMethod.POST)
    public String boarddelete(Model model, @RequestParam(value = "boardcd") String boardcd, RedirectAttributes rttr) {
        logger.info("/board/boarddelete");

        ModelBoard board = new ModelBoard();

        board.setBoardcd(boardcd);

        int result = svrboard.deleteBoard(board);

        if (result > 0) {
            return "redirect:/board/boardlist";

        } else {
            rttr.addFlashAttribute("msg", WebConstants.MSG_FAIL_DELETE_TABLE);
            rttr.addFlashAttribute("board", board);
            return "redirect:/board/boardwrite";
        }

    }
    @RequestMapping(value = "/board/articlelist", method = RequestMethod.GET)
    public String articlelist1(Model model
                            , @RequestParam(defaultValue="free") String boardcd) {
        logger.info("/board/articlelist");
        
        return "redirect:/board/articlelist/"+boardcd;
    }
    
    
    @RequestMapping(value = "/board/articlelist/{boardcd}", method = RequestMethod.GET)
    public String articlelist(Model model
                            , @PathVariable String boardcd
                            , @RequestParam(defaultValue="1") Integer curPage
                            , @RequestParam(defaultValue="") String searchWord
                            , HttpServletRequest request) {
        logger.info("/board/articlelist/{boardcd}");
        
        // 페이징 처리
        int totalRecord = svrboard.getArticleTotalRecord(boardcd, searchWord);
        PagingHelper paging = new PagingHelper(totalRecord, curPage);
        int start = paging.getStartRecord();
        int end = paging.getEndRecord();
        
        List<ModelArticle> result = svrboard.getArticleList(boardcd, searchWord, start, end);
        
        //boardnm
        //articlelist
        //no
        //prevLink
        //pageLinks
        //curPage
        //nextLink
        
        model.addAttribute("boardnm", svrboard.getBoardName(boardcd));
        model.addAttribute("boardcd", boardcd);
        model.addAttribute("curPage", curPage);
        model.addAttribute("searchWord", searchWord);
        model.addAttribute("articleList", result);
        model.addAttribute("url", request.getRequestURL().toString());
        
        
        
        
        model.addAttribute("no", paging.getListNo());
        model.addAttribute("prevLink", paging.getPrevLink());
        model.addAttribute("pageLinks", paging.getPageLinks());
        model.addAttribute("nextLink", paging.getNextLink());
        
        return "board/articlelist";
    }
    
    @RequestMapping(value = "/board/articleview/{boardcd}/{articleno}", method = RequestMethod.GET)
    public String articleview(Model model
                            , @PathVariable String boardcd
                            , @PathVariable Integer articleno
                            , @RequestParam(defaultValue="1") Integer curPage
                            , @RequestParam(defaultValue="") String searchWord) {
        logger.info("/board/articleview");
        
        ModelArticle result = svrboard.transArticle(articleno);
        model.addAttribute("boardcd", boardcd);
        model.addAttribute("articleno", articleno);
        model.addAttribute("curPage", curPage);
        model.addAttribute("searchWord", searchWord);
        
        model.addAttribute("boardnm", svrboard.getBoardName(boardcd));
        
        ModelArticle thisArticle = svrboard.transArticle(articleno);
        model.addAttribute("thisArticle", thisArticle);
        
        List<ModelAttachFile> attachFileList = svrboard.getAttachFileList(articleno);
        model.addAttribute("attachFileList", attachFileList );
        
        List<ModelComments> commentList = svrboard.getCommentList(articleno);
        model.addAttribute("commentList", commentList);
        
        ModelArticle nextArticle = svrboard.getNextArticle(articleno, boardcd, searchWord);
        model.addAttribute("nextArticle", nextArticle);
        
        ModelArticle prevArticle = svrboard.getPrevArticle(articleno, boardcd, searchWord);
        model.addAttribute("prevArticle", prevArticle);
        
        
        
        return "board/articleview" ;
    }
}
