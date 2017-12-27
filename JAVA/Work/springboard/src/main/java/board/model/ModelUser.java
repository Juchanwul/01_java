package board.model;

import java.sql.Date;
import java.sql.Timestamp;

public class ModelUser {

    private Integer userno = null; // INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
    private String userid = ""; // VARCHAR(50) NOT NULL,
    private String email = ""; // VARCHAR(100) NOT NULL,
    private String passwd = ""; // VARCHAR(30) NULL DEFAULT NULL,
    private String name = ""; // VARCHAR(30) NULL DEFAULT NULL,
    private String mobile = ""; // VARCHAR(20) NULL DEFAULT NULL,
    private Byte retireYN = null; // TINYINT(1) NULL DEFAULT '1',
    private String InsertUID = null; // VARCHAR(40) NULL DEFAULT NULL,
    private Timestamp InsertDT = null; // DATETIME NULL DEFAULT NULL,
    private String UpdateUID = ""; // VARCHAR(40) NULL DEFAULT NULL,
    private Timestamp UpdateDT = null; // DATETIME NULL DEFAULT NULL,

    public Integer getUserno() {
        return userno;
    }

    public void setUserno(Integer userno) {
        this.userno = userno;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Byte getRetireYN() {
        return retireYN;
    }

    public void setRetireYN(Byte retireYN) {
        this.retireYN = retireYN;
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
        return "ModelUser [userno=" + userno + ", userid=" + userid + ", email=" + email + ", passwd=" + passwd
                + ", name=" + name + ", mobile=" + mobile + ", retireYN=" + retireYN + ", InsertUID=" + InsertUID
                + ", InsertDT=" + InsertDT + ", UpdateUID=" + UpdateUID + ", UpdateDT=" + UpdateDT + "]";
    }

    public ModelUser() {
        super();
    }

}
