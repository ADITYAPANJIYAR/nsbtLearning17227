package eighthdayassignment.question2.enumpkg;

public enum Frequency {
    YEARLY(1),
    HALFYEARLY(2),
    QUATERLY(3),
    MONTHLY(12);

    private int numberOfPayment;
    public int getNumberOfPayment() {
        return numberOfPayment;
    }

    Frequency(int numberOfPayment) {
        this.numberOfPayment = numberOfPayment;
    }

}
