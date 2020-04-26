package design.architecture.proxy;

/**
 * Created by jinjunzhu on 2020/4/24.
 */
public class UserManagerProxy1 extends UserManagerImpl{

    @Override
    public void addUser(String userName, String password) {
        System.out.println("proxy addUser");
        super.addUser("zhangsan", "123456");
    }

    @Override
    public void delUser(String userName) {
        System.out.println("proxy deleteUser");
        super.delUser("zhangsan");
    }
}
