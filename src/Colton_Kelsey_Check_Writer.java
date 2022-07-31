import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Colton_Kelsey_Check_Writer{

   public static void main(String args[]) throws IOException{
        Scanner dateScan = new Scanner(System.in); // sets up scanner for date entry
        System.out.println("Please enter the date: ");
        String date = dateScan.nextLine();        // creates varible from date input

        Scanner nameScan = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = nameScan.nextLine();

        Scanner amountScan = new Scanner(System.in);
        System.out.println("Please enter your amount:");
        Double amount = amountScan.nextDouble();

        Scanner userDecision = new Scanner(System.in);
        System.out.println("Would you like a preview? Y/N: ");
        char decision = userDecision.next().charAt(0);

        FileWriter output = new FileWriter("src\\Colton_Kelsey_Output.txt");

        if (decision == 'Y'){
           System.out.println("Date: " + date);
           System.out.println("Pay to the order of: "  + name + " " +  "$" +amount);
          // System.out.println("") need to translate amount to words?
          System.out.println("Note: Printed with preview");
          output.write(date + "\n" + name +"\n" + amount);
          output.close();
        }
        else if (decision == 'N'){
        output.write(date + "\n" + name + "\n" +"$"+amount);
         // need to convert amount to words
         output.close();
        }
   }

}