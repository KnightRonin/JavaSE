package collection.Map;


import java.util.*;

/**
 * @Author HuangGuoFu
 * @Date 2022/10/4 11:36
 **/


public class HashMap01 {
    /**
     * 哈希表使用不当无法发挥性能
     * 假设将所有的hashCode()方法返回值设定为某个固定值，那么会导致哈希表变成纯单向链表，这种情况我们称为散列分布不均匀
     * 什么是散列分布均匀？
     * 假设有100个元素，10个单向链表，那么每个单向链表有10个节点，这是最好的
     * 假设hashCode()设定返回的值都是不一样的，那么哈希表就会变成纯的一维数组
     * 所以要使散列分布均匀，重写hashCode()方法是，需要些技巧
     */
    public static void main(String[] args) {
        Student st = new Student("zhangSan");
        Student st2 = new Student("zhangSan");
        Map<Integer, String> map = new HashMap<>();
        Set<Student> set1 = new HashSet<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(4, "d");
        map.put(5, "e");
        map.put(5, "f"); // 这个key重复，新的value会覆盖旧的value
        set1.add(st);
        set1.add(st2);
        System.out.println(set1.size());
        System.out.println("集合中的元素个数为：" + map.size());
        // 将map集合转换为set集合
        Set<Map.Entry<Integer, String>> set = map.entrySet();
        // foreach遍历
        for (Map.Entry<Integer, String> entry : set) {
            System.out.println(entry);
        }
        System.out.println("======================");
        // 迭代器遍历
        Iterator<Map.Entry<Integer, String>> iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> next = iterator.next();
            System.out.println(next.getKey() + "=" + next.getValue());
        }

        // 存储对象的时候重写equals和hashCode方法

    }
}
class Student{
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

