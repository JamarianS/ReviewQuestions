/**Class: LoopPractice2
 * @author Jah St. Aimee
 * @version 1.0
 * Course: ITEC 2150 Fall 2023
 * Written: August 21, 2023
 *
 * This class – repeatedly asks the user for a number until
 * they enter a negative number.
 * Print the sum of all the positive numbers entered.
 */
import java.util.Scanner;

public class LoopPractice2 {
    public static void main(String[]args){
        int sum = 0;
        int number = 0;
        Scanner input = new Scanner(System.in);

        while(number <= 0){
            System.out.println("Enter an integer: ");
            int num1 = input.nextInt();

            if(num1 < 0){
                break;
            } else {
                sum += num1;
            }

            System.out.println(sum);

            

        }
    }

}
