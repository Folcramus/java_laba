package org.example;

// Первый дочерний класс
class Child1 extends Parent {
    boolean field6;
    boolean field7;


    void method3() {
        System.out.println("Method 3 from Child1 class");
    }

    void method4() {

        if (field6 && field7) {
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}