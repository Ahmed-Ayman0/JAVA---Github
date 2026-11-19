package Bank;

final public class Student {

    final int student_id;
    String name;
    int YearOfBirth;
    final static float degree_of_success;

    static {
        degree_of_success = 50;
    }



    public Student(final int student_id, String name, int yearOfBirth) {

//        System.out.println("Student Constructor");
        this.student_id = student_id;
        this.name = name;
        this.YearOfBirth = yearOfBirth;
    }



    @Override
    final public String toString() {
        return "Student{" + "student_id=" + student_id + ", name='" + name + '\'' + ", YearOfBirth=" + YearOfBirth + '}';
    }



}
