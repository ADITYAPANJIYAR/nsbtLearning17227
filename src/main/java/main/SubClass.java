package main;

import eighthdayassignment.MyClass;

public class SubClass extends MyClass {
    public static void main(String[] args) {
        MyClass myClass=new MyClass();
        myClass.publicMethod();
        SubClass subClass=new SubClass();
        subClass.protectedMethod();
        subClass.publicMethod();
    }
}
