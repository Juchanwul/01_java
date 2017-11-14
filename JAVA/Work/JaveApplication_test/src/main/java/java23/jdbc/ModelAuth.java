package java23.jdbc;

import java.sql.Date;

public class ModelAuth {
    
    private Integer authid = null;
    private String  name   = "";
    private String  birth  = "";
    
    public Integer getAuthid() {
        return authid;
    }
    
    public void setAuthid(Integer authid) {
        this.authid = authid;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getBirth() {
        return birth;
    }
    
    public void setBirth(String birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "ModelAuth [authid=" + authid + ", name=" + name + ", birth="
                + birth + "]";
    }

    public ModelAuth() {
        super();
    }
    
    
    
}
