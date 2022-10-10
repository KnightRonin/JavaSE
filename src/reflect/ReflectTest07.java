package reflect;

import java.lang.reflect.Method;

/**
 * @Author HuangGuoFu
 * @Date 2022/10/9 15:50
 **/

// 通过反射机制调用方法
public class ReflectTest07 {
    public static void main(String[] args) throws Exception {
        Class c = Class.forName("reflect.TestService");
        Object o = c.newInstance();
        /*
        要素
            对象
            方法名
            实参列表
            返回值
         */
        Method login = c.getDeclaredMethod("login", String.class, String.class);
        // login调用o的login方法参数为admin，123456
        Object admin = login.invoke(o, "admin", "123456");
        System.out.println(admin);

    }
}
