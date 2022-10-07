package Enum;

/**
 * @Author HuangGuoFu
 * @Date 2022/9/24 23:11
 **/


public class EnumTest01 {
    public static void main(String[] args) {
        Result division = division(10, 2);
        System.out.println(division);
    }

    public static Result division(int a, int b) {
        try {
            int c = a / b;
            return Result.SUCCESS;
        } catch (Exception e) {
            return Result.FAIL;
        }
    }
}

// 枚举类
enum Result {
    SUCCESS, FAIL
}
