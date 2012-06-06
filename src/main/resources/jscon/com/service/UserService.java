package jscon.com.service;

import jscon.com.vo.User;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: shuyue@cn.ibm.com
 * Date: 12-6-6
 * Time: 下午1:35
 * To change this template use File | Settings | File Templates.
 */
public interface UserService {
    public void saveUser(User user);
    public void updateUser(User user);
    public void deleteUser(String user_id);
    public List<User> getAllUser();
}
