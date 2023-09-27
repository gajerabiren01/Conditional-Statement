import java.util.Scanner;

public class SalesCommission {

//Main method
    public static void main(String[] args) {

        //scanner object created
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ID: ");
        //Variable id declared
        String id = scanner.next();
        System.out.println("Enter Name: ");
        //Variable name declared
        String name = scanner.next();
        System.out.println("Enter Sales Amount: ");
        //variable sales amount declared
        int SalesAmount =  scanner.nextInt();
        System.out.println("Enter Basic Salary: ");
        //variable basic salary declared
        int BasicSalary = scanner.nextInt();
    //if else condition to find sales commision will get according to sales amount
        if (SalesAmount>=50000) {

           int SalesCommission = (SalesAmount*35)/100;
            System.out.println(name + " sales commission is " + SalesCommission);
        } else if (SalesAmount>=30000) {
           int SalesCommission = (SalesAmount*20)/100;
            System.out.println(name + " sales commission is " + SalesCommission);

        } else if ((SalesAmount>=20000)) {
            int SalesCommission = (SalesAmount*10)/100;
            System.out.println(name + " sales commission is " + SalesCommission);


        } else if ((SalesAmount>=10000)) {
            int SalesCommission = (SalesAmount*5)/100;
            System.out.println(name + " sales commission is " + SalesCommission);


        } else {

            int SalesCommission = (SalesAmount*2)/100;
            System.out.println(name + " sales commission is " + SalesCommission);


        }

    }

}
