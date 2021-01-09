
/**
 * Write a description of class Methods_Array here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Methods_Array
{
    static void clearScreen() {
        System.out.println('\u000C');
    }
    
    public static void main(String[] args) {
        boolean playAgain = true;
        boolean fillAString = true;
        
        int number = 6;
        String[] stringArray = {"0", "1", "2", "3", "4", "5"};
        
        int stringNumber;
        
        Scanner myScanner = new Scanner(System.in);
        
        do {
            clearScreen();
            
            for (int i = 0; i < number; i++) {
                int count = i + 1;
                System.out.println("Give me a value for the string in position " + count + ": ");
                stringArray[i] = myScanner.next();
            }
            
            System.out.println("These are the array values you entered: ");
            
            for (int i = 0; i < number; i++) {
                int numberPlusOne = i + 1;
                System.out.println("The string " + numberPlusOne + "is " + stringArray[i] + ".");
            }
            
            System.out.println("Type true if you would like to change a string value: ");
            fillAString = myScanner.nextBoolean();
            
            while (fillAString){
                System.out.println("Which string number would you like to change 1-6: ");
                stringNumber = myScanner.nextInt();
                int printNumber = stringNumber + 1;
                
                System.out.println("Choose another value for this string " + stringNumber + ": ");
                stringArray[stringNumber - 1] = myScanner.next();
                
                System.out.println("Type true if you want to choose a different value for a string: ");
                fillAString = myScanner.nextBoolean();
            }
            
            System.out.println("Here are the values in the array: ");
            
            for (int i = 0; i < number; i++) {
                int numberPlusOne = i + 1;
                System.out.println("The string " + numberPlusOne + "is " + stringArray[i] + ".");
            }
            
            System.out.println("Would you like to repeat the program? Type true to do it again:");
            playAgain = myScanner.nextBoolean();
        }while (playAgain);
    }
}
