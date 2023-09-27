import java.util.Scanner;
//class odd even created
public class OddEven {

// main method created
    public static void main(String[] args) {
//scanner object created
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Whole number: ");

        //variable random number declared
        int RandomNumber = scanner.nextInt();
// ternary operator to check weather roll number is odd or even
        String Result = (RandomNumber%2 == 0) ? "Entered number "+ RandomNumber+" is even" : "Entered number "+ RandomNumber+" is odd";
        System.out.println(Result);

    }


}
