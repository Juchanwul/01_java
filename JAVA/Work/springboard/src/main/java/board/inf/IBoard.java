package board.inf;

import java.util.List;

import board.model.ModelArticle;
import board.model.ModelAttachFile;
import board.model.ModelBoard;
import board.model.ModelComments;

public interface IBoard {

    String getBoardName(String a);

    ModelBoard getBoardOne(String a);

    List<ModelBoard> getBoardList(String board);

    int insertBoard(ModelBoard board);

    int updateBoard(ModelBoard searchValue, ModelBoard updateValue);

    int deleteBoard(ModelBoard board);

    List<ModelBoard> getBoardSearch(ModelBoard board);

    int getBoardTotalRecord(String string);

    List<ModelBoard> getBoardPaging(String boardcd, String searchWord, int start, int end);

    int insertBoardList(List<ModelBoard> list);

    int getArticleTotalRecord(String article, String searchWord);

    List<ModelArticle> getArticleList(String boardcd, String searchWord, int start, int end);

    ModelArticle getArticle(int articleno);

    int insertArticle(ModelArticle article);

    int updateArticle(ModelArticle searchValue, ModelArticle updateValue);

    int deleteArticle(ModelArticle article);

    int increaseHit(int articleno);

    ModelArticle getNextArticle(int articleno, String boardcd, String searchWord);

    ModelArticle getPrevArticle(int articleno, String boardcd, String searchWord);

    ModelAttachFile getAttachFile(int attachfileno);

    List<ModelAttachFile> getAttachFileList(int attachfileno);

    int insertAttachFile(ModelAttachFile attachfile);

    int deleteAttachFile(ModelAttachFile attachfile);

    ModelComments getComment(int commentno);

    List<ModelComments> getCommentList(int commentno);

    int insertComment(ModelComments comments);

    int updateComment(ModelComments searchValue, ModelComments updateValue);

    int deleteComment(ModelComments comments);
}
