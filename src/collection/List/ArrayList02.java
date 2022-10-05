package collection.List;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

/**
 * @Author HuangGuoFu
 * @Date 2022/10/5 9:50
 **/


public class ArrayList02 {
    public static void main(String[] args) {
        // 默认初始化容量为10
        ArrayList<String> strings = new ArrayList<>();
        // 向集合的末尾添加元素
        strings.add("a");
        strings.add("b");
        strings.add("c");
        strings.add("d");
        // 遍历元素
        // 1.使用迭代器遍历元素
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }
        // 2.ArrayList特有的遍历方式
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }

        // 集合中常用的方法
        // 1、add(int index, E element)
        // 在此列表中的指定位置插入指定的元素
        strings.add(0, "d");

        // 2、contains(Object o)
        // 如果此列表包含指定的元素，则返回 true
        System.out.println(strings.contains("a"));

        // 3、get(int index)
        // 返回此列表中指定位置的元素。
        System.out.println(strings.get(0));

        // 4、indexOf(Object o)
        // 返回此列表中指定元素的第一次出现的索引，如果此列表不包含元素，则返回-1。
        System.out.println(strings.indexOf("a"));

        // 5、isEmpty()
        //如果此列表不包含元素，则返回 true
        System.out.println(strings.isEmpty());

        // 6、remove(int index)
        // 删除该列表中指定位置的元素。
        System.out.println(strings.remove(0));

        // 7、set(int index, E element)
        // 用指定的元素替换此列表中指定位置的元素
        System.out.println(strings.set(2, "e"));

        // 8、size()
        // 返回此列表中的元素数。
        System.out.println(strings.size());

        // 9、sort(Comparator<? super E> c) 没有返回值
        // 使用提供的 Comparator对此列表进行排序以比较元素。
        strings.sort(Comparator.naturalOrder());
        // 10、clear() 从列表中删除所有元素。
        strings.clear();
        System.out.println(strings.size());
    }
}
