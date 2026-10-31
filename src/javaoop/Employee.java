package javaoop;

public abstract class Employee {

    double salary;
    String rank;
    String job;

    public Employee() {}

    public Employee(double s, String r, String j) {
        this.salary = s;
        this.rank = r;
        this.job = j;
    }

    public abstract double getSalary();


    public void setSalary(double salary) {

        this.salary = salary;}

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
