import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.io.*;

public class reversefile{
    public static void main(String[] args){
    ArrayList<String> filedata = new ArrayList<String>();
    try {
        File myObj = new  File("textfile.txt");
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNext()) {
        String strings = myReader.next();
        filedata.add(strings);
        }
        myReader.close();
    } 
    catch (FileNotFoundException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
    }

    Collections.reverse(filedata);
    String.join("\n", filedata);

    try {
        FileWriter myWriter = new
        FileWriter("textfile.txt");
        myWriter.write(String.valueOf(filedata));
        myWriter.close();
        System.out.println("Successful.");
    }      
    catch (IOException e) {
        System.out.println("An error occurred.");
    }
 }
}
   
        
        
