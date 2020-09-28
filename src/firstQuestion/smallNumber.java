//  DEVELOPMENT ENVIRONMENT: IntelliJ IDEA by JetBrains
//
//  Homework One, Question 1: smallNumber.java
//  Find the smallest integer
//
//  Write an application that finds the smallest of several integers.
//  Assume that the first value read specifies the number of values
//  to input from the user.
//
//  Author: Kendall DeBenon
//
// Inception.........September 27, 2020, ‏12:26:19 AM
// Last changed......September 28, 2020, 12:46:17 AM
//    by............Kendall DeBenon
//  HOW:
//      Input:
//          User inputs number of integers to compare. Then inputs each of the individual integers depending on the
//          number of integers they selected.
//
//      Output:
//          Outputs the smallest integer of input entered by the user.
//         Ex: User enters numbers: 5,8,10. Output: The smallest of the integers entered is: 5
//
//      Notes:
//          Math.min appeared to be the most effective way to solve the problem.
//
//----------------------------------------------------------------


package firstQuestion;
import java.util.Scanner;

public class smallNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  //Creates an object to obtain user input.

        int num_sum = 0;
        int num_amount;
        int num_entered;
        int i;

        System.out.println("Enter amount of numbers to be used: ");
        num_amount = input.nextInt();

        for(i = 1;i <= num_amount;i++){
            System.out.println("Enter an integer: ");
            num_entered = input.nextInt();

            num_sum += num_entered;

        }
        System.out.println("The smallest of the integers entered is: " + Math.min(num_amount, num_sum));
        // Prints out smallest of the user inputted numbers by utilizing MATH.min.
    }
}
