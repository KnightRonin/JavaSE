package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Author HuangGuoFu
 * @Date 2022/10/6 9:37
 **/


public class FileInputStream01 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("src/IO/file");
            byte[] bytes = new byte[100];
            while (true){
                int read = fileInputStream.read(bytes);
                if (read == -1){
                    break;
                }
                System.out.println(new String(bytes,0,read));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fileInputStream != null){
                fileInputStream.close();
            }
        }
    }
}
