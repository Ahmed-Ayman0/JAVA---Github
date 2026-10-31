package javaoop;

// enum
enum Gender {male, female};

enum Course {Database, Progrmming, Math, ERP};

enum Semester {Summer, Winer, Fall, Spring};


public class RegisterForm {

    String stdname;
    Gender stdgender;
    Course stdcourse;
    Semester sem;

    RegisterForm() {

        stdname = "No Name";
        stdgender = Gender.male;
        stdcourse = Course.Math;
        sem = Semester.Spring;

    }


}
