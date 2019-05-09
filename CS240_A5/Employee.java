/**
 * Created by cory on 4/12/17.
 */
/* Honor Pledge :
 “Honor Pledge: I pledge that I have neither given
 nor received any help on this assignment.”
 */
public class Employee {

    //Data Members
    protected String job;
    protected String ID;
    protected String FirstName;
    protected String LastName;
    protected String StartDate;
    protected int Hours = 0;
   //Constructor

    public Employee(String job, String ID, String firstName, String lastName, String startDate) {
        this.job = job;
        this.ID = ID;
        FirstName = firstName;
        LastName = lastName;
        StartDate = startDate;
    }


    //Setters Getters
    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getStartDate() {
        return StartDate;
    }

    public void setStartDate(String startDate) {
        StartDate = startDate;
    }

    public int getHours() {
        return Hours;
    }

    public void setHours(int hours) {
        Hours = hours;
    }
}
