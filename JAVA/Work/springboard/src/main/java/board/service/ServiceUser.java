package board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import board.inf.IServiceUser;
import board.inf.IUser;
import board.model.ModelUser;

@Service("serviceuser")
public class ServiceUser implements IServiceUser {
    
    @Autowired
    @Qualifier("daouser")
    private IUser dao;

    @Override
    public int insertUser(ModelUser user) {
        int result = -1;
        try {
            result = dao.insertUser(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public ModelUser login(ModelUser user) {
        ModelUser result = null;
        try {
            result = dao.login(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public int logout(String logout) {
        int result = -1;
        result = dao.logout(logout);
        return result;
    }

    @Override
    public int updateUserInfo(ModelUser whereValue, ModelUser setValue) {
        int result = -1;
        try {
            result = dao.updateUserInfo(whereValue, setValue);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public int updatePasswd(ModelUser wherepw, ModelUser setpw) {
        int result = -1;
        try {
            result = dao.updatePasswd(wherepw, setpw);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public int deleteUser(ModelUser user) {
        int result = -1;
        try {
            result = dao.deleteUser(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public ModelUser selectUserOne(ModelUser user) {
        ModelUser result = null;
        try {
            result = dao.selectUserOne(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public List<ModelUser> selectUserList(ModelUser user) {
        List<ModelUser> result = null;
        try {
            result = dao.selectUserList(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public int checkuserid(String chenkuserid) {
        int result = -1;
        result = dao.checkuserid(chenkuserid);
        return result;
    }

}
