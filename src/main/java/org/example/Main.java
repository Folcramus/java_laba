package org.example;

class Parent {
    String field1;
    String field2;
    int field3;
    int field4;
    double field5;

    void method1() {
        System.out.println("Method 1 from Parent class");
    }

    void method2() {
        System.out.println("Method 2 from Parent class");
    }
}

// Первый дочерний класс
class Child1 extends Parent {
    boolean field6;
    boolean field7;

    void method3() {
        System.out.println("Method 3 from Child1 class");
    }

    void method4() {
        System.out.println("Method 4 from Child1 class");
    }
}

// Второй дочерний класс
class Child2 extends Child1 {
    char field8;
    char field9;

    void method5() {
        System.out.println("Method 5 from Child2 class");
    }

    void method6() {
        System.out.println("Method 6 from Child2 class");
    }
}

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child1 child1 = new Child1();
        Child2 child2 = new Child2();

        parent.method1();
        child1.method3();
        child2.method3();
    }
}