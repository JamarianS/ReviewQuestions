/**Class: isLeapYear
 * @author Jah St. Aimee
 * @version 1.0
 * Course: ITEC 2150 Fall 2023
 * Written: August 21, 2023
 *
 * This class – Creates a program that finds out
 * if a given year is a Leap year or not
 */
public class isLeapYear {
    public boolean isLeapYear(int year)
    {
        return (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
    }
}
