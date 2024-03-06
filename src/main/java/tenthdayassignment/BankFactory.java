package tenthdayassignment;

import eighthdayassignment.question2.bank.Bank;
import eighthdayassignment.question2.interfacepkg.Maker;
import eighthdayassignment.question2.interfacepkg.Operator;

public class BankFactory {
    public static Maker getMakerInstance(){
        return Bank.getInstance();
    }
    public static Operator getOperatorInstance() {
        return Bank.getInstance();
    }
}
