package thread;

/**
 * @Author HuangGuoFu
 * @Date 2022/10/7 9:32
 **/


public class ThreadTest01 {
    public static void main(String[] args) {
        // main方法的为主线程
        // 新建一个分支线程
        // 启动线程
        // start方法的作用是：启动一个分支线程，在JVM中开辟一个新的栈空间，这段代码结束后，瞬间就结束了
        // 这端代码的作用只是为了开辟一个新的空间，只要新的栈空间开出来，start()方法就结束了，线程就启动成功了
        // 启动成功的线程会主动调用run方法，并且run方法在新栈的最底部 和主线程的main方法同级
        MyThread myThread = new MyThread();
        myThread.start();
        for (int i = 0; i < 2; i++) {
            System.out.println("主线程-->" + i);
        }
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        // 编写程序，执行分支线程
        for (int i = 0; i < 2; i++) {
            System.out.println("分支线程-->" + i);
        }
    }
}
