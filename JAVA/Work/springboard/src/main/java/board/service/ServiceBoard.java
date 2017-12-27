package board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import board.inf.IBoard;
import board.inf.IServiceBoard;
import board.model.ModelArticle;
import board.model.ModelAttachFile;
import board.model.ModelBoard;
import board.model.ModelComments;

@Service("serviceboard")
public class ServiceBoard implements IServiceBoard {
    
    @Autowired
    @Qualifier("daoboard")
    private IBoard dao;
    
    @Override
    public String getBoardName(String a) {
        String result = null;
        try {
            result = dao.getBoardName(a);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public ModelBoard getBoardOne(String a) {
        ModelBoard result = null;
        try {
            result = dao.getBoardOne(a);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public List<ModelBoard> getBoardList(String board) {
        List<ModelBoard> result = null;
        try {
            result = dao.getBoardList(board);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public int insertBoard(ModelBoard board) {
        int result = -1;
        try {
            result = dao.insertBoard(board);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public int updateBoard(ModelBoard whereValue, ModelBoard setValue) {
        int result = -1;
        try {
            result = dao.updateBoard(whereValue, setValue);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public int deleteBoard(ModelBoard board) {
        int result = -1;
        try {
            result = dao.deleteBoard(board);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public List<ModelBoard> getBoardSearch(ModelBoard board) {
        List<ModelBoard> result = null;
        try {
            result = dao.getBoardSearch(board);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public int getBoardTotalRecord(String board) {
        int result = -1;
        try {
            result = dao.getBoardTotalRecord(board);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public List<ModelBoard> getBoardPaging(String boardcd, String searchWord, int start, int end) {
        List<ModelBoard> result = null;
        try {
            result = dao.getBoardPaging( boardcd,  searchWord,  start,  end);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public int insertBoardList(List<ModelBoard> list) {
        int result = -1;
        try {
            result = dao.insertBoardList(list);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public int getArticleTotalRecord(String article, String searchWord) {
        int result = -1;
        try {
            result = dao.getArticleTotalRecord(article, searchWord);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public List<ModelArticle> getArticleList(String boardcd, String searchWord, int start, int end) {
        List<ModelArticle> result = null;
        try {
            result = dao.getArticleList(boardcd, searchWord,  start,  end);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public ModelArticle getArticle(int articleno) {
        ModelArticle result = null;
        try {
            //상세보기를 할때마다 페이지 조회수를 1 증가 시키기 위해서.
            //하단에 목록에서 조회수를 제대로 보기위해서는
            //목록 레코드를 패치하기 전에 조회수를 먼저 증가시켜야한다.
            //사용자 IP와 시간을 고려해서 조회수를 증가하도록...
            //dao.increaseHit(articleno);
            result = dao.getArticle(articleno);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public int insertArticle(ModelArticle article) {
        int result = -1;
        try {
            result = dao.insertArticle(article);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public int updateArticle(ModelArticle whereValue, ModelArticle setValue) {
        int result = -1;
        try {
            result = dao.updateArticle(whereValue, setValue);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public int deleteArticle(ModelArticle article) {
        int result = -1;
        result = dao.deleteArticle(article);
        return result;
    }

    @Override
    public int increaseHit(int articleno) {
        int result = -1;
        try {
            result = dao.increaseHit(articleno);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public ModelArticle getNextArticle(int articleno, String boardcd, String searchWord) {
        ModelArticle result = null;
        try {
            result = dao.getNextArticle(articleno, boardcd, searchWord);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public ModelArticle getPrevArticle(int articleno, String boardcd, String searchWord) {
        ModelArticle result = null;
        try {
            result = dao.getPrevArticle(articleno, boardcd, searchWord);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public ModelAttachFile getAttachFile(int attachfileno) {
        ModelAttachFile result = null;
        try {
            result = dao.getAttachFile(attachfileno);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public List<ModelAttachFile> getAttachFileList(int attachfileno) {
        List<ModelAttachFile> result = null;
        try {
            result = dao.getAttachFileList(attachfileno);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public int insertAttachFile(ModelAttachFile attachfile) {
        int result = -1;
        try {
            result = dao.insertAttachFile(attachfile);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public int deleteAttachFile(ModelAttachFile attachfile) {
        int result = -1;
        try {
            result = dao.deleteAttachFile(attachfile);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public ModelComments getComment(int commentno) {
        ModelComments result = null;
        try {
            result = dao.getComment(commentno);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public List<ModelComments> getCommentList(int commentno) {
        List<ModelComments> result = null;
        try {
            result = dao.getCommentList(commentno);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public int insertComment(ModelComments comments) {
        int result = -1;
        try {
            result = dao.insertComment(comments);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public int updateComment(ModelComments whereValue, ModelComments setValue) {
        int result = -1;
        try {
            result = dao.updateComment(whereValue, setValue);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public int deleteComment(ModelComments comments) {
        int result = -1;
        try {
            result = dao.deleteComment(comments);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

}
