package seventhdayassignment;

public class LoanNotApprovedException extends RuntimeException{
    public LoanNotApprovedException(String s){
        super(s);
    }
}
