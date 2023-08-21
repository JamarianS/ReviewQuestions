/**Class: MyReview
 * @author Jah St. Aimee
 * @version 1.0
 * Course: ITEC 2150 Fall 2023
 * Written: August 21, 2023
 *
 * This class – returns a string where there are two chars
 * for every char is the original.
 */
public class MyReview {
    public static void main(String[] args) {
        System.out.println(reverseDoubleChar("The"));
        System.out.println(reverseDoubleChar2("AABB"));
        System.out.println(reverseDoubleChar3("String"));
    }

    public static String reverseDoubleChar(String word){
        String result = "";
        for(int i = word.length() - 1 ; i >= 0 ; i--)
        {
            result = result + word.charAt(i) + word.charAt(i) ;
        }
        return result;
    }

    public static String reverseDoubleChar2(String word){
        String result = "";
        for(int i = 0 ; i < word.length() ; i++)
        {
            result = result + word.charAt(i) + word.charAt(i);
        }
        return result;
    }

    public static String reverseDoubleChar3(String word){
        String result = "";
        for(int i = word.length() - 1 ; i >= 0 ; i--)
        {
            result += "" + word.charAt(i) + word.charAt(i);
        }
        return result;
    }
}
