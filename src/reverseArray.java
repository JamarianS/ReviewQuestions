/**Class: ReverseArray
 * @author Jah St. Aimee
 * @version 1.0
 * Course: ITEC 2150 Fall 2023
 * Written: August 21, 2023
 *
 * This class – a method that returns a new array containing
 * all the elements of nums in reverse order.
 */
public class reverseArray {
    public int[] reverseArray(int[] nums) {
        int[] rArray = new int[nums.length];

        for (int i = nums.length - 1; i >= 0; i--) {
            rArray[nums.length - 1 - i] = nums[i];
        }

        return rArray;
    }
}
