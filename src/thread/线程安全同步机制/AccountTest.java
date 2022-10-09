package thread.线程安全同步机制;

/**
 * @Author HuangGuoFu
 * @Date 2022/10/8 11:31
 **/


public class AccountTest {
    public static void main(String[] args) {
        // 不使用线程同步机制
        Account act = new Account("账号1",10000);;
        Thread t1 = new AccountThread(act);
        Thread t2 = new AccountThread(act);
        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        t2.start();
    }
}
