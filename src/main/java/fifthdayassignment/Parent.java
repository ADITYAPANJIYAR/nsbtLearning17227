package fifthdayassignment;

public abstract class Parent {
    public abstract void message();

}

class Class1 extends Parent{
    @Override
    public void message(){
        System.out.println("This is first subclass");
    }
}
class Class2 extends Parent{
    @Override
    public void message(){
        System.out.println("This is second subclass");
    }
}
