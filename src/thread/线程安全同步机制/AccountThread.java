package thread.线程安全同步机制;

/**
 * @Author HuangGuoFu
 * @Date 2022/10/8 11:28
 **/


public class AccountThread extends Thread {
    private Account act;

    public AccountThread(Account act) {
        this.act = act;
    }

    @Override
    public void run() {
        double money = 5000;
        act.withdrawal(money);
        System.out.println(Thread.currentThread().getName() + "取款"+money+"成功" + "余额" + act.getBalance());
    }
}
