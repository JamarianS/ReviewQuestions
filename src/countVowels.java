/**Class: countVowels
 * @author Jah St. Aimee
 * @version 1.0
 * Course: ITEC 2150 Fall 2023
 * Written: August 21, 2023
 *
 * This class – The method should count the number of times the target character appears in the text string using a
 * for loop and return the count.
 */
public class countVowels {
    public int countVowels(String s) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            if(vowels.indexOf(c) != -1){
                count ++;
            }



        }
        return count;
    }

}
