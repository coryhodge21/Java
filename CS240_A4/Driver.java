/**
 * Created by cory on 3/28/17.
 */
/* Honor Pledge :
 “Honor Pledge: I pledge that I have neither given
 nor received any help on this assignment.”
 */
import java.util.Objects;
import java.util.Scanner;
import java.io.*;

public class Driver {
    public static void main(String[] args) {


        //Local Variable
        int user = 0;

        //create scanner
        Scanner Scan = new Scanner(System.in);

        //create the stack
        Stack stack = new Stack(10);


        //LOOP
        while(user!= 3) {
            //Display options
            System.out.print("\n\n********* User Options *********\n");
            System.out.print("1. Load Stack from Text File\n");
            System.out.print("2. Print Stack\n");
            System.out.print("3. Exit Program\n");


            //Get user input
            System.out.print("\n\n");
            user = Scan.nextInt();

            //Switch Options
            switch (user) {

                //LOAD Students: (read list of students from text file)
                case (1):

                    // create variable to hold file name
                    String myFile = "src/students.txt";


                    try {
                        //create reader
                        FileReader fileReader =
                                new FileReader(myFile);


                        //create buffered reader
                        BufferedReader bufferedReader =
                                new BufferedReader(fileReader);


                        //create reader, seperates by comma
                        Scanner parse = new Scanner(bufferedReader);
                        parse.useDelimiter(",|\n");

                        System.out.println("Loading File To Stack");

                    //For every student create object and fill in data members
                    while(parse.hasNextLine()) {

                    //get info
                    String firstName = parse.next();
                    String lastName = parse.next();
                    String StreetAddress = parse.next();
                    String Address_2 = parse.next();
                    String City= parse.next();
                    String State= parse.next();
                    String ZipCode= parse.next();
                    String Student_ID= parse.next();
                    String GPA= parse.next();

                    //Replace with while loop while(){ Create}


                            Student student = new Student(firstName, lastName, StreetAddress, Address_2,
                                    City, State, ZipCode, Student_ID, GPA);


                            stack.push(student);

                    }

                        //close file
                        bufferedReader.close();
                        fileReader.close();

                    } catch (FileNotFoundException ex) {
                        System.out.println(
                                "Unable to open file '" +
                                        myFile + "'");
                    } catch (IOException ex) {
                        System.out.println(
                                "Error reading file '"
                                        + myFile + "'");
                    }
                    System.out.print("\nLeaving Case 1\n");
                    break;

                //Print Stack Option
                case (2):
                    System.out.print("Reading from stack...\n");

                    //if stack is not empty
                    if (!stack.isEmpty()){

                        //until the stack is empty
                        while(!stack.isEmpty()){

                            //create student variable and Pop student from stack
                            Student student = (Student)stack.pop();

                            //condition not to print first blank student object from text file
                            if (student.getFirstName().contains("FirstName")){
                                continue;
                            }

                            //Print student ID
                            System.out.print("ID: " + student.getStudentId());
                            System.out.print("\t");

                            //Print first and last name
                            System.out.print("Name: " + student.getFirstName() + " "+ student.getLastName());
                                //Formatt the screen
                                    if(student.getFirstName().length() + student.getLastName().length() >= 13){
                                        System.out.print("\t");
                                    }
                                    else{
                                        System.out.print("\t\t");
                                    }

                            //Only Print address 2 if not blank
                            System.out.print("Address1: " + student.getAddress().getStreetAddress());
                                if(!student.getAddress().getAddress_2().equals("")) {
                                    System.out.print(", " + student.getAddress().getAddress_2());
                                }

                            //Formatt
                            if(student.getAddress().getStreetAddress().length() + student.getAddress().getAddress_2().length() > 24){
                                System.out.print("\t");
                            }
                            else if (student.getAddress().getStreetAddress().length() + student.getAddress().getAddress_2().length() > 20){
                                System.out.print("\t\t");
                            }
                            else if(student.getAddress().getStreetAddress().length() + student.getAddress().getAddress_2().length() > 17){
                                System.out.print("\t\t\t");
                            }
                            else{
                                System.out.print("\t\t\t\t");
                            }

                            System.out.print("City: " + student.getAddress().getCity());
                            System.out.print("\t\t");
                            System.out.print("State: " + student.getAddress().getState());
                            System.out.print("\t\t");
                            System.out.print("Zip: " + student.getAddress().getZipCode());
                            System.out.print("\t\t");
                            System.out.print("GPA: " + student.getGPA());
                            System.out.print("\n");

                        }

                    }
                    else {
                        System.out.println("Stack is empty, has it been loaded from the file?");
                    }

System.out.print("\nLeaving Case 2\n");
                    break;

                //exit program
                case(3):
                    System.out.print("Program End!\n");
                    System.exit(0);
                    System.out.print("\nLeaving Case 3\n");
                    break;

                default:
                    System.out.print("Defaulting: invalid input \n");
                    break;



            }//End Switch
        }//End Display Loop
    }//END MAIN
}//end Class

