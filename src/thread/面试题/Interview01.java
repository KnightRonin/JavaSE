package thread.面试题;

/**
 * @Author HuangGuoFu
 * @Date 2022/10/8 14:37
 **/


public class Interview01 {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        Thread t1 = new MyThread6(myClass);
        Thread t2 = new MyThread6(myClass);
        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        t2.start();
    }
}

class MyThread6 extends Thread {
    private MyClass mc;

    public MyThread6(MyClass mc) {
        this.mc = mc;
    }

    @Override
    public void run() {
        if (Thread.currentThread().getName().equals("t1")) {
            mc.doSome();
        }
        if (Thread.currentThread().getName().equals("t2")) {
            mc.doOther();
        }
    }

}

class MyClass {
    public synchronized void doSome() {
        System.out.println(Thread.currentThread().getName() + "--》doSome begin");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "--》doSome over");
    }

    public void doOther() {
        System.out.println(Thread.currentThread().getName() + "--》doOther begin");
        System.out.println(Thread.currentThread().getName() + "--》doOther over");
    }
}

