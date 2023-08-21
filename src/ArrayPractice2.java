/**Class: ArrayPractice2
 * @author Jah St. Aimee
 * @version 1.0
 * Course: ITEC 2150 Fall 2023
 * Written: August 18, 2023
 *
 * This class – finds the maximum
 * value in an array of integers.
 */
public class ArrayPractice2 {
    public static void main(String[]args){
        int[] array = {5,10,15,20,25};
        int max = array[0];

        for(int i = 0; i < array.length; i++){
            if(array[i] > max)
                max = array[i];
        }
        System.out.println(max);
    }
}
