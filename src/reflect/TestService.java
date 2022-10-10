package reflect;

/**
 * @Author HuangGuoFu
 * @Date 2022/10/9 15:09
 **/


public class TestService {
    /**
     * 登录测试
     * @param username 用户名
     * @param password 密码
     * @return 如果返回true登录成功 返回false，登录失败
     */
    public boolean login(String username, String password){
        if ("admin".equals(username) && "123456".equals(password)){
            return true;
        }
        return false;
    }
    public void logout(){
        System.out.println("系统已经安全退出");
    }
}
