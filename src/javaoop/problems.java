void main() {


    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the num : ");
    int num = sc.nextInt();



    if (num >0) {
        if (num%2==0) {
            System.out.println("Positive Even");
        }else  {
            System.out.println("Positive Odd");
        }
    } else if (num ==0) {
        System.out.println("the number is zero ");
    } else {
        System.out.println("negative ");
    }

}