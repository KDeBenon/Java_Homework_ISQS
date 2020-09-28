//  DEVELOPMENT ENVIRONMENT: IntelliJ IDEA by JetBrains
//
//  Homework One, Question 2: oddUserInput.java
//  Find the product of odd integers entered by a user.
//
// Now amend your application to allow the user to specify the range to calculate.
//
//  Author: Kendall DeBenon
//
// Inception.........September 27, 2020, ‏12:26:19 AM
// Last changed......September 28, 2020, 12:36:17 AM
//    by............Kendall DeBenon
//  HOW:
//      Input:
//          User inputs the range they want the odd numbered integer to go up to.
//
//      Output:
//         Produces the product of the odd number range the user selected ex: user selects 7 - (1 * 3 * 5 * 7)
//         The product of the user inputted integer is = 105
//
//      Notes:
//          None
//
//----------------------------------------------------------------


package secondQuestions;
import java.util.Scanner;

public class oddUserInput {
    public static void main(String[] args) {
        int product = 1;
        int num_range;
        int num_counter;

        Scanner input = new Scanner(System.in);

        System.out.println("Input any integer: "); //Allows user input of specified integer
        num_range = input.nextInt(); // takes the integer inputted by the user

        for(num_counter = 1;num_counter <= num_range; num_counter+=2){ //Increments twice due to odd number
            product = num_counter * product; //Multiplies the the number the user selected by the odd numbers in the
                                            // specified range numbers. Ex: User Number 5: 1 * 3 * 5 = 15

        }
        System.out.println("The product of the user inputted integer is = " + product); //Prints out product of integer
                                                                         // specified by the user.
    }
}
