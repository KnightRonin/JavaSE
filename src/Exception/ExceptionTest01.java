package Exception;

/**
 * @Author HuangGuoFu
 * @Date 2022/9/26 9:45
 **/


public class ExceptionTest01 {
    public static void main(String[] args) {
        Exception02 ex = new Exception02("自定义异常");
        ex.printStackTrace();
        String msg = ex.getMessage();
        System.out.println(msg);
    }
}
