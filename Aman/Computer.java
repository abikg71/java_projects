import java.util.*;

public class Computer
{
  public static void main(String[] args)
  {
     ComputerParts cp = new ComputerParts();
     Scanner console = new Scanner(System.in);

        System.out.println("\n Welcome to Customized purchase");
        System.out.println("=============================== \n");

        int cmpr = 0;
        boolean choose = false;

   while (!choose)
   {
     System.out.println("Please select the Computer, which you want\n"
      + "for Buy; 1-for Desktop, and 2-to Laptop");
       cmpr = console.nextInt();
       switch(cmpr)
         {
            case 1: // Desktop
            System.out.println("Okay. You've choosen Desktop \n ");
            cp.casetype();
            cp.CPUType();
            cp.Monitor();
            break;

            case 2: // Laptop
            System.out.println("Okay. You've choosen Laptop \n ");
            cp.casetype();
            cp.CPUType();
            cp.Monitor();
            break;
            default:
            System.exit(0);
            choose = true;
        }


    } // End of while
  }
}
