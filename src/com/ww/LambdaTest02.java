package com.ww;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaTest02 {
    public static void main(String[] args) {
        //四大函数式接口
        //消费型接口
        Consumer<String> consumer = System.out::println;
        consumer.accept("hello wangwei");

        //供给型接口
        Supplier<String> supplier = () -> "hello";
        System.out.println(supplier.get());

        //函数式接口
        Function<String, String> function = a -> a + "|||";
        System.out.println(function.apply("你好"));

        //断言式接口
        Predicate<String> predicate = a -> "123".equals(a);
        System.out.println(predicate.test("456"));
    }

}
