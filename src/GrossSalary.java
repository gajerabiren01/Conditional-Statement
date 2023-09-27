import java.util.Scanner;

public class GrossSalary {

//Main method
    public static void main(String[] args) {

//scanner object created
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter employee id: ");
        //variable id declared
        String id = scanner.next();
        System.out.println("Enter employee name: ");
    //variable name declared
        String name = scanner.next();
        System.out.println("Enter employee Basic salary: ");
    //variable basicsalary declared
        int BasicSalary = scanner.nextInt();
//variable HRA  declared
        double HRA = BasicSalary * 0.1;
        System.out.println(name+" HRA is " + HRA);
        //variable DA declared
        double DA = BasicSalary *0.08;
        System.out.println(name+" DA is " + DA);
        //variable TA delcared

        double TA = BasicSalary * 0.09;
        System.out.println(name+" TA is " + TA);
//Varibale PF declared
        double PF = BasicSalary * 0.2;
        System.out.println(name+" PF is " + PF);

//Variable grosssalary declared
        double GrossSalary = (BasicSalary+HRA+TA+DA)-PF;
        System.out.println(name+ " Gross Salary is " + GrossSalary);



    }


}
