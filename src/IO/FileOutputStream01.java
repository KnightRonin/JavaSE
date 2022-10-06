package IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author HuangGuoFu
 * @Date 2022/10/6 11:18
 **/


public class FileOutputStream01 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = null;
        try {
            // 这种方式会将源文件清空，重新写入
//            fileOutputStream = new FileOutputStream("src/IO/FileOutputStream");
            byte[] bytes = {97,98,99,100,100};
            String s = "我是文件输入流";
            byte[] string = s.getBytes();
            // 这种是以追加的方式写到文件末尾，true不会清空原文件
            fileOutputStream = new FileOutputStream("src/IO/File/FileOutputStream",true);
            fileOutputStream.write(bytes);
            fileOutputStream.write(string);
            // 写完后一定要刷新
            fileOutputStream.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fileOutputStream != null){
                fileOutputStream.close();
            }
        }
    }
}
