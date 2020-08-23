package com.ww;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * 方法引用：lambda体已经有方法实现了，就可以使用方法引用的方式直接调用
 */
public class ReferenceTest {
    public static void main(String[] args) {
        Consumer<String> consumer = a -> System.out.println(a);
        //对象::实例方法名
        Consumer<String> consumer1 = System.out::println;
        consumer1.accept("233");
        //类::静态方法名
        Function<String, Integer> function1 = Integer::parseInt;
        //类::实例方法名（特殊）
        //当lambda体的第一个参数是实例方法的调用者，另一个参数是实例方法的参数时，可以使用类::实例方法名
        BiFunction<String, String, Boolean> function2 = (a, b) -> a.equals(b);
        BiFunction<String, String, Boolean> function3 = String::equals;
        //构造器引用，就是lambda体已经有相关方法实现了话，可以使用构造器引用的方式直接调用
        //类::new
        Supplier<String> supplier1 = () -> new String();
        Supplier<String> supplier2 = String::new;
        //数组引用,就是lambda体已经有相关方法实现了话，可以使用数组引用的方式直接调用
        Function<Integer, String[]> function = a -> new String[a];
        Function<Integer, String[]> function4 = String[]::new;


    }
}
