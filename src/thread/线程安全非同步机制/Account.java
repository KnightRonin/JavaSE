package thread.线程安全非同步机制;

/**
 * @Author HuangGuoFu
 * @Date 2022/10/8 11:22
 **/


public class Account {
    private String act;
    private double balance;

    public Account() {
    }

    public Account(String act, double balance) {
        this.act = act;
        this.balance = balance;
    }

    public String getAct() {
        return act;
    }

    public void setAct(String act) {
        this.act = act;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void withdrawal(double money) {
        double before = this.getBalance();
        double after = before-money;
        this.setBalance(after);

    }
}
