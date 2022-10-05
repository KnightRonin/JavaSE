package Date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author HuangGuoFu
 * @Date 2022/9/24 16:15
 **/

/**
 * java中对日期类型的处理
 */

public class DateTest01 {
    public static void main(String[] args) throws Exception {
        /*
            1.怎么获取系统当前时间
            2.string --> date
            3.date --> string
         */
        // date转为string
        // 格式化前
        Date date = new Date();
        System.out.println(date); // Sat Sep 24 16:20:11 CST 2022
        // 格式化后 使用SimpleDateFormat类格式化日期
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-dd");
        System.out.println(simpleDateFormat.format(date));

        // string日期转换为date
        String time = "2022-09-24 16:31:31";
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        Date date1 = simpleDateFormat1.parse(time);
        System.out.println(date1);

        // 计算程序运行的时间
        long startTime = System.currentTimeMillis();
        print();
        System.out.println("耗费"+(System.currentTimeMillis() - startTime)+"毫秒");
    }

    public static void print() {
        for (int i = 0; i < 1000000000; i++) {
        }
    }
}
