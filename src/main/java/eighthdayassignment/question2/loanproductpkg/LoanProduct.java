package eighthdayassignment.question2.loanproductpkg;

public abstract class LoanProduct {
    private String loanProductCode;
    private String loanProductName;
    private boolean assetBased;
    private String loanSecurityType;
    private double minTenure;
    private double maxTenure;
    private double roi;
    private int ltv;

    @Override
    public boolean equals(Object obj){
        return (obj instanceof LoanProduct && this.loanProductCode==((LoanProduct) obj).loanProductCode);
    }

    public abstract double ltvCalculateAsPerCollateralType(double loanAmountAsked);

    //constructors...

    protected LoanProduct() {
    }

    protected LoanProduct(String loanProductCode, String loanProductName) {
        this.loanProductCode = loanProductCode;
        this.loanProductName = loanProductName;
    }

    //getter and setters...
    public String getLoanProductCode() {
        return loanProductCode;
    }

    public void setLoanProductCode(String loanProductCode) {
        this.loanProductCode = loanProductCode;
    }

    public String getLoanProductName() {
        return loanProductName;
    }

    public void setLoanProductName(String loanProductName) {
        this.loanProductName = loanProductName;
    }

    public double getMinTenure() {
        return minTenure;
    }

    public void setMinTenure(double minTenure) {
        this.minTenure = minTenure;
    }

    public double getMaxTenure() {
        return maxTenure;
    }

    public void setMaxTenure(double maxTenure) {
        this.maxTenure = maxTenure;
    }

    public double getRoi() {
        return roi;
    }

    public void setRoi(double roi) {
        this.roi = roi;
    }

    public int getLtv() {
        return ltv;
    }

    public void setLtv(int ltv) {
        this.ltv = ltv;
    }
}
