import java.util.Scanner;

public class SymbolAdditionSubstraction {

//main method created
    public static void main(String[] args) {
//scanner object created
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter First number");
        //Number one variable declared
        int NumberOne = scanner.nextInt();
        System.out.println("Enter Second number");
        //Number two variable declared

        int NumberTwo = scanner.nextInt();
        System.out.println("Enter any one symbol between addition, subtraction, division or multiplication");
        //symbol variable declared
        char symbol = scanner.next().charAt(0);
        //switch statement will perform the operation on given number according to the symbol entered
        switch (symbol) {

            case '+':
                System.out.println("Addition of NumberOne and NumberTwo is = " + (NumberOne + NumberTwo));
                break;
            case '-':
                System.out.println("Subtraction of NumberOne and NumberTwo is = " + (NumberOne - NumberTwo));
                break;
            case '*':
                System.out.println("Multiplication of NumberOne and NumberTwo is = " + (NumberOne * NumberTwo));
                break;
            case '/':
                System.out.println("Division of NumberOne and NumberTwo is = " + (NumberOne/NumberTwo));
                break;
            default:
                System.out.println("Error!!! Enter Valid symbol");

        }


    }

}
