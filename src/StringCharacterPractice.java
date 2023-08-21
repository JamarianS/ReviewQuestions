/**Class: StringCharacterPractice
 * @author Jah St. Aimee
 * @version 1.0
 * Course: ITEC 2150 Fall 2023
 * Written: August 21, 2023
 *
 * This class – Prints the length of the given string
 * And prints the 10th character of the quote
 */
public class StringCharacterPractice {
    public static void main(String []args){
        String message = "Hello, World!";
        int size = message.length();
        System.out.println(size);

        String favoriteQuote = "May the force be with you";
        char tenth = favoriteQuote.charAt(10);
        System.out.println(tenth);
    }
}
