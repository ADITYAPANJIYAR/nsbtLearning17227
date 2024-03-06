package tenthdayassignment;

import eighthdayassignment.question2.enumpkg.PropertyOwnership;
import eighthdayassignment.question2.enumpkg.AssetCategory;
import eighthdayassignment.question2.loanproductpkg.ConsumerVehicleLoan;
import eighthdayassignment.question2.loanproductpkg.EducationLoan;
import eighthdayassignment.question2.loanproductpkg.HomeLoan;
import eighthdayassignment.question2.enumpkg.NatureOfProperty;
import eighthdayassignment.question2.enumpkg.PropertyType;

public class Question3Driver {
    public static void main(String[] args) {
        HomeLoan.HomeLoanBuilder homeLoanBuilder=new HomeLoan.HomeLoanBuilder(PropertyType.OFFICE, NatureOfProperty.RESIDENTIAL, PropertyOwnership.FREEHOLD);
        homeLoanBuilder.setBuildUpArea(45)
                .setCarPetArea(23);

        ConsumerVehicleLoan.ConsumerVehicleLoanBuilder consumerVehicleLoanBuilder=new ConsumerVehicleLoan.ConsumerVehicleLoanBuilder(AssetCategory.BIKE,"Royal Enfield");
        consumerVehicleLoanBuilder.setAssetsCost(263000)
                .setDownPayment(150000);

        EducationLoan.EducationLoanBuilder educationLoanBuilder= new EducationLoan.EducationLoanBuilder("JAVA","Nucleus");
        educationLoanBuilder.setTotalFees(32000);
    }
}
