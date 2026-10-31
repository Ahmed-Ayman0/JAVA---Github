package javaoop;

public class person {

    String name;
    double age;
    String address;
    String nationality;

    public  person (){}

    public person (String n,double a,String ad  ,String nat){
        name=n;
        age=a;
        address=ad;
        nationality=nat;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }




}
