package IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Author HuangGuoFu
 * @Date 2022/10/6 12:41
 **/

/*
BufferReader
    带有缓冲区的字符输入流
    使用这个流不需要自定义char数组，或者byte数组，自身自带缓冲
 */
public class BufferReader01 {
    public static void main(String[] args) {
        // 传入的是字符流
        try {
            FileReader reader = new FileReader("src/IO/File/FileInputStream");
            BufferedReader bufferedReader = new BufferedReader(reader);
            // 当一个流的构造方法中需要一个流的时候，这个传进来的流称为：节点流
            // 外部负责包装的流叫做：包装流或者处理流
            // FileReader就是一个节点流 BufferedReader就是包装流/处理流

            // 读取数据，读的是一行数据,但不带换行符，当为null的时候就已经读完数据了
            String s = null;
            while ((s = bufferedReader.readLine()) != null){
                System.out.println(s);
            }
//            String line = bufferedReader.readLine();
//            System.out.println(line);

            // 对于包装流来说，只需关闭最外面的流，节点流会自动关闭
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
