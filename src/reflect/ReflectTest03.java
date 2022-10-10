package reflect;

import java.lang.reflect.Field;

/**
 * @Author HuangGuoFu
 * @Date 2022/10/9 14:47
 **/

// 通过反射机制获取对象属性
public class ReflectTest03 {
    public static void main(String[] args) throws Exception{
        // 获得类属性
        Class c = Class.forName("reflect.User");
        // 调用User的无参构造方法
        Object o = c.newInstance();
        // 获得类中的属性
        Field no = c.getDeclaredField("no");
        Field name = c.getDeclaredField("name");
        Field age = c.getDeclaredField("age");
        Field sex = c.getDeclaredField("sex");
        // 给属性赋值
        /*
        虽然使用了反射机制，但是三要素缺一不可
            要素1：o对象
            要素2：no属性
            要素3: 222值
         */
        // 给公共属性赋值
        no.set(o,222);
        // 给私有属性赋值
        name.setAccessible(true); // 打破私有属性
        name.set(o,"LiSi");
        // 获取属性值
        System.out.println(no.get(o));
        System.out.println(name.get(o));
    }
}
