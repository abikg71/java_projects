package Abinet;
/*
@Abinet Kenore
May 23, 2020
*/
import java.io.File;
import java.util.Scanner;

public class FileIORead
{
    public static void main(String[] args) throws Exception
    {
        File file = new File("text.txt");
        Scanner input = new Scanner(file);
        System.out.printf("\n%8s%8s%8s%8s", "firstName", "mi  ", "lastName", " Score"+ "\t Letter Grade");
        while (input.hasNext())
        {
            String firstName= input.next();
            String mi = input.next();
            String lastName = input.next();
            int score = input.nextInt();
            System.out.printf("\n%8s%6s%8s%8d", firstName,mi,lastName,score);
            int num = score;
            assignLetterGrade(score);
        }
        input.close();
    }
    public static void assignLetterGrade(int num)
    {
        if(num < 0 || num > 100)
        {
            System.out.println("Invalid Score");
        }
        if(num >= 90)
        {
            System.out.println("\t\t\tA");
        }
        else if(num >= 80)
        {
            System.out.println("\t\t\tB");
        }
        else if(num >= 70)
        {
            System.out.println("\t\t\tC");
        }
        else if(num >= 60)
        {
            System.out.println("\t\t\tD");
        }
        else
            System.out.println("\t\t\tF");
    }

}
