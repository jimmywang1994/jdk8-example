package com.ww;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {

    public static void main(String[] args) {
        /**
         * streamAPI操作流程
         * 1.创建stream
         * 2.中间操作
         * 3.终止操作
         */
        //创建stream
        //1.Collection的stream()方法创建
        List<Integer> list = new ArrayList<>();
        Stream<Integer> stream = list.stream();
        //2.Arrays下的静态方法创建
        int[] nums = new int[10];
        IntStream intStream = Arrays.stream(nums);
        Person[] persons = new Person[10];
        Stream<Person> personStream = Arrays.stream(persons);
        //3.Stream的静态方法of方法创建
        Stream<Integer> stream3 = Stream.of(1, 2, 3);
        //中间操作
        List<Person> personList = Arrays.asList(
                new Person("张三", 29, "shanghai"),
                new Person("李四", 20, "beijing"),
                new Person("王五", 36, "guangzhou"),
                new Person("王五", 36, "guangzhou"));
        Stream<Person> stream1 = personList.stream();
        //遍历数据 中止操作
        //stream1.forEach(System.out::println);
        //匹配流中数据是否完全符合断言式接口条件
//        boolean allMatch = stream1.allMatch(a -> a.getAge() == 29);
//        System.out.println(allMatch);
        //将流中数据进行转化  操作
        //List<Person> collect = stream1.collect(Collectors.toList());
        //stream1.collect(Collectors.toCollection(HashSet::new));
//        String collect = stream1.map(Person::getName).collect(Collectors.joining(","));
//        System.out.println(collect);
        //求和count()
        //distinct()去重 中间操作
        //stream1.distinct().forEach(System.out::println);
        //过滤器filter
        //stream1.filter(a -> a.getAge() > 30).forEach(System.out::println);
        //查找任意一个  中止操作
//        Person person=stream1.findAny().get();
//        System.out.println(person);
        //limit 截取 中间操作
        //stream1.limit(2).forEach(System.out::println);
        //map 映射 中间操作
        //stream1.map(Person::getLoc).forEach(System.out::println);
        //max() 取最大
        //Person person = stream1.max(Comparator.comparingInt(Person::getAge)).get();
        //System.out.println(person);
        //reduce 中止操作 规约
        //Integer integer = stream1.map(Person::getAge).reduce(Math::addExact).get();
        //System.out.println(integer);
        //另一种实现方式
//        Integer collect = stream1.collect(Collectors.summingInt(Person::getAge));
//        System.out.println(collect);
        //skip 跳过 中间操作
        //stream1.skip(2).forEach(System.out::println);
        //sorted 排序  中间操作
        stream1.sorted(Comparator.comparingInt(Person::getAge)).forEach(System.out::println);
    }
}
