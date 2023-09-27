import java.util.Scanner;

public class InputNumberDayOfTheWeek {

//main method
    public static void main(String[] args) {
//scanner object created
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter Any digit between 1 to 7: ");
        //variable number declared
        char Number = scanner.next().charAt(0);
//switch statement to find entered number will give output of relevent weekday
        switch (Number) {

            case '1':
                System.out.println("Day is Sunday");
                break;
            case '2':
                System.out.println("Day is Monday");
                break;
            case '3':
                System.out.println("Day is Tuesday");
                break;
            case '4':
                System.out.println("Day is Wednesday");
                break;
            case '5':
                System.out.println("Day is Thursday");
                break;
            case '6':
                System.out.println("Day is Friday");
                break;
            case '7':
                System.out.println("Day is Saturday");
                break;
            default:
                System.out.println("Error!! Enter valid number between 1 & 7");


        }



    }
}
