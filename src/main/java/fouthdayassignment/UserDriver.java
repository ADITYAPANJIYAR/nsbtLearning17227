package fouthdayassignment;

public class UserDriver {
    public static void main(String[] args) {
        User[] users=new User[10];
        users[0]=new User();
        users[0].setInfo("Alex",31);

        for (int i = 1; i <= 8; i++) {
            users[i]=new User();
            users[i].setInfo("user"+i,i*2);
        }

        for (int i = 0; i < 9; i++) {
            System.out.println("User " + (i + 1) + ":");
            System.out.println("Name: " + users[i].getName());
            System.out.println("Age: " + users[i].getAge());
            System.out.println(); // Empty line for readability
        }
    }
}

