package ssm.dao;

import org.apache.ibatis.annotations.*;
import ssm.pojo.User;

import java.util.List;

/**
 * @author wangsheng
 * @date 2019/7/25 0025 下午 4:52
 */

@Mapper
public interface UserDao {

    @Select("select * from user")
    List<User> findAll();

    @Select("select * from user where age = #{age}")
    List<User> getUserByAge(int age);

    @Select("select * from user where userId = #{id}")
    User getUserById(int id);

    @Insert("insert into user(userName,age) values (#{userName},#{age})")
    void addUser(User user);

    @Update("update user set userName = #{userName},age = #{age} where userId = #{userId}")
    void updateUser(User user);

    @Delete(("delete from user where userId = #{id}"))
    void deleteUser(Integer id);
}
