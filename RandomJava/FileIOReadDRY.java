package Abinet;
/*
@Abinet Kenore
May 30, 2020
Objective Globalizing variables
*/
import java.io.File;
import java.util.Scanner;

public class FileIOReadDRY
{
    public static int score;
    public static String firstName;
    public static String mi;
    public static String lastName;
    public static void main(String[] args) throws Exception
    {
        File file = new File("text.txt");
        Scanner input = new Scanner(file);
        System.out.printf("\n%8s%8s%8s%8s", "firstName", "mi  ", "lastName", " Score"+ "\t Letter Grade");
        while (input.hasNext())
        {
            firstName= input.next();
            mi = input.next();
            lastName = input.next();
            int score = input.nextInt();
            System.out.printf("\n%8s%6s%8s%8s", firstName,mi,lastName,score);

            assignLetterGrade();
        }
        input.close();
        System.out.println();
    }
    public static void assignLetterGrade()
    {
            if(score < 0 || score >100)
            {
                System.out.println("Invalid Score");
            }
            else if(score >= 90)
            {
                System.out.println("\t\t\tA");
            }
            else if(score >= 80)
            {
                System.out.println("\t\t\tB");
            }
            else if(score >= 70)
            {
                System.out.println("\t\t\tC");
            }
            else if(score >= 60)
            {
                System.out.println("\t\t\tD");
            }
            else
                System.out.println("\t\t\tF");
    }

}


