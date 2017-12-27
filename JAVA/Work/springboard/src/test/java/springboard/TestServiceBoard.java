package springboard;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.sql.DataSource;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

import board.inf.IServiceBoard;
import board.model.ModelArticle;
import board.model.ModelAttachFile;
import board.model.ModelBoard;
import board.model.ModelComments;
import board.service.ServiceBoard;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestServiceBoard {
    private static IServiceBoard service = null;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:ApplicationContext.xml");

        service = context.getBean("serviceboard", ServiceBoard.class);

        javax.sql.DataSource dataSource = (DataSource) context.getBean("dataSource");
        org.apache.ibatis.jdbc.ScriptRunner runner = new org.apache.ibatis.jdbc.ScriptRunner(
                dataSource.getConnection());
        runner.setAutoCommit(true);
        runner.setStopOnError(true);
        ClassLoader cl = ClassLoader.getSystemClassLoader();
        String sf = cl.getResource("ddl/board.ddl.mysql.sql").getFile(); // ----src/main/ddl/소스
        java.io.Reader br = new java.io.BufferedReader(new java.io.FileReader(sf));
        runner.runScript(br);
        runner.closeConnection();

    }

    @Test
    public void test01_GetBoardName() {
        String rs = "";
        rs = service.getBoardName("free");

        assertNotNull(rs);
        assertEquals("자유게시판", rs);
    }

    @Test
    public void test02_GetBoardOne() {
        ModelBoard rs = null;
        rs = service.getBoardOne("free");

        assertNotNull(rs);
        assertEquals("자유게시판",  rs.getBoardnm());
        assertEquals("free", rs.getBoardcd());
        assertEquals(true, rs.getUseYN());
    }

    @Test
    public void test03_GetBoardList() {
        List<ModelBoard> rs = null;
        rs = service.getBoardList("");

        assertNotNull(rs);
        assertEquals(3 , rs.size());
        assertEquals("qna", rs.get(0).getBoardcd());
    }

    @Test
    public void test04_InsertBoard() {
        int rs = -1;
        ModelBoard board = new ModelBoard();
        board.setBoardcd("home");
        rs = service.insertBoard(board);

        assertTrue(rs >= 1);
    }

    @Test
    public void test05_UpdateBoard() {
        int rs = -1;
        ModelBoard whereValue = new ModelBoard();
        whereValue.setBoardcd("home");

        ModelBoard setValue = new ModelBoard();
        setValue.setBoardnm("abc");
        setValue.setUseYN(null);
        setValue.setUpdateUID("abc");

        rs = service.updateBoard(whereValue, setValue);

        assertTrue(rs >= 0);

    }

    @Test
    public void test06_DeleteBoard() {
        int rs = -1;
        ModelBoard board = new ModelBoard();
        board.setBoardcd("home");
        rs = service.deleteBoard(board);

        assertTrue(rs >= 0);
    }

    @Test
    public void test07_GetBoardSearch() {
        List<ModelBoard> rs = null;
        ModelBoard board = new ModelBoard();
        board.setBoardcd("free");
        rs = service.getBoardSearch(board);

        assertNotNull(rs);
        assertEquals(1, rs.size());
    }

    @Test
    public void test08_GetBoardTotalRecord() {
        int result = service.getBoardTotalRecord("");
        assertEquals(result, 3);
    }

    @Test
    public void test09_GetBoardPaging() {
        String boardcd = "";
        String searchWord = "";
        int start = 2;
        int end = 7;
        List<ModelBoard> rs = service.getBoardPaging(boardcd, searchWord, start, end);
        
        assertEquals(2, rs.size());

    }

    @Test
    public void test10_InsertBoardList() {
        ModelBoard model = null;
        List<ModelBoard> list = new ArrayList<ModelBoard>();
        Date d = new Date();
        String current = new SimpleDateFormat("yyMMddHHmmss").format( d );
        
        for( int i=0; i<10; i=i+1){            
            model = new ModelBoard();
            model.setBoardcd("notice" + current + i );
            model.setBoardnm("공지사항" + current + i );
            model.setUseYN(true);     
            model.setInsertDT( d );
            model.setInsertUID("insertUID" + i);
            model.setUpdateDT( d );
            model.setUpdateUID("updateUID" + i);  
            
            list.add( model );
        }
               
        int result = service.insertBoardList(list);
        assertEquals(result, list.size());
    }

    @Test
    public void test11_GetArticleTotalRecord() {
        String boardcd    = "free";  
        String searchWord = "article";
        
        int result = service.getArticleTotalRecord(boardcd, searchWord);
        assertEquals(result, 201);

    }

    @Test
    public void test12_GetArticleList() {
        
        String boardcd    = "free";  
        String searchWord = "article";
        int    start = 2;
        int    end   = 7;
        
        List<ModelArticle> result = service.getArticleList(boardcd, searchWord, start, end);
        assertEquals(6, result.size());

    }

    @Test
    public void test13_GetArticle() {
        ModelArticle rs = null;
        rs = service.getArticle(1);

        assertNotNull(rs);
        
    }

    @Test
    public void test14_InsertArticle() {
        int rs = -1;
        ModelArticle article = new ModelArticle();
        article.setBoardcd("free");
        article.setTitle("demo");
        rs = service.insertArticle(article);

        assertTrue(rs >= 1);
    }

    @Test
    public void test15_UpdateArticle() {
        int rs = -1;
        ModelArticle whereValue = new ModelArticle();
        whereValue.setTitle("demo");

        ModelArticle setValue = new ModelArticle();
        setValue.setTitle("demo2");
        setValue.setUseYN(false);
        setValue.setContent("demo");

        rs = service.updateArticle(whereValue, setValue);

        assertTrue(rs >= 0);
    }

    @Test
    public void test16_DeleteArticle() {
        int rs = -1;
        ModelArticle article = new ModelArticle();
        article.setUseYN(false);

        rs = service.deleteArticle(article);

        assertTrue(rs >= 0);
    }

    @Test
    public void test17_IncreaseHit() {
        int rs = -1;
        int articleno = 201;
        rs = service.increaseHit(articleno);

        assertNotNull(rs);
    }

    @Test
    public void test18_GetNextArticle() {
        ModelArticle rs = null; 
        rs = service.getNextArticle(1, "free", "test");
        assertSame(2, rs.getArticleno());

    }

    @Test
    public void test19_GetPrevArticle() {
        ModelArticle rs = null;
        rs = service.getPrevArticle(2, "free", "test");
        assertSame(1, rs.getArticleno());

    }

    @Test
    public void test20_GetAttachFile() {
        ModelAttachFile rs = null;
        int attachfileno = 5;
        rs = service.getAttachFile(attachfileno);

        assertNotNull(rs);
        assertEquals("어태치파일", rs.getFilename());
    }

    @Test
    public void test21_GetAttachFileList() {
        List<ModelAttachFile> rs = null;
        int attachfileno = 1;
        rs = service.getAttachFileList(attachfileno);

        assertNotNull(rs);
        assertSame(7, rs.size());
    }

    @Test
    public void test22_InsertAttachFile() {
        int rs = -1;
        ModelAttachFile attachfile = new ModelAttachFile();
        attachfile.setFilename("aaa");
        attachfile.setArticleno(7);
        rs = service.insertAttachFile(attachfile);

        assertTrue(rs >= 1);
    }

    @Test
    public void test23_DeleteAttachFile() {
        int rs = -1;
        ModelAttachFile attachfile = new ModelAttachFile();
        attachfile.setArticleno(7);
        rs = service.deleteAttachFile(attachfile);

        assertTrue(rs >= 0);
    }

    @Test
    public void test24_GetComment() {
        ModelComments rs = null;
        int commentno = 1;
        rs = service.getComment(commentno);

        assertNotNull(rs);
        assertSame(1, rs.getArticleno());
    }

    @Test
    public void test25_GetCommentList() {
        List<ModelComments> rs = null;
        int commentno = 1;
        rs = service.getCommentList(commentno);

        assertNotNull(rs);
        assertSame(1, rs.size());

    }

    @Test
    public void test26_InsertComment() {
        int rs = -1;
        ModelComments comments = new ModelComments();
        comments.setArticleno(3);
        rs = service.insertComment(comments);

        assertTrue(rs >= 1);
    }

    @Test
    public void test27_UpdateComment() {
        int rs = -1;
        ModelComments whereValue = new ModelComments();
        whereValue.setArticleno(3);

        ModelComments setValue = new ModelComments();
        setValue.setMemo("memo");
        setValue.setUseYN(false);

        rs = service.updateComment(whereValue, setValue);

        assertTrue(rs >= 0);
    }

    @Test
    public void test28_DeleteComment() {
        int rs = -1;
        ModelComments comments = new ModelComments();
        comments.setArticleno(3);

        rs = service.deleteComment(comments);

        assertTrue(rs >= 0);
    }

}
