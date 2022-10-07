package IO;

import java.io.FileReader;
import java.util.Properties;

/**
 * @Author HuangGuoFu
 * @Date 2022/10/7 8:23
 **/

/*
    以后把经常改变的数据，可以将它放到一个文件中，动态获取，以后只需要修改这个文件，程序就可以动态获取数据
    这个文件里面的内容以key=value的形式存在。也叫属性配置文件。
 */
public class IoPropertiesTest01 {
    public static void main(String[] args) throws Exception{
        // 新建一个输入流
        FileReader fileReader = new FileReader("src/IO/userInfo.properties");
        // 新建一个集合接收数据
        Properties properties = new Properties();
        properties.load(fileReader);

        System.out.println(properties.getProperty("username"));
        System.out.println(properties.get("password"));

    }
}
