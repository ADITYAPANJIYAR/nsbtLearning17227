package seventhdayassignment;

import java.util.Scanner;

public class LoanDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // General Loan Conditions
            System.out.println("Enter loan amount sanctioned:");
            double loanAmountSanctioned = scanner.nextDouble();

            System.out.println("Enter maximum eligible amount:");
            double maxEligibleAmount = scanner.nextDouble();

            System.out.println("Enter DBR:");
            double dbr = scanner.nextDouble();

            System.out.println("Enter EMI:");
            double emi = scanner.nextDouble();

            System.out.println("Enter maximum eligible EMI:");
            double maxEligibleEmi = scanner.nextDouble();

            CheckEligibility.generalCondition(loanAmountSanctioned, maxEligibleAmount, dbr, emi, maxEligibleEmi);
            System.out.println("General loan conditions passed.");

            System.out.println("Select the type of loan you want to take:");
            System.out.println("1. Home Loan");
            System.out.println("2. Consumer Vehicle Loan");
            System.out.println("3. Education Loan");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Home Loan Conditions
                    System.out.println("Enter age:");
                    int age = scanner.nextInt();

                    System.out.println("Enter loan tenure:");
                    int tenure = scanner.nextInt();

                    System.out.println("Enter LTV:");
                    double homeLtv = scanner.nextDouble();

                    CheckEligibility.checkHomeLoan(age+tenure, homeLtv);
                    System.out.println("Home loan conditions passed.");
                    break;
                case 2:
                    // Vehicle Loan Conditions
                    System.out.println("Enter LTV for Vehicle Loan:");
                    double vehicleLtv = scanner.nextDouble();

                    System.out.println("Enter minimum tenure for Vehicle Loan:");
                    double minTenure = scanner.nextDouble();

                    CheckEligibility.checkVehicleLoan(vehicleLtv, minTenure);
                    System.out.println("Vehicle loan conditions passed.");
                    break;
                case 3:
                    // Education Loan Conditions
                    System.out.println("Enter amount for graduate course:");
                    double graduateCourse = scanner.nextDouble();

                    System.out.println("Enter amount for postgraduate course:");
                    double postGraduateCourse = scanner.nextDouble();

                    System.out.println("Enter age for education loan:");
                    int educationLoanAge = scanner.nextInt();

                    CheckEligibility.checkEducationLoan(graduateCourse, postGraduateCourse, educationLoanAge);
                    System.out.println("Education loan conditions passed.");
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }

            System.out.println("Congratulations! All loan conditions passed. Loan approved.");
        } catch (LoanNotApprovedException e) {
            System.out.println("Loan not approved: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
