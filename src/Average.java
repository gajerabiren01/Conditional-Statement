import java.util.Scanner;

public class Average {

//Main method
    public static void main(String[] args) {


//Scanner object created
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter five digit positive number: ");
        //Number variable declared
        int Number = scanner.nextInt();
//Variable sum declared
        int sum = 0;
//if else condition with login to find addition of five digit number
        if (Number>99999) {

            System.out.println("Error: " + Number + "has more than five digits");
        } else {

            int digit = Number % 10;

            System.out.println("digit[0]=" + digit);
            sum += digit;
            digit = (Number/10) % 10;

            System.out.println("digit[1]=" + digit);
            sum += digit;
            digit = (Number/100) % 10;

            System.out.println("digit[2]=" + digit);
            sum += digit;
            digit = (Number/1000) % 10;

            System.out.println("digit[3]=" + digit);
            sum += digit;
            digit = (Number/10000) % 10;

            System.out.println("digit[4]=" + digit);
            sum += digit;

        }

        System.out.println("Sum = " + sum);

    }
}
