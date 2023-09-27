import java.util.Scanner;

public class SubjectCriteriaForPass {

    // Main method
    public static void main(String[] args) {

//scanner object is created
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Name: ");
        String name = scanner.next();
        System.out.println("Enter Roll No: ");
//variable Roll number declared
        int RollNumber = scanner.nextInt();

        System.out.println("Enter Maths Marks: ");
//variable Math mark declared
        int Math = scanner.nextInt();
        System.out.println("Enter Science Marks: ");
//variable science mark declared
        int Science =scanner.nextInt();
        System.out.println("Enter English Marks: ");
//variable English mark declared
        int Eng = scanner.nextInt();
//variable total calculate Total of three subjects
        int total = Math + Science + Eng;

        System.out.println("Total Marks: " + total);
        // variable percentage calculates percentage of three subjects
        int percentage = total/3;
// if else condition to check with which grade person has passed the exam
        if (percentage>=80&& Math>=35 && Science>=35 && Eng >=35) {


            System.out.println(name+ " has passed in all subjects with Grade A+");
        } else if (percentage>=60 && Math>=35 && Science>=35 && Eng >=35) {

            System.out.println(name+ " has passed in all subjects with Grade A");
        } else if (percentage>=50 && Math>=35 && Science>=35 && Eng >=35) {

            System.out.println(name+ " has passed in all subjects with Grade B");
        } else if(percentage>=35 && Math>=35 && Science>=35 && Eng >=35){
            System.out.println(name+ " has passed in all subjects with Pass-class");

        } else {
            System.out.println(name+" has failed the exam");
        }

    }


}
