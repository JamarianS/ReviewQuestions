/**Class: Factorial
 * @author Jah St. Aimee
 * @version 1.0
 * Course: ITEC 2150 Fall 2023
 * Written: August 21, 2023
 *
 * This class – write a method to generate
 * the factorial number between 1 and 20
 */
public class Factorial {
    public long factorial(int number){
        if(number == 0 || number == 1){
            return 1;
        }
        return number * factorial(number-1);
    }
}
