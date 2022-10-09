package reflect;

import java.io.FileReader;
import java.util.Properties;

/**
 * @Author HuangGuoFu
 * @Date 2022/10/9 11:41
 **/

// 反射机制
public class ReflectTest01 {
    public static void main(String[] args) throws Exception{
        String path = Thread.currentThread().getContextClassLoader().
                getResource("config.properties").getPath();
        System.out.println(path);
        FileReader fileReader = new FileReader(path);
        Properties properties = new Properties();
        properties.load(fileReader);
        fileReader.close();
        String className = properties.getProperty("className");
        System.out.println(className);

    }
}
