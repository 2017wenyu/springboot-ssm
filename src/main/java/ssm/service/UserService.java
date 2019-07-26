package ssm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ssm.dao.UserDao;
import ssm.pojo.User;

import java.util.List;

/**
 * @author wangsheng
 * @date 2019/7/25 0025 下午 4:52
 */

@Service
public class UserService {

    @Autowired
    UserDao userDao;

    public List<User> findAll(){
        return userDao.findAll();
    }

    public List<User> getUserByAge(int age){
        return userDao.getUserByAge(age);
    }

    public User gerUser(int id){
        return userDao.getUserById(id);
    }

    public void updateUser(User user){
        userDao.updateUser(user);
    }

    public void addUser(User user){
        userDao.addUser(user);
    }

    public void deleteUser(int id){
        userDao.deleteUser(id);
    }
}
