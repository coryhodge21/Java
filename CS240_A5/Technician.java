/**
 * Created by cory on 4/12/17.
 */
/* Honor Pledge :
 “Honor Pledge: I pledge that I have neither given
 nor received any help on this assignment.”
 */
public class Technician extends Employee {

    //Data Members
    final private int Rate = 20;
    private int payCheck = 0;

    //Constructor

    public Technician(String job, String ID, String firstName, String lastName, String startDate) {
        super(job, ID, firstName, lastName, startDate);
    }

    //Set/Get
    public int getRate() {
        return Rate;
    }

    public int getPayCheck() {
        payCheck = this.getHours() * Rate;
        return payCheck;
    }

    public void setPayCheck(int payCheck) {
        payCheck = this.getHours() * Rate;
        this.payCheck = payCheck;
    }
}
