/*
 * Name: Hussein Mansour
 * Modified: 2023-03-17
 */

 import java.util.Scanner;

 /*
  * This class uses class Customer to provide a report
  * to indecate a price depending on the customer age.
  */
 public class Age {
 
     /*
      * The main method asks for a customer Age, uses an instance 
      * of class Customer to generate a report, and writes
      * the report to the console.
      */
     public static void main(String[] args) {
         // Calling Method Customer
         Customer myCustomer = new Customer();
         // declaration
         int age;
         double result;
         //Scanner
         Scanner myScanner = new Scanner(System.in);
         // age input
         System.out.print("Enter age: ");
         // output
         if (myScanner.hasNextInt()) {
             age = myScanner.nextInt();
             myCustomer.setAge(age);
             result = myCustomer.calculateTicketPrice();
             if  (result != -1.00) {
                 System.out.printf("Price is: $%.2f", result);
             } else if (result == -1.00) {
                 System.out.print("Invalid Age Entered");
             }
         } else {
             System.out.print("Invalid Age Entered");
             myScanner.nextLine(); // discard the bad input
         }
 
         // Done by
         System.out.println("\nProgram by Hussein Mansour.");
     }
 }
 