package java23.jdbc;

import java.sql.SQLException;

public interface IServiceBook extends IBook {
    
    public int transConnmit(ModelBook b1, ModelBook b2) throws SQLException;
    public int transRollback(ModelBook b1, ModelBook b2);
}
