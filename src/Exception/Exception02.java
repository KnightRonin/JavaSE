package Exception;

/**
 * @Author HuangGuoFu
 * @Date 2022/9/26 9:41
 **/

/**
 * 编译时运行异常使用Exception 运行时异常使用RuntimeException
 */
public class Exception02  extends Exception{
    public Exception02() {
    }

    public Exception02(String message) {
        super(message);
    }
}

