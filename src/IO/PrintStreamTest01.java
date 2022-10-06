package IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * @Author HuangGuoFu
 * @Date 2022/10/6 13:48
 **/


public class PrintStreamTest01 {
    public static void main(String[] args) {
        PrintStream printStream = System.out;
        printStream.println("PrintStream");
        try {
            // 标准输出流不在指向控制台，而是指向指定的输出文件
            PrintStream printStream1 = new PrintStream(new FileOutputStream("src/IO/File/print"));
            System.setOut(printStream1);
            System.out.println("Success");
            System.out.println("PrintStream");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
