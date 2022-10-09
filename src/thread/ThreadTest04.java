package thread;

/**
 * @Author HuangGuoFu
 * @Date 2022/10/7 15:58
 **/

// 线程休眠,使当前线程进入休眠，进入阻塞状态，放弃占有CPU时间片，让给其他线程使用
public class ThreadTest04 {
    public static void main(String[] args) throws InterruptedException {
        MyThread4 myThread4 = new MyThread4();
        // 出现在哪个线程，哪个线程就睡觉，进行阻塞状态
        Thread.sleep(5000);
        myThread4.start();
    }
}

class MyThread4 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + i);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}