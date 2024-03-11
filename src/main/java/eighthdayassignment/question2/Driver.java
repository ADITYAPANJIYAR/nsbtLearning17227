package eighthdayassignment.question2;

import eighthdayassignment.Question3;
import eighthdayassignment.question2.bank.Bank;
import eighthdayassignment.question2.customer.Customer;
import eighthdayassignment.question2.interfacepkg.Maker;
import eighthdayassignment.question2.interfacepkg.Operator;

public class Driver {
    public static void main(String[] args) {
        Customer c1=new Customer(101,"John",2500,25000,24,12);
        Customer c2=new Customer(102,"Alex",3500,20000,24,12);
        Customer c3=new Customer(103,"Olivia",3500,20000,24,12);

        Maker maker;
//        Bank bank=new Bank();
        Bank bank=Bank.getInstance();
        maker=bank;
        maker.registerCustomer(c1);
        maker.registerCustomer(c2);
        maker.registerCustomer(c3);

        Operator operator;
        operator=bank;

        Bank.Question4 q1= bank.new Question4();
//        while (q1.hasNext())
//            System.out.println(q1.next());

        operator.printAllCustomer();
        q1.next();
        q1.remove();
        System.out.println("After removal 1");
        bank.printAllCustomer();
        q1.remove();
        System.out.println("After removal 2");
        bank.printAllCustomer();

    }



    public void method(){
        class methodInnerClass implements Question3{

            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Object next() {
                return null;
            }

            @Override
            public void remove() {

            }
        }
    }
    static class StaticClass implements Question3{

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Object next() {
            return null;
        }

        @Override
        public void remove() {

        }
    }
    class Temp implements Question3{

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Object next() {
            return null;
        }

        @Override
        public void remove() {

        }
    }

    //Anonmus
    Question3 ques=new Question3() {
        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Object next() {
            return null;
        }

        @Override
        public void remove() {

        }
    };

}
