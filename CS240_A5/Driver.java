/**
 * Created by cory on 4/12/17.
 */
/* Honor Pledge :
 “Honor Pledge: I pledge that I have neither given
 nor received any help on this assignment.”
 */

//Librarys
    import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

    import java.io.*;
    import java.util.*;

public class Driver {
    public static void main(String[] args) {

//DECLERATIONS
        //var declare
        int user = 0;
        int i = -1;
        int HOURS = 0;
        int flag = 0;

        //File Stuff
        String MyFile = "src/employees.txt";
        FileReader fileReader;
        BufferedReader bufferedReader;
        Scanner parse;

        //Scanners
        Scanner input = new Scanner(System.in);

        //Array
        Employee Stack[] = new Employee[5];

///Pre - display
        while( user != 1 || user != 2) {
            System.out.println("1 Load ");
            System.out.println("2 Exit ");
            user = input.nextInt();

            if (user == 2) {
                System.out.print("\n\nThanks for almost using the program!\n\n");
                System.exit(0);
            }

//File Loading
            //load employees from file
            else if (user == 1){
                //reset user for next prompt
                user = 0;

                try {
                    //Create input holders
                    fileReader = new FileReader(MyFile);
                    bufferedReader = new BufferedReader(fileReader);
                    parse = new Scanner(bufferedReader);
                    parse.useDelimiter(",|\n");

                    //scan the file and fill objects
                    while (parse.hasNextLine()) {


                        //Get Info
                        String job = parse.next();
                        String id = parse.next();
                        String first = parse.next();
                        String last = parse.next();
                        String date = parse.next();


                        //switch to correct object type
                        switch (job) {

                            case ("Job ID"):
                                //Skip over first line
                                break;

                            case ("1"):
                                i++;
                                System.out.println("Loading Pharmacy Manager\n");
                                Employee PharmacyManager = new PharmacyManager(job, id, first, last, date);
                                Stack[i] = PharmacyManager;
                                break;

                            case ("2"):
                                i++;
                                System.out.println("Loading Pharmacist\n");
                                Employee Parmacist = new Pharmacist(job, id, first, last, date);
                                Stack[i] = Parmacist;
                                break;

                            case ("3"):
                                i++;
                                System.out.println("Loading Technician\n");
                                Employee Technician = new Technician(job, id, first, last, date);
                                Stack[i] = Technician;
                                break;

                            case ("4"):
                                i++;
                                System.out.println("Loading Senior Technician\n");
                                Employee SenTech = new SeniorTechnician(job, id, first, last, date);
                                Stack[i] = SenTech;
                                break;

                            default:
                                System.out.println("Error Loading from File");
                                break;
                        }//End Switch
                    }//End while parse.hasNextLine

                } catch (FileNotFoundException ex) {
                    System.out.printf("File not Found");
                    System.exit(1);
                } catch (IOException ex) {
                    System.out.println(
                            "Error reading file '"
                                    + MyFile + "'");
                    System.exit(1);
                }//End Try Catch
                break;
            }// End Else
        }//End While
//Main Display

        do{
            //System.out.println("\n");
            System.out.println("1. Print Employee Info");
            System.out.println("2. Enter Hours Worked");
            System.out.println("3. Calculate Paycheck");
            System.out.println("4. Exit Program");
            user = input.nextInt();

            //Case Switch
            switch (user) {
//Print
                //Print
                case (1):
                    System.out.println("\n***********************************");
                    System.out.println("\tEmployee Spread Sheet\n");
                    System.out.println("Disclaimer: \n(Option 3) Calculate Paycheck after hours worked \nhas been " +
                            "entered to get correct Paycheck Reading\n");
                    for(i = 0; i < 4; i++){
                        //create checker based off of job
                        String temp = Stack[i].getJob();

                        //assign appropriate type cast
                        switch(temp){
                            case("1"):
                                PharmacyManager PharmMan = (PharmacyManager)Stack[i];
                                //Print Stuff
                                System.out.println("Job ID: " + PharmMan.getJob()+ "\nTitle: Pharmacy Manager" );
                                System.out.println("Emp ID: " + PharmMan.getID() );
                                System.out.println("First Name: " + PharmMan.getFirstName());
                                System.out.println("Last Name: " + PharmMan.getLastName());
                                System.out.println("Start Date: " + PharmMan.getStartDate());
                                System.out.println("Hourly Rate: " + PharmMan.getRate());
                                System.out.println("Hours Worked: " + PharmMan.getHours());
                                System.out.println("Paycheck: " + PharmMan.getPayCheck() + "\n");
                                break;
                            case("2"):
                                Pharmacist Pharm = (Pharmacist)Stack[i];
                                //Print Stuff

                                System.out.println("Job ID: " + Pharm.getJob()+ "\nTitle: Pharmacist" );
                                System.out.println("Emp ID: " + Pharm.getID() );
                                System.out.println("First Name: " + Pharm.getFirstName());
                                System.out.println("Last Name: " + Pharm.getLastName());
                                System.out.println("Start Date: " + Pharm.getStartDate());
                                System.out.println("Hourly Rate: " + Pharm.getRate());
                                System.out.println("Hours Worked: " + Pharm.getHours());
                                System.out.println("Paycheck: " + Pharm.getPayCheck()+ "\n");
                                break;
                            case("3"):
                                Technician Tech = (Technician)Stack[i];
                                //Print Stuff
                                System.out.println("Job ID: " + Tech.getJob() + "\nTitle: Technician " );
                                System.out.println("Emp ID: " + Tech.getID() );
                                System.out.println("First Name: " + Tech.getFirstName());
                                System.out.println("Last Name: " + Tech.getLastName());
                                System.out.println("Start Date: " + Tech.getStartDate());
                                System.out.println("Hourly Rate: " + Tech.getRate());
                                System.out.println("Hours Worked: " + Tech.getHours());
                                System.out.println("Paycheck: " + Tech.getPayCheck()+ "\n");
                                break;
                            case("4"):
                                SeniorTechnician SenTech = (SeniorTechnician)Stack[i];
                                //Print Stuff
                                System.out.println("Job ID: " + SenTech.getJob()+ "\nTitle: Senior Technician" );
                                System.out.println("Emp ID: " + SenTech.getID() );
                                System.out.println("First Name: " + SenTech.getFirstName());
                                System.out.println("Last Name: " + SenTech.getLastName());
                                System.out.println("Start Date: " + SenTech.getStartDate());
                                System.out.println("Hourly Rate: " + SenTech.getRate());
                                System.out.println("Hours Worked: " + SenTech.getHours());
                                System.out.println("Paycheck: " + SenTech.getPayCheck()+ "\n");
                                break;
                            default:
                                System.out.println("Error line 150");
                                System.exit(2);
                                break;
                        }
                    }
                    System.out.println("**************************");
                    break;
//Set Hours
                //Hours Worked
                case (2):
                    flag = 1;
                    System.out.println("Enter the number of Hours worked rounded to the nearist whole number (All " +
                            "Employees)");
                    try {
                        user = input.nextInt();
                    }catch(InputMismatchException ex){
                        System.out.println("\n\nCatch: !Not in Intger!\n\n");
                    }
                    HOURS = user;
                    System.out.println("***\nBe sure to Calculate Paychecks \nbefore Reading the Spread Sheet! " +
                            "(Option 3)\n***");
                    break;
//Calculate Paycheck
                //Claculate Paycheck
                case (3):
                    if(flag == 1) {
                        //cycle through array and update all hours worked, this will auto fix paycheck
                        for (i = 0; i < 4; i++) {
                            Stack[i].setHours(HOURS);
                        }
                        System.out.println("\nUpdated Employee Paychecks\n");
                    }
                    else{
                        System.out.println("\nYou Must Enter Hours Worked First (Option 2)\n");
                    }

                    break;
//Exit
                //exit
                case (4):
                    System.out.printf("\nThanks for Using this A+ Project!\n");
                    System.exit(0);
                    break;

                //default
                default:
                    System.out.printf("\n***************************************\n");
                    System.out.println(" Invalid Choice, enter a number 1 -> 4 ");
                    System.out.printf("***************************************\n\n");
                    break;

            }//end switch case
        }while(user != 4);//End Main display loop
    }//End Main
}//End Class
