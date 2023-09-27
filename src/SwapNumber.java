import java.util.Scanner;

public class SwapNumber {

//main method
    public static void main(String[] args) {
//scanner object created
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number a: ");

        //Variable a declared
        int a = scanner.nextInt();
        System.out.println("Enter number b: ");
        //variable b declared
        int b = scanner.nextInt();


    // swap logic for number
        int c = a;
        a=b;
        b=c;

        System.out.println("value of a = " + a);
        System.out.println("value of b = " + b);




    }

}
