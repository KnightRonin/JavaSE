package reflect;

/**
 * @Author HuangGuoFu
 * @Date 2022/10/9 12:49
 **/

// 获取Class的三种方式
public class ReflectTest01 {
    public static void main(String[] args) {
        // 第一种：Class.foName()
        Class name = null;
        try {
            name = Class.forName("java.lang.String");
            System.out.println(name);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // 第二种：java任何对象都有一个getClass()方法
        String s = "string";
        Class x = s.getClass();
        System.out.println(name == x);

        // 第三种：java中任何一种数据类型都有class属性
        Class i = Integer.class;
        System.out.println(i);
    }
}
