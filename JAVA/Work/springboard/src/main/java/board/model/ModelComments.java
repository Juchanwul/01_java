package board.model;

import java.sql.Timestamp;

public class ModelComments {

    private Integer commentno = null; // INT(10) UNSIGNED NOT NULL
                                      // AUTO_INCREMENT,
    private Integer articleno = null; // INT(10) UNSIGNED NOT NULL,
    private String email = null; // VARCHAR(60) NULL DEFAULT NULL,
    private String memo = null; // VARCHAR(4000) NULL DEFAULT NULL,
    private Timestamp regdate = null; // DATETIME NULL DEFAULT NULL,
    private Boolean UseYN = null; // TINYINT(1) NULL DEFAULT '1',
    private String InsertUID = null; // VARCHAR(40) NULL DEFAULT NULL,
    private Timestamp InsertDT = null; // DATETIME NULL DEFAULT NULL,
    private String UpdateUID = null; // VARCHAR(40) NULL DEFAULT NULL,
    private Timestamp UpdateDT = null; // DATETIME NULL DEFAULT NULL,

    public Integer getCommentno() {
        return commentno;
    }

    public void setCommentno(Integer commentno) {
        this.commentno = commentno;
    }

    public Integer getArticleno() {
        return articleno;
    }

    public void setArticleno(Integer articleno) {
        this.articleno = articleno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Timestamp getRegdate() {
        return regdate;
    }

    public void setRegdate(Timestamp regdate) {
        this.regdate = regdate;
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
        return "ModelComments [commentno=" + commentno + ", articleno=" + articleno + ", email=" + email + ", memo="
                + memo + ", regdate=" + regdate + ", UseYN=" + UseYN + ", InsertUID=" + InsertUID + ", InsertDT="
                + InsertDT + ", UpdateUID=" + UpdateUID + ", UpdateDT=" + UpdateDT + "]";
    }

    public ModelComments() {
        super();
    }

    
}
