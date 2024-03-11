package eighthdayassignment.question2.loanproductpkg;

import eighthdayassignment.question2.enumpkg.NatureOfProperty;
import eighthdayassignment.question2.enumpkg.PropertyOwnership;
import eighthdayassignment.question2.enumpkg.PropertyType;

enum PropertyPurpose {
    RENT, SELF
}


public class HomeLoan extends LoanProduct {
    PropertyType propertytype;
    NatureOfProperty natureOfProperty;
    PropertyPurpose propertyPurpose;
    PropertyOwnership propertyOwnership;
    private double marketValue;
    private double buildUpArea;
    private double carPetArea;
    private int propertyAge;
    @Override
    public double ltvCalculateAsPerCollateralType(double loanAmountAsked) {
        System.out.println("HomeLoan called");
        return (loanAmountAsked/marketValue);
    }

    //constructors...

    public HomeLoan(double marketValue) {
        this.marketValue=marketValue;
    }

    //getter and setters...

    public PropertyType getPropertytype() {
        return propertytype;
    }

    public void setPropertytype(PropertyType propertytype) {
        this.propertytype = propertytype;
    }

    public NatureOfProperty getNatureOfProperty() {
        return natureOfProperty;
    }

    public void setNatureOfProperty(NatureOfProperty natureOfProperty) {
        this.natureOfProperty = natureOfProperty;
    }

    public PropertyPurpose getPropertyPurpose() {
        return propertyPurpose;
    }

    public void setPropertyPurpose(PropertyPurpose propertyPurpose) {
        this.propertyPurpose = propertyPurpose;
    }

    public PropertyOwnership getPropertyOwnership() {
        return propertyOwnership;
    }

    public void setPropertyOwnership(PropertyOwnership propertyOwnership) {
        this.propertyOwnership = propertyOwnership;
    }

    public double getMarketValue() {
        return marketValue;
    }

    public void setMarketValue(double marketValue) {
        this.marketValue = marketValue;
    }

    public double getBuildUpArea() {
        return buildUpArea;
    }

    public void setBuildUpArea(double buildUpArea) {
        this.buildUpArea = buildUpArea;
    }

    public double getCarPetArea() {
        return carPetArea;
    }

    public void setCarPetArea(double carPetArea) {
        this.carPetArea = carPetArea;
    }

    public int getPropertyAge() {
        return propertyAge;
    }

    public void setPropertyAge(int propertyAge) {
        this.propertyAge = propertyAge;
    }

    //inner class...

    public static class HomeLoanBuilder{
        PropertyType propertytype;
        NatureOfProperty natureOfProperty;
        PropertyPurpose propertyPurpose;
        PropertyOwnership propertyOwnership;
        private double marketValue;
        private double buildUpArea;
        private double carPetArea;
        private int propertyAge;

        public HomeLoanBuilder(PropertyType propertytype, NatureOfProperty natureOfProperty, PropertyOwnership propertyOwnership) {
            this.propertytype = propertytype;
            this.natureOfProperty = natureOfProperty;
            this.propertyOwnership = propertyOwnership;
        }

        public HomeLoanBuilder setPropertyPurpose(PropertyPurpose propertyPurpose) {
            this.propertyPurpose = propertyPurpose;
            return this;
        }

        public HomeLoanBuilder setMarketValue(double marketValue) {
            this.marketValue = marketValue;
            return this;
        }

        public HomeLoanBuilder setBuildUpArea(double buildUpArea) {
            this.buildUpArea = buildUpArea;
            return this;
        }

        public HomeLoanBuilder setCarPetArea(double carPetArea) {
            this.carPetArea = carPetArea;
            return this;
        }

        public HomeLoanBuilder setPropertyAge(int propertyAge) {
            this.propertyAge = propertyAge;
            return this;
        }
    }
}
