package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author HuangGuoFu
 * @Date 2022/10/6 11:34
 **/


public class FileCopyTest01 {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            // fileInputStream 可以统计字节的数量 不建议使用在大数据的环境下
            byte[] input = new byte[1024];
            int readCount = 0;
            fileInputStream = new FileInputStream("src/IO/File/IO流笔记");
            fileOutputStream = new FileOutputStream("src/IO/File/FileCopy");
            while ((readCount = fileInputStream.read(input)) != -1){
                fileOutputStream.write(input,0,readCount);
            }
            fileOutputStream.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null){
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileOutputStream != null ){
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
