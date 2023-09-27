import java.util.Scanner;

public class FindNumberAlphabetSymbol {

//Main method
    public static void main(String[] args) {
//Scanner object created
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter any character number or symbol");
        //Variable value declared
        char Value = scanner.next().charAt(0);
// if else statement to find weather entered character is number or alphabet or symbol
        if ((Value >= 'a' && Value<= 'z') || (Value >= 'A' && Value<= 'Z')){

            System.out.println("Given value "+ Value + "is alphabet");
        } else if (Value>= '0' && Value<= '9') {
            System.out.println("Given value " + Value + " is number");
        } else  {

            System.out.println("Given value " + Value + " is Symbol");

        }




    }


}
