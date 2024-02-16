public class Student extends Person {
    private myDOB EnrollmentDate;
    private myDOB GraduationDate;
    private String StudentID;
    Student(){
        this.firstName ="";
        this.lastName = "";
        this.dob = new myDOB(1,1,1);
    }
    Student(String _firstName){
        this.firstName = _firstName;
        this.lastName = "";
        this.dob = new myDOB(1,1,1);
    }
    Student(String _firstName,String _lastName){
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.dob = new myDOB(1,1,1);
    }
    Student(String _firstName, String _lastName, myDOB _dob){
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.dob = new myDOB(_dob);
        //this.dob = _dob.clone();
    }
    public void setStudentID(String _studentID){
        this.StudentID = _studentID;
    }
    public String getStudentID(){
        return this.StudentID;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
