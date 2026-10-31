package javaoop;

public class CD implements RetaiLItem, Displayable {

    double price;
    String title;
    String artist;

    public void setTitle(String title) {
        this.title = title;
    }

    public CD(double price, String title, String artist) {
        this.price = price;
        this.title = title;
        this.artist = artist;
    }

    public CD() {
    }


    public double getitemprice() {
        return price;
    }

    @Override
    public void display() {

        System.out.println(price);
        System.out.println(title);
        System.out.println(artist);

    }

}
