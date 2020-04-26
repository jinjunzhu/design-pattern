package design.architecture.proxy;

/**
 * Created by jinjunzhu on 2019/5/27.
 */
public interface UserManager {
    //新增用户抽象方法
    void addUser(String userName, String password);
    //删除用户抽象方法
    void delUser(String userName);
}
