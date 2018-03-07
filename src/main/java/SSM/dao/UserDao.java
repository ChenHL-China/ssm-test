package SSM.dao;


import org.apache.ibatis.annotations.Param;

import java.util.List;
import SSM.Pojo.User;
import org.mybatis.spring.annotation.MapperScan;

@MapperScan
public interface UserDao {

    int insert(@Param("user") User user);

    int insertSelective(@Param("user") User user);

    int insertList(@Param("users") List<User> users);

    int update(@Param("user") User user);

    User getUserById(@Param("Id") Integer Id);
}
