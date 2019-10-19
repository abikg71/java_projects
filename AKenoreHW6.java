package akenorehw6;

/**
 *
 * @author Abinet Kenore
 * @version 041317
 *
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Scanner;

public class AKenoreHW6
{
    private static final String FILE_INPUT = "HW6InPut";
    private static final String FILE_OUTPUTQS = "OutPut/HW6.QSOutPutfile";
    private static final String FILE_OUTPUTSS = "OutPut/HW6.SSOutPutfile";
    private static final String FILE_OUTPUTBQS =
                                        "OutPut/HW6.BothQ&SsortOutPutfile";
    private static final int MAX_ARRAY_SIZE = 100;
    private static QuickSort qksort; // object
    private static ShellSort shsort;
    private static int [] quicksort;
    private static int [] shellsort;

    public static void main(String[] args)
    {
        System.out.println("Reading data from file Input/HW6Input1.txt\n");
        processInputFileForQuickSort();
        processInputFileForShellSort();
        generateSortedReport();
        System.out.println("Check Out the Output file's");
        System.out.println("Generating report is  ... done.\n");

    }
    public static void processInputFileForQuickSort()
    {
        try
        {
            boolean holder;
            QuickSort temp;
            int  []tempArray = new int[MAX_ARRAY_SIZE];
            int index =0;
            int nextNum =0;

            File readfile = new File(FILE_INPUT);
            Scanner inFile = new Scanner(readfile);
            while(inFile.hasNext())
            {
                tempArray[index++] = inFile.nextInt();
            }
             qksort = new QuickSort(tempArray);
             Date date = new Date();
             String space = "==============================\n";
             File file = new File (FILE_OUTPUTQS);
             try
             {
                 try (PrintWriter report = new PrintWriter (file))
                 {
                    report.println("Last modified/complied was on: \n" + date);
                    report.print(space);
                    report.print("This's A Quick Sort: \n");
                    quicksort = qksort.getSortedList();
                    for(int i =0; i< quicksort.length-1 ; i++)
                        report.print(quicksort[i] + "\n");
                        report.print(space);

                  }  // Close the input file
             }
             catch (FileNotFoundException ex)
             {
               System.err.println ("Cannot create the file: " + FILE_OUTPUTQS);
             }
        }  // End of try block.
        catch(FileNotFoundException ex)
        {
            System.out.println("The file  was not found ");
        }
    }
    public static void processInputFileForShellSort()
    {
        try
        {
            boolean holder;
            ShellSort temp;
            int  []tempArray = new int[MAX_ARRAY_SIZE];
            int index =0;
            int line =0;

            File readfile = new File(FILE_INPUT);
            Scanner inFile = new Scanner(readfile);
            while(inFile.hasNext())
            {
                tempArray[index++] = inFile.nextInt();
            }
             shsort = new ShellSort(tempArray);
             shellsort = shsort.getShellSort();
             Date date = new Date();
             String space = "==============================\n";
             File file = new File (FILE_OUTPUTSS);
             try
             {
                 try (PrintWriter report = new PrintWriter (file))
                 {
                /*report.println("Last modified/complied was on: \n" + date);
                    report.print("This's A Quick Sort: \n");

                    quicksort = qksort.getSortedList();
                f   or(int i =0; i< quicksort.length -1; i++)
                    report.print(quicksort[i] + "\n");*/
                   report.println("Last modified/complied was on: \n" +  date);
                     report.print(space);
                     report.print("This's A Shell Sort: \n");
                     for(int i= 0; i< shellsort.length-1;i++)
                     {
                         report.print(shellsort[i] + " \n");
                     }
                     report.print(space);
                  }  // Close the input file
              }
             catch (FileNotFoundException ex)
             {
               System.err.println ("Cannot create the file: " + FILE_OUTPUTSS);
             }
             // If you wanna print out on the console use the ff code.
             /*for(int i =0; i< shellsort.length; i++)
             {
                 System.out.println(shellsort[i] + "\n");
                }*/
        }  // End of try block.
        catch(FileNotFoundException ex)
        {
            System.out.println("The file  was not found ");
        }
    }
        // This method generate both sorts in one output fille side by side
    public static void generateSortedReport()
    {
        Date date = new Date();
        String space = "==============================\n";
        File file = new File (FILE_OUTPUTBQS);
        try
        {
            try (PrintWriter report = new PrintWriter (file))
            {
                report.println("Here you will see both Quick & Shell sort");
                report.println("Last modified/complied was on: \n" + date);
                report.println(space);
                report.println("Shell sort       Quick Sort");
                for (int i = 0; i < shellsort.length-1; i++)
                {
            // "number s - means format to the left format"%1$-10s  %2$10d"
                    String line = String.format("%2$-10s %2$15d",
                            shellsort[i], quicksort[i]);
                    report.println(line);
                }
                report.print(space);
            }  // Close the input file
        }
        catch (FileNotFoundException ex)
        {
            System.err.println ("Cannot create the file: " + FILE_OUTPUTBQS);
        }
    }

} // End of class
