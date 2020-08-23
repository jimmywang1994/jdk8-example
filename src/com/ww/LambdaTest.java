package com.ww;

public class LambdaTest {
    public static void main(String[] args) {
        //无参无返回值
        Test01 test01 = () -> System.out.println("hello");
        test01.Test01();
        //无参有返回值
        Test02 test02 = () -> {
            int a = 2;
            return a == 2;
        };
        System.out.println(test02.test02());
        //有参无返回值
        Test03 test03 = (a, b) -> System.out.println(a + b);
        test03.test03("你好吗", "我是谁");
        //有参有返回值
        Test04 test04 = (a, b) -> a == b;
        System.out.println(test04.test04(2, 6));
    }

    @FunctionalInterface
    interface Test01 {
        void Test01();
    }

    @FunctionalInterface
    interface Test02 {
        boolean test02();
    }

    @FunctionalInterface
    interface Test03 {
        void test03(String a, String b);
    }

    @FunctionalInterface
    interface Test04 {
        boolean test04(int a, int b);
    }
}
