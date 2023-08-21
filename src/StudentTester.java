/**Class: StudentTester
 * @author Jah St. Aimee
 * @version 1.0
 * Course: ITEC 2150 Fall 2023
 * Written: August 21, 2023
 *
 * This class – Tester method. Runs and excutes
 * the code from the Student class
 */
public class StudentTester {
    public static void main(String[]args){
        Student[] array = new Student[4];
        array[0] = new Student("Suzy", 20);
        array[1] = new Student("Bruce", 35);
        array[2] = new Student("Wayne",18);
        array[3] = new Student("Allen", 21);


        for(int i = 0; i < array.length; i++){
            if (array[i].getAge() > 20) {
                System.out.println(array[i].getName());
            }
        }

    }
}
