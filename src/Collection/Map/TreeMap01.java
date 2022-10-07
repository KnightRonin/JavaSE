package Collection.Map;

import java.util.TreeSet;

/**
 * @Author HuangGuoFu
 * @Date 2022/10/4 15:35
 **/

// TreeMap自定义排序规则
public class TreeMap01 {
    public static void main(String[] args) {
        // TreeMap无参数传入
        TreeSet<User> users = new TreeSet<>();
        users.add(new User("zhangSan", 20));
        users.add(new User("zhangWu", 20));
        users.add(new User("liSi", 17));
        users.add(new User("wangWu", 18));
        for (User user : users) {
            System.out.println(user);
        }
    }
}

class User implements Comparable<User> {
    private String name;
    private Integer age;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /**
     * @param o 传入的参数
     * @return
     */
    @Override
    public int compareTo(User o) {
        // c1.compareTo(o)
        if (this.age == o.age) {
            return this.name.compareTo(o.name);
        } else {
            return this.age - o.age;
        }
    }
}

