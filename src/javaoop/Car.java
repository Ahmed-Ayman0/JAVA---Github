package javaoop;

public class Car {

    private String name;
    private int maxSpeed;
    private float price;
    private int model;
    private String color;

    public Car(String n, int mSpeed, float price, int model) {
        this.name = n;
        this.maxSpeed = mSpeed;
        this.price = price;
        this.model = model;
        System.out.println("contructor : 5");
    }

    public Car(String n, int mSpeed, float price, int model, String c) {
        this(n, mSpeed, price, model);
        this.color = c;
        System.out.println("contructor : 6");

    }


    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }


    public void Display() {
        System.out.println("Name : " + name);
        System.out.println("Max Speed : " + maxSpeed);
        System.out.println("Price : " + price);
        System.out.println("Model : " + model);
        System.out.println("Color : " + color);

    }







}