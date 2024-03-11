package fouthdayassignment;

public class User {
    private String name;
    private int age;
    private String address;

    //methods...
    public void setInfo(String name, int age){
        this.name=name;
        this.age=age;

    }

    public void setInfo(String name, int age, String address){
        setInfo(name,age);
        this.address=address;
    }

    //constructors...
    public User() {
        name="unknown";
        age=0;
        address="not available";
    }

    //getters ans setters...
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
