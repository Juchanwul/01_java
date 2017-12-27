package board.model;

import java.sql.Timestamp;
import java.util.Arrays;

public class ModelAttachFile {
    
    private Integer attachfileno  = null;      // INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
    private String filename      = null;      // VARCHAR(50) NOT NULL,
    private String filetype      = null;      // VARCHAR(30) NULL DEFAULT NULL,
    private Integer filesize      = null;      // INT(11) NULL DEFAULT NULL,
    private Integer articleno     = null;      // INT(11) NULL DEFAULT NULL,
    private Byte UseYN         = null;      // TINYINT(1) NULL DEFAULT '1',
    private String InsertUID     = null;      // VARCHAR(40) NULL DEFAULT NULL,
    private Timestamp InsertDT      = null;      // DATETIME NULL DEFAULT NULL,
    private String UpdateUID     = null;      // VARCHAR(40) NULL DEFAULT NULL,
    private Timestamp UpdateDT      = null;      // DATETIME NULL DEFAULT NULL,
    private byte[] imageData     = null;      // LONGBLOB NULL,
    public Integer getAttachfileno() {
        return attachfileno;
    }
    public void setAttachfileno(Integer attachfileno) {
        this.attachfileno = attachfileno;
    }
    public String getFilename() {
        return filename;
    }
    public void setFilename(String filename) {
        this.filename = filename;
    }
    public String getFiletype() {
        return filetype;
    }
    public void setFiletype(String filetype) {
        this.filetype = filetype;
    }
    public Integer getFilesize() {
        return filesize;
    }
    public void setFilesize(Integer filesize) {
        this.filesize = filesize;
    }
    public Integer getArticleno() {
        return articleno;
    }
    public void setArticleno(Integer articleno) {
        this.articleno = articleno;
    }
    public Byte getUseYN() {
        return UseYN;
    }
    public void setUseYN(Byte useYN) {
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
    public byte[] getImageData() {
        return imageData;
    }
    public void setImageData(byte[] imageData) {
        this.imageData = imageData;
    }
    @Override
    public String toString() {
        return "ModelAttachFile [attachfileno=" + attachfileno + ", filename=" + filename + ", filetype=" + filetype
                + ", filesize=" + filesize + ", articleno=" + articleno + ", UseYN=" + UseYN + ", InsertUID="
                + InsertUID + ", InsertDT=" + InsertDT + ", UpdateUID=" + UpdateUID + ", UpdateDT=" + UpdateDT
                + ", imageData=" + Arrays.toString(imageData) + "]";
    }
    public ModelAttachFile() {
        super();
    }

    
}
