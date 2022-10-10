package reflect;

import java.io.FileReader;
import java.io.InputStream;
import java.util.Properties;

/**
 * @Author HuangGuoFu
 * @Date 2022/10/9 11:41
 **/

// 反射机制之以流的形式返回
public class ReflectTest04 {
    public static void main(String[] args) throws Exception{
//        String path = Thread.currentThread().getContextClassLoader().
//                getResource("config.properties").getPath();
        // 以流的形式返回
        InputStream reader = Thread.currentThread().getContextClassLoader().getResourceAsStream("config.properties");
        System.out.println(reader);
        Properties properties = new Properties();
        properties.load(reader);
        reader.close();
        String className = properties.getProperty("className");
        System.out.println(className);

    }
}
