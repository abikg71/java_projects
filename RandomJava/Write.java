package Abinet;


//import java.io.File;
//import java.io.PrintWriter;
import  java.io.*;

public class Write
{
    public static void main(String[] args) throws Exception
    {

        File file = new File("data.txt");

        // validate the file
        if(file.exists())
        {
            System.out.println("File already Exists");
            System.exit(0);
        }
        // create File
        PrintWriter output = new PrintWriter(file);
        output.print("Abinet Kenore ");
        output.println("78");
        output.println("Marry Joseph 70");
        output.println("Marry Joseph 70");
        output.println("Marry Jph 80");

        output.close();
    }
}
