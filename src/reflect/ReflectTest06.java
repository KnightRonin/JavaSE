package reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @Author HuangGuoFu
 * @Date 2022/10/9 15:27
 **/

// 反编译
public class ReflectTest06 {
    public static void main(String[] args) throws Exception {
        StringBuffer s = new StringBuffer();
        Class c = Class.forName("reflect.TestService");
        s.append(Modifier.toString(c.getModifiers()) + " class " + c.getSimpleName() + "{\n");
        Method[] methods = c.getDeclaredMethods();
        for (Method method : methods) {
            // public boolean login(String name ,String password){}
            s.append("\t");
            s.append(Modifier.toString(c.getModifiers()));
            s.append(" ");
            s.append(method.getReturnType().getSimpleName());
            s.append(" ");
            s.append(method.getName());
            s.append("(");
            Class[] parameterTypes = method.getParameterTypes();
            for (Class parameterType : parameterTypes) {
                s.append(parameterType.getSimpleName());
                s.append(",");
                s.deleteCharAt(s.length() - 1);
            }
            s.append("){}\n");
        }

        s.append("}");
        System.out.println(s);
    }
}
