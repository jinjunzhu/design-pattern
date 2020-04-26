package design.architecture.proxy;

/**
 * Created by jinjunzhu on 2020/4/24.
 */
public class UserManagerProxy implements UserManager{

    private UserManager userManager = new UserManagerImpl();

    @Override
    public void addUser(String userName, String password) {
        System.out.println("proxy addUser");
        userManager.addUser("zhangsan", "123456");
    }

    @Override
    public void delUser(String userName) {
        System.out.println("proxy deleteUser");
        userManager.delUser("zhangsan");
    }
}
