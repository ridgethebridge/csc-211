public class Person {
    protected String firstName;
    protected String lastName;
    protected myDOB dob;
    Person(){
        this.firstName="";
        this.lastName ="";
        this.dob = new myDOB(1,1,1);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dob=" + dob.toString() +
                '}';
    }
}
