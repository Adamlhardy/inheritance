public class Student extends User {
    float gpa;

    public Student(String name){
        super(name);
        System.out.println("Called the Student Constructor");
    }

}
