package javaoop;

public class Student {
    private int no;
    private int age;
    private String name;
    private String paassword;
    private static int count = 1;


    public void setAge(int age) {
        this.age = age;
    }

    private static String college = "IT";
    private static int minimalpasswordlengh = 6;


    public String getPaassword() {
        return paassword;
    }

    public void setPaassword(String paassword) {
        this.paassword = paassword;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Student.count = count;
    }

    public static String getCollege() {
        return college;
    }

    public static void checkAge(Student s) {
        if (s.age >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Young");
        }
    }

    public  void compareStudents(Student s1, Student s2) {

        if (s1.age > s2.age) {
            System.out.println(" Student1  is older than Student2  ");
        } else if (s1.age < s2.age) {
            System.out.println(" Student2  is older than Student1  ");
        } else
            System.out.println(" Student1  is equale  Student3  ");
    }


    public static void setCollege(String college) {
        Student.college = college;
    }

    public static int getMinimalpasswordlengh() {
        return minimalpasswordlengh;
    }

    public static void setMinimalpasswordlengh(int minimalpasswordlengh) {
        Student.minimalpasswordlengh = minimalpasswordlengh;
    }

    Student() {

    }


    Student(int no, String name, String paassword) {
        this.no = no;
        this.name = name;
        this.paassword = paassword;
        count++;
    }

    Student(String name, String paassword) {
        this.no = no;
        this.name = name;
        this.paassword = paassword;
        count++;
    }


    public static boolean validatePassword(String password) {

        if (password.length() >= minimalpasswordlengh) {
            return true;
        }
        return false;
    }


    public boolean login(int enteredno, String enteredpassword) {
        if (enteredno == no && enteredpassword.equals(paassword)) {
            boolean loggedoin = true;
            return true;
        } else {
            return false;
        }
    }


}
