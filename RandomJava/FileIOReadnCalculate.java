package Abinet;

import java.io.File;
import java.util.Scanner;

public class FileIOReadnCalculate
{
    public static void main(String[] args) throws Exception
    {
        File file = new File("text2.txt");
        Scanner input = new Scanner(file);
        int sum = 0;
        while (input.hasNext())
        {
            sum += input.nextInt();
        }
        System.out.println("The Sum is: " + sum);
    }
}
