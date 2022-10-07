package Collection.List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/**
 * @Author HuangGuoFu
 * @Date 2022/10/1 21:34
 **/


public class ArrayList01 {
    public static void main(String[] args) {
        // 默认初始化容量为10
        Collection myList = new ArrayList();
        // 初始化容量为100
        Collection myList2 = new ArrayList(100);
        Collection c = new HashSet();
        c.add(1);
        c.add(2);
        c.add(3);
        c.add(4);
        List myList3 = new ArrayList(c);
        for (int i = 0;i<myList3.size();i++) {
            System.out.println(myList3.get(i));
        }


    }
}
