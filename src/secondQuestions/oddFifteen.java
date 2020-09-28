//  DEVELOPMENT ENVIRONMENT: IntelliJ IDEA by JetBrains
//
//  Homework One, Question 2: oddFifteen.java
//  Find the product of odd integers up to 15
//
//  Write an application that uses a loop to calculate the product of odd integers from 1 to 15.
//
//  Author: Kendall DeBenon
//
// Inception.........September 27, 2020, ‏12:26:19 AM
// Last changed......September 28, 2020, 12:40:17 AM
//    by............Kendall DeBenon
//  HOW:
//      Input:
//          None, the integer range is pre-determined. Therefore, no user input is necessary.
//
//      Output:
//          Product of odd integers to 15 = 2027025
//
//      Notes:
//          None
//
//----------------------------------------------------------------


package secondQuestions;

public class oddFifteen {
    public static void main(String[] args) {
        int product = 1;

        for(int i = 3;i <= 15;i += 2){
            product = product * i;  // Takes the product and multiplies it

        }
        System.out.print("Product of odd integers to 15 = " + product);
    }
}
