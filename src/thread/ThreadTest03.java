package thread;

/**
 * @Author HuangGuoFu
 * @Date 2022/10/7 15:39
 **/

// 如何获取线程对象、线程的名字、修改线程的名字
public class ThreadTest03 {
    public static void main(String[] args) {
        // 创建线程对象
        MyThread3 myThread3 = new MyThread3();
        // 设置线程的名字
        myThread3.setName("线程1");
        // 获取线程的名字
        System.out.println(myThread3.getName());
        // 获取当前线程对象
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName());
        // 启动线程
        myThread3.start();
    }
}
class MyThread3 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("主线程-->" + i);
        }

    }
}


