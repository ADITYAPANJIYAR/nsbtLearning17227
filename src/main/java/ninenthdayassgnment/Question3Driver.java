package ninenthdayassgnment;

import eighthdayassignment.question2.customer.Customer;

public class Question3Driver {
    public static void main(String[] args) {
        //question3
        Customer[]customers=new Customer[3];
        customers[0]=new Customer(101,"c1",100000,30);
        customers[1]=new Customer(103,"c2",5000001,19);
        customers[2]=new Customer(104,"c3",5000005,50);

        CalculateIncomeAndAge calculateIncomeAndAge=(customer)->(customer.getMonthIncome()>500000 &&
                customer.getAge()>=18 &&
                customer.getAge()<=25);
        for (int i = 0; i < customers.length; i++) {
            System.out.println(calculateIncomeAndAge.calculateIncome(customers[i]));
        }
    }
}
