/**Class: VariablePractice
 * @author Jah St. Aimee
 * @version 1.0
 * Course: ITEC 2150 Fall 2023
 * Written: August 21, 2023
 *
 * This class – Declares a variable named `temperature`
 * and assign it a value of 25.
 * Then prints it out the temperature using `System.out.println()`.
 * It also  creates twovariables, `firstName` and `lastName,
 * that store a first and last name.
 * Then combine them to form a full name and print it.
 */
public class VariablePractice {
    public static void main(String []args){
        int temperature = 25;
        System.out.println(temperature);

        String firstName = "Jamarian";
        String lastName = "St. Aimee";

        System.out.println(firstName + lastName);
    }
}
