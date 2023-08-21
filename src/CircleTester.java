/**Class: CircleTester
 * @author Jah St. Aimee
 * @version 1.0
 * Course: ITEC 2150 Fall 2023
 * Written: August 21, 2023
 *
 * This class – Tester method for the circle class
 * runs and prints the code from the circle class
 */
public class CircleTester {
    public static void main(String[] args) {
        Circle num1 = new Circle(9.5);
        double answer = num1.calculateArea();
        System.out.println("The area of the circle is: " + answer);
    }
}
