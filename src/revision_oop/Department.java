package revision_oop;

import java.util.ArrayList;

public class Department {

    int dno;
    String dname;

    ArrayList<Employee> emplist;


    public Department() {
    }

    public Department(int dno, String dname) {
        this.dno = dno;
        this.dname = dname;
        emplist = new ArrayList<Employee>();
    }


    public void add_Employee(Employee e) {
        emplist.add(e);
    }


    public void remove_Employee(Employee id) {
        emplist.remove(id);
    }

    public int get_EmployeeCount() {

        return emplist.size();
    }

    public void print_basic_data() {
        for (int i = 0; i <emplist.size() ; i++) {
            System.out.println(emplist.get(i).getSsn());
        }
    }


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
