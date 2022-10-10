package reflect;

import java.lang.reflect.Method;

/**
 * @Author HuangGuoFu
 * @Date 2022/10/9 15:00
 **/

// 反射机制之反射方法Method
public class ReflectTest05 {
    public static void main(String[] args) throws Exception{
        Class c = Class.forName("reflect.TestService");
        Method[] methods = c.getDeclaredMethods();
        System.out.println(methods.length);
        for (Method method : methods) {
            // 获取修饰符列表
            System.out.println(method.getModifiers());
            // 获取方法返回值类型
            Class returnType = method.getReturnType();
            // Class returnType = method.getReturnType().getSimpleName(); 包括私有的
            System.out.print(returnType+"：");
            // 获取方法名
            System.out.println(method.getName());
            // 方法的修饰符列表
            Class[] parameterTypes = method.getParameterTypes();
            for (Class parameterType : parameterTypes) {
                System.out.println(parameterType.getSimpleName());
            }

        }
    }
}
