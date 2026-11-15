package Bank;

public class Main {


public static void main() {


        try {
            Bank b1 = new Bank("101", "Ahmed", 1000);
            System.out.println("b1 created");
        } catch (IllegalArgumentException e) {
            System.out.println("b1 Error: " + e.getMessage());
        }

        try {
            Bank b2 = new Bank("102", "Ali", -10);
            System.out.println("b2 created");
        } catch (IllegalArgumentException e) {
            System.out.println("b2 Error: " + e.getMessage());
        }

        try {
            Bank b3 = new Bank("103", "Omar", -500);
            System.out.println("b3 created");
        } catch (IllegalArgumentException e) {
            System.out.println("b3 Error: " + e.getMessage());
        }

        System.out.println("Program finished");
    }

}



