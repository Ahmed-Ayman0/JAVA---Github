package javaoop;

public class Salaried_Employee extends Employee {

    double bonus;
    double deduction;


    public Salaried_Employee() {
    }


    public Salaried_Employee(double s, String r, String j, double bonus) {
        super(s, r, j);
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return salary + bonus - deduction;
    }

}
