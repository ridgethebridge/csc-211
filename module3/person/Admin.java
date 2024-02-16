// admin class for assignment

public class Admin extends Admin {

private String AdminID;

   public Admin(){
        this.firstName ="";
        this.lastName = "";
        this.dob = new myDOB(1,1,1);
    }

   public  Admin(String _firstName){
	   super(_firstName);
    }
    public Admin(String _firstName,String _lastName){
	    super(_firstName, _lastName);
    }
    public Admin(String _firstName, String _lastName, myDOB _dob){
	    super(_firstName,_lastName,_dob);
    }

 public Admin(String _firstName, String _lastName, myDOB _dob, myDOB hiringDate){
	 super(_firstName, _lastName, _dob, hiringDate);
    }

    public void setAdminID(String adminID){
        this.adminID = adminID;
    }
    public String getAdminID(){
        return adminID;
    }

public String toString() {
	return super.toString() + '\'' adminID;

}
}


