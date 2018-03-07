package SSM.service;

import java.util.List;
import SSM.Pojo.User;
public interface UserService{

    int insert(User user);

    int insertSelective(User user);

    int insertList(List<User> users);

    int update(User user);

    User getUserById(Integer id);
}
