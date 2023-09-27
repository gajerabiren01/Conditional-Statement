import java.util.Scanner;

public class FindVowelOrConsonant {

//Main method
    public static void main(String[] args) {
//scanner object created
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter any alphabet: ");

        //alphabet variable declared
        char Alphabet =  scanner.next().charAt(0);
//if else statement to find out the given alphabet is vowel or consonant
        if ((Alphabet == 'a' || Alphabet == 'e'|| Alphabet == 'i'|| Alphabet == 'o'|| Alphabet == 'u') || (Alphabet == 'A' || Alphabet == 'E'|| Alphabet == 'I'|| Alphabet == 'O'|| Alphabet == 'U')) {

            System.out.println("Entered alphabet is " + Alphabet + " Vowel");
        } else {
            System.out.println("Entered alphabet is " + Alphabet + " Consonant");


        }

    }


}
