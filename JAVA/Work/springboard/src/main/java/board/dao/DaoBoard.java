package board.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import board.inf.IBoard;
import board.model.ModelArticle;
import board.model.ModelAttachFile;
import board.model.ModelBoard;
import board.model.ModelComments;

@Repository("daoboard")
public class DaoBoard implements IBoard {

    private static final int ArrayList = 0;
    @Autowired
    @Qualifier("sqlSession")
    private SqlSession session;

    @Override
    public String getBoardName(String boardname) {
        String result = null;
        result = session.selectOne("mapper.mapperBoard.getBoardName", boardname);
        return result;
    }

    @Override
    public ModelBoard getBoardOne(String board) {
        ModelBoard result = null;
        result = session.selectOne("mapper.mapperBoard.getBoardOne", board);
        return result;
    }

    @Override
    public List<ModelBoard> getBoardList(String board) {
        List<ModelBoard> result = null;
        result = session.selectList("mapper.mapperBoard.getBoardList", board);
        return result;
    }

    @Override
    public int insertBoard(ModelBoard board) {
        int result = -1;
        result = session.insert("mapper.mapperBoard.insertBoard", board);
        return result;
    }

    @Override
    public int updateBoard(ModelBoard whereValue, ModelBoard setValue) {
        int result = -1;
        Map<String, Object> map = new HashMap<>();
        map.put("whereValue", whereValue);
        map.put("setValue", setValue);

        result = session.update("mapper.mapperBoard.updateBoard", map);
        return result;
    }

    @Override
    public int deleteBoard(ModelBoard board) {
        int result = -1;
        result = session.delete("mapper.mapperBoard.deleteBoard", board);
        return result;
    }

    @Override
    public List<ModelBoard> getBoardSearch(ModelBoard board) {
        List<ModelBoard> result = null;
        result = session.selectList("mapper.mapperBoard.getBoardSearch", board);
        return result;
    }

    @Override
    public int getBoardTotalRecord(String board) {
        int result = -1;
        result = session.selectOne("mapper.mapperBoard.getBoardTotalRecord",board);
        return result;
    }

    @Override
    public List<ModelBoard> getBoardPaging(String boardcd, String searchWord, int start, int end) {
        List<ModelBoard> result = null;
        Map<String, Object> map = new HashMap<>();
        map.put("boardcd", boardcd);
        map.put("searchWord", searchWord);
        map.put("start", start);
        map.put("end", end);
        
        result = session.selectList("mapper.mapperBoard.getBoardPaging", map);
        
        return result;
    }

    @Override
    public int insertBoardList(List<ModelBoard> list) {
        int result = -1;
        result = session.insert("mapper.mapperBoard.insertBoardList", list);
        return result;
    }

    @Override
    public int getArticleTotalRecord(String boardcd, String searchWord) {
        int result = -1;
        Map<String, Object> map = new HashMap<>();
        map.put("boardcd", boardcd);
        map.put("searchWord", searchWord);
        result = session.selectOne("mapper.mapperBoard.getArticleTotalRecord", map);
        return result;
    }

    @Override
    public List<ModelArticle> getArticleList(String boardcd, String searchWord, int start, int end) {
        List<ModelArticle> result = null;
        Map<String, Object> map = new HashMap<>();
        map.put("boardcd", boardcd);
        map.put("searchWord", searchWord);
        map.put("start", start);
        map.put("end", end);
        result = session.selectList("mapper.mapperBoard.getArticleList", map);
        return result;
    }

    @Override
    public ModelArticle getArticle(int articleno) {
        ModelArticle result = null;
        result = session.selectOne("mapper.mapperBoard.getArticle", articleno);
        return result;
    }

    @Override
    public int insertArticle(ModelArticle article) {
        int result = -1;
        result = session.insert("mapper.mapperBoard.insertArticle", article);
        return result;
    }

    @Override
    public int updateArticle(ModelArticle whereValue, ModelArticle setValue) {
        int result = -1;
        Map<String, Object> map = new HashMap<>();
        map.put("whereValue", whereValue);
        map.put("setValue", setValue);
        
        result = session.update("mapper.mapperBoard.updateArticle", map);
        return result;
    }

    @Override
    public int deleteArticle(ModelArticle article) {
        int result = -1;
        result = session.delete("mapper.mapperBoard.deleteArticle", article);
        return result;
    }

    @Override
    public int increaseHit(int articleno) {
        int result = -1;
        result = session.selectOne("mapper.mapperBoard.increaseHit", articleno);
        return result;
    }

    @Override
    public ModelArticle getNextArticle(int articleno, String boardcd, String searchWord) {
        ModelArticle result = null;
        Map<String, Object> map = new HashMap<>();
        map.put("articleno", articleno);
        map.put("boardcd", boardcd);
        map.put("searchWord", searchWord);
        result = session.selectOne("mapper.mapperBoard.getNextArticle", map);
        return result;
    }

    @Override
    public ModelArticle getPrevArticle(int articleno, String boardcd, String searchWord) {
        ModelArticle result = null;
        Map<String, Object> map = new HashMap<>();
        map.put("articleno", articleno);
        map.put("boardcd", boardcd);
        map.put("searchWord", searchWord);
        result = session.selectOne("mapper.mapperBoard.getPrevArticle", map);
        return result;
    }

    @Override
    public ModelAttachFile getAttachFile(int attachfileno) {
        ModelAttachFile result = null;
        result = session.selectOne("mapper.mapperBoard.getAttachFile", attachfileno);
        return result;
    }

    @Override
    public List<ModelAttachFile> getAttachFileList(int attachfileno) {
        List<ModelAttachFile> result = null;
        result = session.selectList("mapper.mapperBoard.getAttachFileList", attachfileno);
        return result;
    }

    @Override
    public int insertAttachFile(ModelAttachFile attachfile) {
        int result = -1;
        result = session.insert("mapper.mapperBoard.insertAttachFile", attachfile);
        return result;
    }

    @Override
    public int deleteAttachFile(ModelAttachFile attachfile) {
        int result = -1;
        result = session.delete("mapper.mapperBoard.deleteAttachFile", attachfile);
        return result;
    }

    @Override
    public ModelComments getComment(int commentno) {
        ModelComments result = null;
        result = session.selectOne("mapper.mapperBoard.getComment", commentno);
        return result;
    }

    @Override
    public List<ModelComments> getCommentList(int commentno) {
        List<ModelComments> result = null;
        result = session.selectList("mapper.mapperBoard.getCommentList", commentno);
        return result;
    }

    @Override
    public int insertComment(ModelComments comments) {
        int result = -1;
        result = session.insert("mapper.mapperBoard.insertComment", comments);
        return result;
    }

    @Override
    public int updateComment(ModelComments whereValue, ModelComments setValue) {
        int result = -1;
        Map<String, Object> map = new HashMap<>();
        map.put("whereValue", whereValue);
        map.put("setValue", setValue);
        
        result = session.update("mapper.mapperBoard.updateComment", map);
        return result;
    }

    @Override
    public int deleteComment(ModelComments comments) {
        int result = -1;
        result = session.delete("mapper.mapperBoard.deleteComment", comments);
        return result;
    }

}
