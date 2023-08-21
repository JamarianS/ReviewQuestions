/**Class: countOccurences
 * @author Jah St. Aimee
 * @version 1.0
 * Course: ITEC 2150 Fall 2023
 * Written: August 21, 2023
 *
 * This class – The method  count the number
 * of times the target character appears in the text string using
 * a for loop and return the count.
 */
public class countOccurenes {
    public int countOccurrences(String text, char target) {
        int count = 0;
        for(int i = 0; i < text.length(); i++){
            if(text.charAt(i) == target){
                count ++;
            }
        }
        return count;
    }

}
