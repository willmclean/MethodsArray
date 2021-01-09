
/**
 * Write a description of class Normal_Methods here.
 *
 * @author (Will McLean)
 * @version (1.0)
 */
import java.util.Scanner;
public class Normal_methods
{
       static void clearScreen() {
           System.out.print('\u000C');
       }
       
       static void printHelloUser() {
           System.out.println("Hello, user. This is an introduction ot java methods!");
       }
       
       static void printMath(String name) {
           System.out.println("Hello, " + name + ". Lets do some math!");
       }
       
       static boolean playAgain() {
           Scanner inputScanner = new Scanner(System.in);
           
           boolean runAgain = inputScanner.nextBoolean();
        
           return runAgain;
       }
       
       static int inputNumber(String number) {
           Scanner inputScanner = new Scanner(System.in);
           int newInt;
           
           System.out.println("Input the " + number + " number: ");
           newInt = inputScanner.nextInt();
           
           return newInt;
       }
       
       static int multiplyThreeNumbers(int a, int b, int c) {
           return a * b * c;
       }
       
       public static void main(String[] args) {
           boolean runAgain;
           Scanner keyboard = new Scanner(System.in);
           String userName;
           
           int number1;
           int number2;
           int number3;
           int answer;
           
           do {
               
               clearScreen();
               
               printHelloUser();
               
               System.out.println("What is your name? ");
               userName = keyboard.next();
               
               printMath(userName);
               
               System.out.println("Time to do some multiplying!");
               
               number1 = inputNumber("first");
               number2 = inputNumber("second");
               number3 = inputNumber("third");
               
               answer = multiplyThreeNumbers(number1, number2, number3);
               
               System.out.println("The product of " + number1 + ", " + number2 + ", and " + number3 + " is " + answer + ".");
               
               System.out.println("Type 'true' to use the program again.");
               System.out.println("Type 'false' to quit the program.");
               System.out.print("Your choice: ");
               runAgain = playAgain();
               
           } while (runAgain);
       }
}