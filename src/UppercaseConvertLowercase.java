import java.util.Scanner;

public class UppercaseConvertLowercase {

// main method
    public static void main(String[] args) {

//Scanner object created
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any character in uppercase: ");

        //alphabet variable declared
        char Alphabet = scanner.next().charAt(0);
//method for converting uppercase letter in lowercase
        System.out.println("Character in lowercase: "+ Character.toLowerCase(Alphabet));

    }
}
