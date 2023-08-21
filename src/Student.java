/**Class: Student
 * @author Jah St. Aimee
 * @version 1.0
 * Course: ITEC 2150 Fall 2023
 * Written: August 21, 2023
 *
 * This class – Creates an array of `Student` objects and
 * prints the names of all students who are older than 20.
 */
public class Student {
    String name;
    int age;
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
}
