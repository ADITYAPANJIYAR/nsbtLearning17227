package seventhdayassignment;

public class CheckEligibility {
    public static void generalCondition(double loanAmountSanctioned, double maxEligibleAmount, double dbr, double emi, double maxEligibleEmi) throws LoanNotApprovedException {
        if (loanAmountSanctioned > maxEligibleAmount) {
            throw new LoanNotApprovedException("Loan amount exceeds maximum eligible amount for Home Loan");
        }
        if (dbr>=40){
            throw new LoanNotApprovedException("DBR is greater than 40%");
        }
        if(emi>maxEligibleEmi){
            throw new LoanNotApprovedException("max eligible emi is greater");
        }
    }

    public static void checkHomeLoan( int age, double ltv) throws LoanNotApprovedException {

        if (age > 60) {
            throw new LoanNotApprovedException("Applicant's age exceeds maximum eligible age for Home Loan");
        }
        if(ltv>90){
            throw new LoanNotApprovedException("Home loa can not be approved because ltv is greater than 90%");
        }
    }

    public static void checkVehicleLoan(double ltv, double minTenure) throws LoanNotApprovedException {
        if(ltv>80){
            throw new LoanNotApprovedException("Home loa can not be approved because ltv is greater than 90%");
        }
        if(minTenure<7){
            throw new LoanNotApprovedException("Minimum tenure is less than 7 years");
        }
    }

    public static void checkEducationLoan(double graduateCourse, double postGraduateCourse, int age) throws LoanNotApprovedException {
        if (age <= 18) {
            throw new LoanNotApprovedException("Applicant's age is less than minimum eligible age for Education Loan");
        }
        // Graduate Courses
        if (graduateCourse > 1000000) { // 10 lacs
            throw new LoanNotApprovedException("Graduate Education Loan is greater than 100000 ");
        }
        // Post Graduate Courses
        if (postGraduateCourse > 2000000) { // 20 lacs
            throw new LoanNotApprovedException("Post Graduate Education Loan is greater than 100000 ");
        }
    }
}
