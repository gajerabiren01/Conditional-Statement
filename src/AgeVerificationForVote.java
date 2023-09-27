import java.util.Scanner;

public class AgeVerificationForVote {

//Main method
    public static void main(String[] args) {

//scanner object created
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter Age: ");

        //Variable age declared
        int Age = scanner.nextInt();

//If else condition for checking weather or not person's age is ove 18 or not
        if (Age>=18) {

            System.out.println("Person with given age is eligible for vote");
        } else {
            System.out.println("Person with given age is NOT eligible for vote");
        }
    }


}
