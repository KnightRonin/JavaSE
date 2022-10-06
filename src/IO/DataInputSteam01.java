package IO;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @Author HuangGuoFu
 * @Date 2022/10/6 13:15
 **/


public class DataInputSteam01 {
    public static void main(String[] args) throws Exception {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream("src/IO/File/DataOutputStream"));
        byte b = dataInputStream.readByte();
        int i = dataInputStream.readInt();
        System.out.println(b);
        System.out.println(i);
        dataInputStream.close();
    }
}
