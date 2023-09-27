import java.util.Scanner;
//class leap year created
public class LeapYear {

//main method
    public static void main(String[] args) {
//scanner object created
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Any Year: ");

        //variable year declared
        int year = scanner.nextInt();
// if else condition to check weather the input year in leap year or not
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                System.out.println("year " + year + " century year");
                if (year % 400 == 0) {
                    System.out.println("year " + year + " is leap year");
                } else {
                    System.out.println("year " + year + "is not leap year");
                }

            } else {
                System.out.println("The year " + year + " is leap year");
            }


        } else {

            System.out.println("the year " + year + " is not leap year");
        }


    }
}
