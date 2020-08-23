package com.ww;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        List<Person> personList = Arrays.asList(
                new Person("张三", 29, "shanghai"),
                new Person("李四", 20, "beijing"),
                new Person("王五", 36, "guangzhou"));
        System.out.println("排序前");
        for (Person person : personList) {
            System.out.println(person);
        }
        //JDK1.8前实现排序
//        Collections.sort(personList, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return Integer.compare(
//                        o1.getAge(), o2.getAge()
//                );
//            }
//        });
        Collections.sort(personList,(o1, o2) -> Integer.compare(o1.getAge(), o2.getAge()));
        System.out.println("lamba表达式排序后");
        for (Person person : personList) {
            System.out.println(person);
        }
    }
}
