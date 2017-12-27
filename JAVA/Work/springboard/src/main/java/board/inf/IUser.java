package board.inf;

import java.util.List;

import board.model.ModelUser;

public interface IUser {
    
    int insertUser(ModelUser user);
    
    ModelUser login(ModelUser user);
    
    int logout(String logout);

    int updateUserInfo(ModelUser whereinfo, ModelUser setinfo); 
    
    int updatePasswd(ModelUser wherepw, ModelUser setpw);
    
    int deleteUser(ModelUser user);
    
    ModelUser selectUserOne(ModelUser user);
    
    List<ModelUser> selectUserList(ModelUser user);
    
    int checkuserid(String chenkuserid);
}
