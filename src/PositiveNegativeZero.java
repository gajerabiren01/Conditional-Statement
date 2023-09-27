import java.util.Scanner;

public class PositiveNegativeZero {

//Main method
    public static void main(String[] args) {

//Scanner object created
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any number");
//Variable number declared
        int Number = scanner.nextInt();
//If else statement to find out that number is positive, negative or zero
        if (Number>0) {

            System.out.println(Number + " is positive number");
        } else if (Number<0) {

            System.out.println(Number + " is negative number");
        } else

            System.out.println(Number + " number is zero");


    }

}
