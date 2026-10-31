package javaoop;

public class SStudent extends person{


    int study_level;
    String specialization;
    double GPA;

    public SStudent() {}

    public SStudent (String n, double a,  String ad ,String nat, int lvl,String special ,double gpa) {

//        name = n;
//        age = a;
//        address = ad;
//        nationality = nat;

        super(n,a,ad,nat);
        study_level = lvl;
        specialization = special;
        GPA = gpa;
    }


    public int getStudy_level() {
        return study_level;
    }

    public void setStudy_level(int study_level) {
        this.study_level = study_level;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
}

