package reflect;

import java.util.ResourceBundle;

/**
 * @Author HuangGuoFu
 * @Date 2022/10/9 13:46
 **/

// 资源绑定器
// 但前提必须是在类路径下
public class ResourceBundleTest01 {
    public static void main(String[] args) {
        // 只能绑定以properties结尾的文件，并且该文件必须在类路径下，里面的参数不可以写properties后缀
        ResourceBundle bundle = ResourceBundle.getBundle("config");
        String className = bundle.getString("className");
        System.out.println(className);
    }
}
