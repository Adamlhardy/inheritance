public class Student extends User {
    float gpa;

    public Student(String name){
        super(name);
        System.out.println("Called the Student Constructor");
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return super.getName() + " is a Student";
    }
}
