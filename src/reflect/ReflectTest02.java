package reflect;

/**
 * @Author HuangGuoFu
 * @Date 2022/10/9 13:34
 **/

// 路劲问题，适合在任何系统上，可移植性强，在idea中默认是project的根，即src是类的根路径
public class ReflectTest02 {
    public static void main(String[] args) {
        String path = Thread.currentThread().getContextClassLoader().
                getResource("config.properties").getPath();
        System.out.println(path);
    }
}
