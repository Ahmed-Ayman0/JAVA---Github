package javaoop;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        list.add("Ahmed");
        // saad

        list.add("Mohamed");
        list.add("Ali");

        list.add(1, "saad");
        System.out.println(list);

        list.set(3,"torky");
        System.out.println(list);

        list.remove(2);
        System.out.println(list.size());
        System.out.println(list);
    }
}

