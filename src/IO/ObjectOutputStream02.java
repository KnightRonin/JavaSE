package IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author HuangGuoFu
 * @Date 2022/10/6 21:28
 **/

// 序列化多个对象 序列化集合
public class ObjectOutputStream02 {
    public static void main(String[] args) {
        ObjectOutputStream obs = null;
        List<User> users = new ArrayList<>();
        users.add(new User("ZhangSan"));
        users.add(new User("LiSi"));
        users.add(new User("WangWu"));

        try {
            obs = new ObjectOutputStream(new FileOutputStream("src/IO/File/SerializeList"));
            obs.writeObject(users);
            obs.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (obs != null){
                try {
                    obs.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}

class User implements Serializable {
    private static final long serialVersionUID = -1695060773627883882L;
    private String name;

    public User(String name) {
        this.name = name;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
