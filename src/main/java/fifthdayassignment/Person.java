package fifthdayassignment;

public class Person {
    private String name;
    private String address;
    @Override
    public String toString(){
        return ("Person[name="+name+",address="+address);
    }


    //constructors...
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Person() {
    }
    //getters and setters...

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
