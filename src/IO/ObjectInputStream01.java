package IO;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * @Author HuangGuoFu
 * @Date 2022/10/6 21:16
 **/


public class ObjectInputStream01 {
    public static void main(String[] args) throws Exception{
        // 反序列化
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("src/IO/File/Serialize"));
        Object obj = objectInputStream.readObject();
        System.out.println(obj.toString());

    }
}
