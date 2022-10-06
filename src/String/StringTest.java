package String;

/**
 * @Author HuangGuoFu
 * @Date 2022/9/24 10:57
 **/

public class StringTest {
    public static void main(String[] args) {
        // StringBuffer的默认长度为16
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("abcd");
        System.out.println(stringBuffer);
        String s = "abcd";
        System.out.println(s.substring(2));
    }
}















