package eighthdayassignment.question2.loanproductpkg;
import eighthdayassignment.question2.enumpkg.AssetCategory;

enum AssetVariant{
    PETROL, DIESEL, CNG
}
public class ConsumerVehicleLoan extends LoanProduct {

    AssetCategory assetCategory;
    AssetVariant assetVariant;
    private String assetModel;
    private String manufacturer;
    private int yearOfManufacture;
    private double assetsCost;
    private double downPayment;
    @Override
    public double ltvCalculateAsPerCollateralType(double loanAmountAsked) {
        System.out.println("ConsumerVehicleLoan called");
        return (loanAmountAsked/assetsCost);
    }

    //constructors...
    public ConsumerVehicleLoan(double assetsCost) {
        this.assetsCost=assetsCost;
    }
    public ConsumerVehicleLoan(String loanProductCode, String loanProductName, String assetModel, String manufacturer) {
        super(loanProductCode, loanProductName);
        this.assetModel = assetModel;
        this.manufacturer = manufacturer;
    }

    //getter and setters...

    public AssetCategory getAssetCategory() {
        return assetCategory;
    }

    public void setAssetCategory(AssetCategory assetCategory) {
        this.assetCategory = assetCategory;
    }

    public AssetVariant getAssetVariant() {
        return assetVariant;
    }

    public void setAssetVariant(AssetVariant assetVariant) {
        this.assetVariant = assetVariant;
    }

    public String getAssetModel() {
        return assetModel;
    }

    public void setAssetModel(String assetModel) {
        this.assetModel = assetModel;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public double getAssetsCost() {
        return assetsCost;
    }

    public void setAssetsCost(double assetsCost) {
        this.assetsCost = assetsCost;
    }

    public double getDownPayment() {
        return downPayment;
    }

    public void setDownPayment(double downPayment) {
        this.downPayment = downPayment;
    }


    //inner class...
    public static class ConsumerVehicleLoanBuilder{
        AssetCategory assetCategory;
        AssetVariant assetVariant;
        private String assetModel;
        private String manufacturer;
        private int yearOfManufacture;
        private double assetsCost;
        private double downPayment;

        public ConsumerVehicleLoanBuilder(AssetCategory assetCategory, String assetModel) {
            this.assetCategory = assetCategory;
            this.assetModel = assetModel;
        }

        public ConsumerVehicleLoanBuilder setAssetVariant(AssetVariant assetVariant) {
            this.assetVariant = assetVariant;
            return this;
        }

        public ConsumerVehicleLoanBuilder setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
            return this;
        }

        public ConsumerVehicleLoanBuilder setYearOfManufacture(int yearOfManufacture) {
            this.yearOfManufacture = yearOfManufacture;
            return this;
        }

        public ConsumerVehicleLoanBuilder setAssetsCost(double assetsCost) {
            this.assetsCost = assetsCost;
            return this;
        }

        public ConsumerVehicleLoanBuilder setDownPayment(double downPayment) {
            this.downPayment = downPayment;
            return this;
        }
    }
}
