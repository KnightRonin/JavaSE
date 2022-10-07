package Collection.List;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @Author HuangGuoFu
 * @Date 2022/10/5 10:38
 **/

/*
LinkList是非线程安全的
 */
public class LinkList01 {
    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<>();
        // 1、add(E e)
        // 将指定的元素追加到此列表的末尾。
        strings.add("a");
        strings.add("b");
        strings.add("c");

        // 2、add(int index, E element)
        // 在此列表中的指定位置插入指定的元素
        strings.add(2,"d");

        // 3、addFirst(E e)
        //在该列表开头插入指定的元素
        strings.addFirst("e");

        // 4、get(int index)
        //返回此列表中指定位置的元素
        System.out.println(strings.get(0));

        // 5、indexOf(Object o)
        //返回此列表中指定元素的第一次出现的索引，如果此列表不包含元素，则返回-1。
        System.out.println(strings.indexOf("a"));

        // 6、pop()
        //从此列表表示的堆栈中弹出一个元素。
        System.out.println(strings.pop());

        // 7、push(E e)
        //将元素推送到由此列表表示的堆栈上
        strings.push("f");

        // 8、set(int index, E element)
        //用指定的元素替换此列表中指定位置的元素。
        System.out.println(strings.set(1,"g"));

        // 9、size()
        //返回此列表中的元素数。
        System.out.println(strings.size());

        // LinkedList遍历
        // 1、迭代器遍历
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        // 2、普通遍历
        for (String string : strings) {
            System.out.println(string);
        }

    }
}
