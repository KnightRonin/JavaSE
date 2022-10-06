package IO.File;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

/**
 * @Author HuangGuoFu
 * @Date 2022/10/6 12:56
 **/


public class BufferReader02 {
    public static void main(String[] args) throws Exception {
        // 输入的流为字节流
        FileInputStream fileInputStream = new FileInputStream("src/IO/File/FileInputStream");
        // 字节流转换为字符流
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);

        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String s = null;
        while ((s=bufferedReader.readLine()) != null){
            System.out.println(s);
        }
        bufferedReader.close();
    }
}
