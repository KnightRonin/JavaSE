package thread.线程安全同步机制;

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
        // 使用线程同步机制 括号里面只要是共享对象就行，这很重要重要，实例变量可以但局部变量不行
        synchronized (this){
            double before = this.getBalance();
            double after = before-money;
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.setBalance(after);
        }

    }
}
