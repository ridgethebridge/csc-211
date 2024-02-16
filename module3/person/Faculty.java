
// facult class for asssignment
public class Faculty extends Person {

	protected myDOB hiringDate;
	protected String facultyID;


   public Faculty(){
        this.firstName ="";
        this.lastName = "";
        this.dob = new myDOB(1,1,1);
    }

   public  Faculty(String _firstName){
        this.firstName = _firstName;
        this.lastName = "";
        this.dob = new myDOB(1,1,1);
    }
    public Faculty(String _firstName,String _lastName){
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.dob = new myDOB(1,1,1);
    }
    public Faculty(String _firstName, String _lastName, myDOB _dob){
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.dob = new myDOB(_dob);
    }

 public Faculty(String _firstName, String _lastName, myDOB _dob, myDOB hiringDate){
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.dob = new myDOB(_dob);
	this.hiringDate = hiringDate;
    }

    public void setFacultyID(String facultyID){
        this.facultyID = facultyID;
    }
    public String getFacultyID(){
        return facultyID;
    }

public String toString() {
	return super.toString() + '\'' hiringDate + '\'' facultyID;

}

}


