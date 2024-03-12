package thirddayassignment;

public class Student {
    String studentId;
    String studentName;
    int creditPoints;

    //methods
    public void addCredits(int credit){
        creditPoints+=credit;
    }
    public void getCredits(){
        System.out.println("New credit is:"+creditPoints);
    }
    public void changeStudentName(String newName){
        studentName=newName;
        System.out.println("New name is:"+studentName);
    }

    public void getLoginName(){
        System.out.println("Login Name is:"+studentName.substring(0,4)+studentId.substring(0,3));
    }

    //constructors...
    public Student(String studentId, String studentName, int creditPoints) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.creditPoints = creditPoints;
    }
    public Student(String studentId, String studentName){
        if(studentName.length()<3) {
            System.out.println("Name should be minimum of 4 character");
            this.studentId=null;
        }
        else
            this.studentName=studentName;

        if(studentId.length()<2) {
            System.out.println("id should be minimum of 3 character");
            this.studentId=null;
        }
        else
            this.studentId=studentId;
    }

    //getter and setters
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getCreditPoints() {
        return creditPoints;
    }

    public void setCreditPoints(int creditPoints) {
        this.creditPoints = creditPoints;
    }
}
