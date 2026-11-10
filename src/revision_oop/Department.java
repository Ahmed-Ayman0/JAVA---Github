package revision_oop;

import java.util.ArrayList;

public class Department {

    private int dno;
    private String dname;
    private ArrayList<Employee> emplist;

    public Department() {
        this.emplist = new ArrayList<>();
    }

    public Department(int dno, String dname) {
        this.dno = dno;
        this.dname = dname;
        this.emplist = new ArrayList<>();
    }

    public void add_Employee(Employee e) {
        emplist.add(e);
    }

    public void remove_Employee(int idx) {
        if (idx >= 0 && idx < emplist.size()) {
            emplist.remove(idx);
        }
    }

    public int get_EmployeeCount() {
        return emplist.size(); 
    }

    public void print_basic_data() {
        for (Employee e : emplist) {
            System.out.println(e.getSsn() + " " + e.getName() + " " + e.getSex());
        }
    }

    public void print_All_Details() {
        for (Employee e : emplist) {
            if (e instanceof SalariedEmployee) {
                ((SalariedEmployee) e).DisplayAllDetails();
            } else if (e instanceof HourlyEmployee) {
                ((HourlyEmployee) e).DisplayAllDetails();
            } else if (e instanceof CommisionEmployee) { // Fixed spelling to Commission (two s's)
                ((CommisionEmployee) e).DisplayAllDetails();
            }
        }
    }

    // Getters and Setters
    public int getDno() {
        return dno;
    }

    public void setDno(int dno) {
        this.dno = dno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public ArrayList<Employee> getEmplist() {
        return emplist;
    }

    public void setEmplist(ArrayList<Employee> emplist) {
        this.emplist = emplist;
    }
}