package thread;

/**
 * @Author HuangGuoFu
 * @Date 2022/10/8 9:57
 **/


public class ThreadTest05 {
    public static void main(String[] args) {
        MyThread5 myThread5 = new MyThread5();
        Thread thread = new Thread(myThread5);
        thread.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        myThread5.run = false;
    }
}

class MyThread5 implements Runnable {
    boolean run = true;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (run) {
                System.out.println(Thread.currentThread().getName() + "--->" + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                // 可能会丢失的数据在return之前保存就可以了
                return;
            }
        }
    }
}
