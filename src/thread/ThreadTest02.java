package thread;

/**
 * @Author HuangGuoFu
 * @Date 2022/10/7 10:56
 **/


public class ThreadTest02 {
    public static void main(String[] args) {
        MyThread2 myThread2 = new MyThread2();
        Thread thread = new Thread(myThread2);
        thread.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("主线程-->" + i);
        }
    }
}

// 这是一个可以运行的类
class MyThread2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("主线程-->" + i);
        }

    }
}
