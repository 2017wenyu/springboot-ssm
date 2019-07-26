package ssm.controller;

import com.sun.org.glassfish.gmbal.ParameterNames;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ssm.dao.UserDao;
import ssm.pojo.User;

import java.util.List;

/**
 * @author wangsheng
 * @date 2019/7/25 0025 下午 4:51
 */

@RestController
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserDao userDao;

    @GetMapping(value = "/user")
    public List<User> selectAllUsers(){
        return userDao.findAll();
    }

    @GetMapping(value = "/user/age/{age}")
    public List<User> selectUserByAge(@PathVariable(value = "age")int age){
        return userDao.getUserByAge(age);
    }

    @GetMapping(value = "/user/{id}")
    public User selectUser(@PathVariable(value = "id")int id){
        return userDao.getUserById(id);
    }

    @PostMapping("/user")
    public void addUser(@RequestParam("name")String name,@RequestParam("age")int age){

        User user = new User();
        user.setAge(age);
        user.setUserName(name);
        userDao.addUser(user);
    }

    @PutMapping("/user/{id}")
    public void update(@PathVariable("id")int id,@RequestParam("name")String name,@RequestParam("age")int age){

        User user = userDao.getUserById(id);
        user.setUserName(name);
        user.setAge(age);
        logger.info("这是更新信息"+user);
        logger.debug("这是一个调试信息");
        userDao.updateUser(user);
    }

    @DeleteMapping("/user/{id}")
    public void delete(@PathVariable("id")int id){
        userDao.deleteUser(id);
    }
}
