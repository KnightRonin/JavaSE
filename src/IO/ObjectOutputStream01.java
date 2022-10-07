package IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @Author HuangGuoFu
 * @Date 2022/10/6 19:12
 **/

/*
    序列化【Serialize】：内存到硬盘为序列化（将java对象存储到硬盘中）ObjectOutputStream
    反序列化【DeSerialize】：硬盘到内存为反序列化（将硬盘中的数据重新恢复到内存中）ObjectInputStream
    凡是参与序列化的类型都必须实现Serialize接口【标志接口】
    java虚拟机看到这个接口后，会自动为该类生成一个序列化版本号

    序列化版本号有什么用？

 */
public class ObjectOutputStream01 {
    public static void main(String[] args) {
        Student student = new Student("zhangSan");
        ObjectOutputStream objectOutputStream = null;
        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream("src/IO/File/Serialize"));
            objectOutputStream.writeObject(student);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                objectOutputStream.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (objectOutputStream != null) {
                try {
                    objectOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class Student implements Serializable {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}