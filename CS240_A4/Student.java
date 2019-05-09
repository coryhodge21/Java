import com.sun.xml.internal.bind.v2.runtime.reflect.Accessor;

/**
 * Created by cory on 3/28/17.
 */
/* Honor Pledge :
 “Honor Pledge: I pledge that I have neither given
 nor received any help on this assignment.”
 */

public class Student {

    //Data
    private String FirstName;
    private String LastName;
    private Address address;
    private String studentId;
    private String GPA;

    Student(String firstName, String lastName, String address1,
            String address2, String city, String state,
            String zip, String id, String gpa){

        this.FirstName = firstName;
        this.LastName = lastName;
        this.address = new Address();
        address.StreetAddress = address1;
        address.Address_2 = address2;
        address.City = city;
        address.State = state;
        address.ZipCode =zip;
        this.studentId = id;
        this.GPA = gpa;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getGPA() {
        return GPA;
    }

    public void setGPA(String GPA) {
        this.GPA = GPA;
    }
}
