/*
 * Inheritance
 */

import java.util.ArrayList;

public class Inheritance {

    public static void main(String[] args) {
        BankAccount account = new BankAccount(3.0);
        SavingsAccount savingsAccount = new SavingsAccount(2.1);

        savingsAccount.Withdraw(10);
        savingsAccount.Deposit(500);
        System.out.println(savingsAccount.GetBalance());

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("Dave"));
        students.add(new Student("Daisy"));
        students.add(new Student("Dante"));

        students.sort(new StudentComparator());
        for(Student student : students){
            System.out.println(student.getName());
        }


        // int[] arr = new int[4];
        // try{
        // System.out.println("This is before the exception.");
        // int value = arr[-1];
        // System.out.println("This is going to display with an error.");
        // } catch(Exception exception){
        //     System.out.println("Exception: " + exception);
        // } finally {
        //     System.out.println("Hit the finally.");
        // }

        // System.out.println("This is after the exception.");
        // Student student = new Student("Adam");
        // student.gpa = 3.0f;
        // System.out.println(student.getName());

        // Instructor instructor = new Instructor("Brent");
        // instructor.salary = 50000;
        // System.out.println(instructor.getName());

        // //User user = new User("Jade");

        // System.out.println(student instanceof Student);
        // System.out.println(student instanceof User);
        // //System.out.println(instructor instanceof Student);
        // System.out.println(instructor instanceof User);
        // //System.out.println(user instanceof Student);

        // Triangle triangle = new Triangle(5, 10);
        // System.out.println(triangle.GetArea());

        // Rectangle rectangle = new Rectangle(5, 10);
        // System.out.println(rectangle.GetArea());

        // Circle circle = new Circle(5);
        // System.out.println(circle.GetArea());

    }
}