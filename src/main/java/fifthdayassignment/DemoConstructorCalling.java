package fifthdayassignment;

public class DemoConstructorCalling extends Question1Child{
    @Override
    public void print(){
        System.out.println("This is DemoConstructorCalling class");
    }
    public DemoConstructorCalling() {
        System.out.println("DemoConstructorCalling constructor called");
    }
}
