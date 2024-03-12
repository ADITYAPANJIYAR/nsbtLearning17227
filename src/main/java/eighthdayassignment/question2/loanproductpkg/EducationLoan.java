package eighthdayassignment.question2.loanproductpkg;

enum CourseType{
    PARTTIME, REGULAR, DISTANCE
}
enum DegreeType{
    DIPLOMA, GRADUATE, POSTGRADUATE
}
enum EducationStream{
    ENGINEERING, MEDICAL, MANAGEMENT, TECHNICAL
}
public class EducationLoan extends LoanProduct {
    CourseType courseType;
    DegreeType degreeType;
    EducationStream educationStream;

    private String courseName;
    private String collegeName;
    private double totalFees;


    @Override
    public double ltvCalculateAsPerCollateralType(double loanAmountAsked) {
        System.out.println("EducationLoan called");
        return (loanAmountAsked/totalFees);
    }

    //constructors...
    public EducationLoan(double totalFees) {
        this.totalFees=totalFees;
    }

    //getter and setters...

    public CourseType getCourseType() {
        return courseType;
    }

    public void setCourseType(CourseType courseType) {
        this.courseType = courseType;
    }

    public DegreeType getDegreeType() {
        return degreeType;
    }

    public void setDegreeType(DegreeType degreeType) {
        this.degreeType = degreeType;
    }

    public EducationStream getEducationStream() {
        return educationStream;
    }

    public void setEducationStream(EducationStream educationStream) {
        this.educationStream = educationStream;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public double getTotalFees() {
        return totalFees;
    }

    public void setTotalFees(double totalFees) {
        this.totalFees = totalFees;
    }

    //Builder method
    public static class EducationLoanBuilder{
        CourseType courseType;
        DegreeType degreeType;
        EducationStream educationStream;
        private String courseName;
        private String collegeName;
        private double totalFees;

        public EducationLoanBuilder(String courseName, String collegeName) {
            this.courseName = courseName;
            this.collegeName = collegeName;
        }

        public EducationLoanBuilder setCourseType(CourseType courseType) {
            this.courseType = courseType;
            return this;
        }

        public EducationLoanBuilder setDegreeType(DegreeType degreeType) {
            this.degreeType = degreeType;
            return this;
        }

        public EducationLoanBuilder setEducationStream(EducationStream educationStream) {
            this.educationStream = educationStream;
            return this;
        }

        public EducationLoanBuilder setTotalFees(double totalFees) {
            this.totalFees = totalFees;
            return this;
        }
    }
}
