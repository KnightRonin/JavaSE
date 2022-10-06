package IO;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

/**
 * @Author HuangGuoFu
 * @Date 2022/10/6 13:20
 **/


public class DataOutputStream01 {
    public static void main(String[] args) throws Exception {
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("src/IO/File/DataOutputStream"));
        byte b = 1;
        int i = 100;
        dataOutputStream.writeByte(b);
        dataOutputStream.writeInt(i);
        dataOutputStream.flush();
        dataOutputStream.close();
    }
}
