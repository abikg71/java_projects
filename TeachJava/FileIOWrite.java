package Abinet;
/*
@Abinet Kenore
May 23, 2020
*/
import java.io.File;
import java.io.PrintWriter;

public class FileIOWrite
{
    public static void main(String[] args) throws Exception
    {
        File file = new File("text.txt");
        if(file.exists())
        {
            System.out.println("File already Exists");
            System.exit(0);
        }
        // create File
        PrintWriter output = new PrintWriter(file);
        //Write Formatted output file
        output.print("Marry J Luke ");
        output.println("87");
        output.print("Doe E Joe ");
        output.println("98");

        // close the file
        output.close();

    }
}
