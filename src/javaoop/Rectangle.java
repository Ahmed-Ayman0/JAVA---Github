package javaoop;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle() {
        length = 10;
        width = 15;
        System.out.println("a new zoom created with 10 m length and 15 meter width");
    }

    public Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    public void setlength(double l) {
        l = 70;
        length = l;
    }

    public Rectangle add(Rectangle room2) {
        Rectangle result = new Rectangle();
        result.length = this.length + room2.length;
        result.width = this.width + room2.width;
        return result;
    }

    public void modifobject(Rectangle r) {
        r.length = 67;
        r.width = 89;

    }

    public void setWidth(double w) {
        width = w;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getarea() {
        return length * width;
    }


}
