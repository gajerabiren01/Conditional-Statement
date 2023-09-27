import java.util.Scanner;

public class CityNameAlphabet {

//Main method
    public static void main(String[] args) {
//scanner object created
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Character between a to f");

        //variable alphabet is declared
       char alphabet =  scanner.next().charAt(0);
//turned alphabet in to lowercase
       alphabet = Character.toLowerCase(alphabet);
//switch statement for printing name according to the alphabet
       switch (alphabet) {

           case 'a':
               System.out.println("Ahemdabad");
               break;
           case 'b':
               System.out.println("Bombay");
               break;
           case 'c':
               System.out.println("Chandigarh");
               break;
           case 'd':
               System.out.println("Darjeeling");
               break;
           case 'e':
               System.out.println("Erode");
               break;
           case 'f':
               System.out.println("Ferozepur");
               break;
           default:
               System.out.println("Error!!! Please enter valid character between a to f");


       }
        
//        if (alphabet== 'a') {
//
//            System.out.println("Ahemdabad");
//        } else if (alphabet == 'b') {
//            System.out.println("Bombay");
//        }else if (alphabet == 'c') {
//            System.out.println("Chandigarh");
//        }else if (alphabet == 'd') {
//            System.out.println("Darjeeling");
//        }else if (alphabet == 'e') {
//            System.out.println("Erode");
//        }else if (alphabet == 'f') {
//            System.out.println("Ferozepur");
//        } else {
//            System.out.println("Error!!! Please enter valid character between a to f");
//        }


    }
}
