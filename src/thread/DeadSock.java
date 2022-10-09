package thread;

/**
 * @Author HuangGuoFu
 * @Date 2022/10/8 15:50
 **/


public class DeadSock {
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();
        myThread1 myThread1 = new myThread1(o1, o2);
        myThread2 myThread2 = new myThread2(o1, o2);
    
        myThread1.start();
        myThread2.start();
    }
}

class myThread1 extends Thread{
    Object o1;
    Object o2;

    public myThread1(Object o1, Object o2) {
        this.o1 = o1;
        this.o2 = o2;
    }
    @Override
    public void run() {
        synchronized (o2){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (o1){

            }
        }
    }
}

class myThread2 extends Thread{
    Object o1;
    Object o2;

    public myThread2(Object o1, Object o2) {
        this.o1 = o1;
        this.o2 = o2;
    }
    @Override
    public void run() {
        synchronized (o1){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (o2){

            }
        }
    }
}