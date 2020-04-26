package design.architecture.proxy;

/**
 * Created by jinjunzhu on 2019/5/27.
 */
public class UserManagerImpl implements UserManager{

    @Override
    public void addUser(String userName, String password) {
        System.out.println("传入参数为 userName: "+userName+" password: "+password);
    }

    @Override
    public void delUser(String userName) {
        System.out.println("传入参数为 userName: "+userName);
    }
}
