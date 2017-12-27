package board.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import board.inf.IUser;
import board.model.ModelUser;

@Repository("daouser")
public class DaoUser implements IUser {

    @Autowired
    @Qualifier("sqlSession")
    private SqlSession session;

    @Override
    public int insertUser(ModelUser user) {
        int result = -1;
        result = session.insert("mapper.mapperUser.insertUser", user);
        return result;
    }

    @Override
    public ModelUser login(ModelUser user) {
        ModelUser result = null;
        result = session.selectOne("mapper.mapperUser.login", user);
        return result;
    }

    @Override
    public int logout(String logout) {
        int result = -1;
        result = session.update(null);
        return result;
    }

    @Override
    public int updateUserInfo(ModelUser whereValue, ModelUser setValue) {
        int result = -1;
        Map<String, Object> map = new HashMap<>();
        map.put("whereValue", whereValue);
        map.put("updateValue", setValue);
        
        result = session.update("mapper.mapperUser.updateUserInfo", map);
        return result;
    }

    @Override
    public int updatePasswd(ModelUser searchValue, ModelUser updateValue) {
        int result = -1;
        Map<String, Object> map = new HashMap<>();
        map.put("searchValue", searchValue);
        map.put("updateValue", updateValue);
        
        result = session.update("mapper.mapperUser.updatePasswd", map);
        return result;
    }

    @Override
    public int deleteUser(ModelUser user) {
        int result = -1;
        result = session.update("mapper.mapperUser.deleteUser",user);
        return result;
    }

    @Override
    public ModelUser selectUserOne(ModelUser user) {
        ModelUser result = null;
        result = session.selectOne("mapper.mapperUser.selectUserOne", user);
        return result;
    }

    @Override
    public List<ModelUser> selectUserList(ModelUser user) {
        List<ModelUser> result = null;
        result = session.selectList("mapper.mapperUser.selectUserList", user);
        return result;
    }

    @Override
    public int checkuserid(String chenkuserid) {
        int result = -1;
        result = session.selectOne("mapper.mapperUser.checkuserid",chenkuserid);
        return result;
    }

}
