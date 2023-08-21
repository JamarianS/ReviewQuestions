/**Class: MethodPractice
 * @author Jah St. Aimee
 * @version 1.0
 * Course: ITEC 2150 Fall 2023
 * Written: August 21, 2023
 *
 * This class – creates instance method called `calculateSquare` that takes an
 * integer parameter and returns its square.
 *  And creates an instance method named `printName`
 *  * that accepts a string parameter `name` and prints "Hello, [name]!".
 *  */

public class MethodPractice {
    public int calculateSquare(int number){
        return number * number;
    }

    public void printName(String name){
        System.out.println("Hello " + name + "!");

    }
    public static void main(String[]args){
        MethodPractice square = new MethodPractice();
        int result = square.calculateSquare(5);
        System.out.println("The square is: " + result);
        square.printName("Jah");


    }
}
