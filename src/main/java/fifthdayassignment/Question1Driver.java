package fifthdayassignment;

public class Question1Driver {
    public static void main(String[] args) {
        Question1Parent p1=new Question1Parent();
        Question1Child c1=new Question1Child();
        p1.print();
        c1.print();
        DemoConstructorCalling d1=new DemoConstructorCalling();
        d1.print();

//        Question 4
//        Parent parent1=new Parent(); abstract class do not have objects.
//        parent1.message(); for previous question.
        Parent class1=new Class1();
        class1.message();
        Parent class2=new Class2();
        class2.message();


    }

}
