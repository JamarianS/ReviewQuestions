/**Class: ArrayPractice1
 * @author Jah St. Aimee
 * @version 1.0
 * Course: ITEC 2150 Fall 2023
 * Written: August 31, 2023
 *
 * This class – Declares an array of integers with values
 * 5, 10, 15, 20, and 25. Calculate and print the sum of all the elements.
 */
public class ArrayPractice1 {
    public static void main(String[]args){
        int[] array = {5,10,15,20,25};
        int sum = 0;

        for(int i = 0; i < array.length; i++){
            sum = sum + array[i];
        }
        System.out.println(sum);
    }
}
