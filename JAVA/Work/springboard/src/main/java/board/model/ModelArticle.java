package board.model;

import java.sql.Timestamp;

public class ModelArticle {
    
    private Integer articleno = null;       // INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
    private String boardcd   = null;       // VARCHAR(20) NULL DEFAULT NULL,
    private String title     = null;       // VARCHAR(200) NOT NULL,
    private String content   = null;       // MEDIUMTEXT NULL,
    private String email     = null;       // VARCHAR(60) NULL DEFAULT NULL,
    private Integer hit       = null;       // INT(10) UNSIGNED NULL DEFAULT '0',
    private Timestamp regdate   = null;       // DATETIME NULL DEFAULT NULL,
    private Integer countgood = null;       // INT(11) NULL DEFAULT '0',
    private Integer countbad  = null;       // INT(11) NULL DEFAULT '0',
    private Boolean UseYN     = null;       // TINYINT(1) NOT NULL DEFAULT '1',
    private String InsertUID = null;       // VARCHAR(40) NULL DEFAULT NULL,
    private Timestamp InsertDT  = null;       // DATETIME NULL DEFAULT NULL,
    private String UpdateUID = null;       // VARCHAR(40) NULL DEFAULT NULL,
    private Timestamp UpdateDT  = null;       // DATETIME NULL DEFAULT NULL,
    public Integer getArticleno() {
        return articleno;
    }
    public void setArticleno(Integer articleno) {
        this.articleno = articleno;
    }
    public String getBoardcd() {
        return boardcd;
    }
    public void setBoardcd(String boardcd) {
        this.boardcd = boardcd;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Integer getHit() {
        return hit;
    }
    public void setHit(Integer hit) {
        this.hit = hit;
    }
    public Timestamp getRegdate() {
        return regdate;
    }
    public void setRegdate(Timestamp regdate) {
        this.regdate = regdate;
    }
    public Integer getCountgood() {
        return countgood;
    }
    public void setCountgood(Integer countgood) {
        this.countgood = countgood;
    }
    public Integer getCountbad() {
        return countbad;
    }
    public void setCountbad(Integer countbad) {
        this.countbad = countbad;
    }
    public Boolean getUseYN() {
        return UseYN;
    }
    public void setUseYN(Boolean useYN) {
        UseYN = useYN;
    }
    public String getInsertUID() {
        return InsertUID;
    }
    public void setInsertUID(String insertUID) {
        InsertUID = insertUID;
    }
    public Timestamp getInsertDT() {
        return InsertDT;
    }
    public void setInsertDT(Timestamp insertDT) {
        InsertDT = insertDT;
    }
    public String getUpdateUID() {
        return UpdateUID;
    }
    public void setUpdateUID(String updateUID) {
        UpdateUID = updateUID;
    }
    public Timestamp getUpdateDT() {
        return UpdateDT;
    }
    public void setUpdateDT(Timestamp updateDT) {
        UpdateDT = updateDT;
    }
    @Override
    public String toString() {
        return "ModelArticle [articleno=" + articleno + ", boardcd=" + boardcd + ", title=" + title + ", content="
                + content + ", email=" + email + ", hit=" + hit + ", regdate=" + regdate + ", countgood=" + countgood
                + ", countbad=" + countbad + ", UseYN=" + UseYN + ", InsertUID=" + InsertUID + ", InsertDT=" + InsertDT
                + ", UpdateUID=" + UpdateUID + ", UpdateDT=" + UpdateDT + "]";
    }
    public ModelArticle() {
        super();
    }

    
    
}
