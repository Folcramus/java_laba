package org.example;







public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child1 child1 = new Child1();
        Child2 child2 = new Child2();

        parent.field1 = "sdfsdf";

        parent.field2 = "fdgdfg";

        parent.field3 = 34543;

        parent.field4 = 234;

        parent.field5 = 455.3;

        child1.field6 = true;

        child1.field7 = true;

        child2.field8 = 'd';

        child2.field9 = 'r';



        parent.method1();
        child1.method4();
        child2.method6();
    }
}