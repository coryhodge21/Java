/**
 * Created by cory on 7/18/17
 */

import java.io.*;

/////////////////////////////////////////////////////////////////////////
public class Driver {

    public static final int  MAX = 5;

    public static void main(String[] args){   System.out.println("\n\n");
/////////////////////////////////////////////////////////////////////////

        Driver DRIVER = new Driver();

        //must pass/return array of size MAX
        String[] myStrArray = new String[MAX];
        myStrArray = DRIVER.readFile(myStrArray);

        //load data to variables
        String firstName = myStrArray[0];
        String lastName = myStrArray[1];

        //

        // DRIVER.dispStrArr(myStrArray);


    }///////////END MAIN
////////////////////////

////////////////////////
//////////DRIVER METHODS

    /////////write to a file
    public void write2File(){


        //Create a variable to hold the name of the file incuding the filepath
        String fileHandle = "data.txt";

        //try to open a new file and write too it
        try {

            //create a fileWriting Object
            FileWriter writer = new FileWriter(fileHandle);

            //wrap fileWriter in a bufferedWriter
            BufferedWriter buffWrite = new BufferedWriter(writer);

            //Write to the File with object methods
            buffWrite.write("Cory\n");
            buffWrite.write("Hodge\n");

            ///////////////////////////
            //writing int does not work
            //buffWrite.write(26);
            ///////////////////////////

            //close the File
            buffWrite.close();

            } catch(IOException anyName){
            System.out.println("\n\n!!!Writing to File error: dont know yet\n\n");
        }
    }

    //////////// Read File
    public String[] readFile(String[] vars){


        //Create variable to hold file name
        String fileHandle = "data.txt";

        //create string holder to parse file
        //null will force parse to read one line at a time
        String parse = null;


        //try to open a file
        try{
            //create a reader Object
            FileReader fileReader = new FileReader(fileHandle);

            //wrap fileReader in a buffer
            BufferedReader buffRead = new BufferedReader(fileReader);

            //read from the file
            int x = 0;
            while( ( parse = buffRead.readLine())  !=  null   &&   x < MAX ){
                //enable if i want to display the data as i read it from the file
                //System.out.println(parse);
                vars[x] = parse;
                x++;
            }

            //close file
            buffRead.close();

            }catch (FileNotFoundException exx){
            System.out.println("\n\n!!!File Reading Error: File not Found exception\n\n");
            }catch(IOException ex){
            System.out.println("Problem with file read");
        }

        //return data
        return vars;
    }

    public void dispStrArr(String[] myStrArray){


        //new style 4 loop
        int i = 0;
        for (String s: myStrArray)
        {
            System.out.println("String Array[" + i +"]: " + s);
        }


        //old style 4 loop
        //show array size
        //int size = myStrArray.length;
        // show array size: System.out.println("Array size = " + size);
        //        for(int x = 0; x < MAX; x++){
        //            System.out.println("strArray["+x+"]: "+myStrArray[x]);
        //        }

    }

    /////END DRIVER METHODS
//////////////////////////


}//END Driver Class
///////////////////