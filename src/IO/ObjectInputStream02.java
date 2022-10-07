package IO;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

/**
 * @Author HuangGuoFu
 * @Date 2022/10/6 21:16
 **/


public class ObjectInputStream02 {
    public static void main(String[] args) throws Exception{
        // 反序列化
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("src/IO/File/SerializeList"));
//        Object obj = objectInputStream.readObject();
//        System.out.println(obj.toString());
//        System.out.println(obj instanceof List); true
        List<User> userList = (List<User>) objectInputStream.readObject();
        for (User user : userList) {
            System.out.println(user);
        }
        objectInputStream.close();
    }
}
