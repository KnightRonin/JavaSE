package Collection.Map;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @Author HuangGuoFu
 * @Date 2022/10/4 16:11
 **/


public class TreeMap02 {
    public static void main(String[] args) {
        TreeSet<Person> people = new TreeSet<>(new MyComparator());
        people.add(new Person(23));
        people.add(new Person(21));
        people.add(new Person(12));
        people.add(new Person(13));
        people.add(new Person(25));
        for (Person person : people) {
            System.out.println(person);
        }
    }
}

class Person {
    private int age;

    public Person(int age) {
        this.age = age;
    }

    public Person() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.valueOf(age);
    }

}

// 自定义比较器实现Comparator接口
class MyComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        // 定义排序规则
        return o1.getAge() - o2.getAge();
    }
}


