package revision_oop;

public class SalariedEmployee extends Employee implements Displayable {

    Double Salary;
    Double Bonus;
    Double deduction;


    public SalariedEmployee() {
    }

    public SalariedEmployee(Double salary, Double bonus, Double deduction) {
        Salary = salary;
        Bonus = bonus;
        this.deduction = deduction;
    }

    public SalariedEmployee(String address, String name, int ssn, Gender sex, Double salary, Double bonus, Double deduction) {
        super(address, name, ssn, sex);
        this.Salary = salary;
        this.Bonus = bonus;
        this.deduction = deduction;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "Salary=" + Salary +
                ", Bonus=" + Bonus +
                ", deduction=" + deduction +
                '}';
    }


    public void DisplayAllDetails() {

        System.out.println(super.toString());
        System.out.println(toString());

    }

    @Override
    public double earning() {
        return (Salary + Bonus -deduction );
    }


    public void DisplayEarnings() {
        System.out.println(earning());
    }


    public Double getSalary() {
        return Salary;
    }

    public void setSalary(Double salary) {
        Salary = salary;
    }

    public Double getBonus() {
        return Bonus;
    }

    public void setBonus(Double bonus) {
        Bonus = bonus;
    }

    public Double getDeduction() {
        return deduction;
    }

    public void setDeduction(Double deduction) {
        this.deduction = deduction;
    }

    public Double setSalary() {

        return Salary +  Bonus - deduction;
    }


}
