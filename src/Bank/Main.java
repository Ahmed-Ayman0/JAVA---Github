package Bank;

public class Main {


    public static void main() {


        Bank account1 = new Bank("1001", "Ahmed", 500);
        Bank account2 = new Bank("1001", "Ahmed", 5030);

         System.out.println(account1.equals(account2));




//        Bank b2 = new Bank("102", "Ali", -10);
//        System.out.println("b2 created");
//
//        Bank b3 = new Bank("103", "Omar", -500);
//        System.out.println("b3 created");
//
//        System.out.println("Program finished");


    }

}



