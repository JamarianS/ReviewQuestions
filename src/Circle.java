/**Class: Circle
 * @author Jah St. Aimee
 * @version 1.0
 * Course: ITEC 2150 Fall 2023
 * Written: August 21, 2023
 *
 * This class – returns the area of the circle.
 * By creating an instance of the class and calculate its area.
 */
public class Circle {
    double radius;
    public Circle(double radius){
        this.radius = radius;
    }

    public double calculateArea(){
        return radius * radius * Math.PI;
    }


}
