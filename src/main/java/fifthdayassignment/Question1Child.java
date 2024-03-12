package fifthdayassignment;

public class Question1Child extends Question1Parent {
    @Override
    public void print(){
        System.out.println("This is Child class");
    }

    public Question1Child() {
        System.out.println("Question1Child constructor called");
    }
}
