//Importing Scanner class for basic java functions
import java.util.Scanner;
// Class for our Grade System program
class grade
{
    // Object of Scanner Class
    Scanner sc = new Scanner(System.in);
    // Global variables
    int total1,total2,total3,total4,total5,mtotal;
    double per,mper;
    // Design function
    void Design(){
        System.out.println("    \n\t\t     ==============================================");
        System.out.println("     \n\t\t   ====          Student Grade System       ====");
        System.out.println("     \n\t\t  =============================================");
        System.out.println("PROJECT BY : Nitesh Raut \n");
    }

    // Java Subject Collecting Data Function
    void java(){
        int marks1,marks2,marks3;
        grade g=new grade();

        System.out.println("Enter Java subject Marks");
        System.out.println("Enter Student Marks For Assignment OUT OF 30");
        marks1 = sc.nextInt();
        if (marks1>30){
            System.out.println("Invalid input enter again");
            System.out.println("------------------------------------");
            g.java();
        }

        System.out.println("Enter Student Marks For Quiz OUT OF 20");
        marks2 = sc.nextInt();
        if (marks2>20){
            System.out.println("Invalid input enter again");
            System.out.println("------------------------------------");
            g.java();
        }

        System.out.println("Enter Student Marks For Exams OUT OF 50");
        marks3 = sc.nextInt();
        if (marks3>50){
            System.out.println("Invalid input enter again");
            System.out.println("------------------------------------");
            g.java();
        }
        total1 = marks1+marks2+marks3;
        System.out.println("Your Java Subject Marks is "+total1);
        System.out.println("------------------------------------");

    }

    // C Subject Collecting Data Function
    void C(){
        int marks1,marks2,marks3;
        grade g=new grade();
        System.out.println("Enter C subject Marks");
        System.out.println("Enter Student Marks For Assignment OUT OF 30");
        marks1 = sc.nextInt();
        if (marks1>30){
            System.out.println("Invalid input enter again");
            System.out.println("------------------------------------");
            g.C();
        }

        System.out.println("Enter Student Marks For Quiz OUT OF 20");
        marks2 = sc.nextInt();
        if (marks2>20){
            System.out.println("Invalid input enter again");
            System.out.println("------------------------------------");
            g.C();
        }

        System.out.println("Enter Student Marks For Exams OUT OF 50");
        marks3 = sc.nextInt();
        if (marks3>50){
            System.out.println("Invalid input enter again");
            System.out.println("------------------------------------");
            g.C();
        }
        total2 = marks1+marks2+marks3;
        System.out.println("Your C Subject Marks is "+total2);
        System.out.println("------------------------------------");
    }

    // Python Subject Collecting Data Function
    void Python(){
        int marks1,marks2,marks3;
        grade g=new grade();
        System.out.println("Enter Python subject Marks");
        System.out.println("Enter Student Marks For Assignment OUT OF 30");
        marks1 = sc.nextInt();
        if (marks1>30){
            System.out.println("Invalid input enter again");
            System.out.println("------------------------------------");
            g.Python();
        }

        System.out.println("Enter Student Marks For Quiz OUT OF 20");
        marks2 = sc.nextInt();
        if (marks2>20){
            System.out.println("Invalid input enter again");
            System.out.println("------------------------------------");
            g.Python();
        }
        System.out.println("Enter Student Marks For Exams OUT OF 50");
        marks3 = sc.nextInt();
        if (marks3>50){
            System.out.println("Invalid input enter again");
            System.out.println("------------------------------------");
            g.Python();
        }
        total3 = marks1+marks2+marks3;
        System.out.println("Your Python Subject Marks is "+total3);
        System.out.println("------------------------------------");
    }

    // SQL Subject Collecting Data Function
    void SQl(){
        int marks1,marks2,marks3;
        grade g=new grade();
        System.out.println("Enter SQl subject Marks");
        System.out.println("Enter Student Marks For Assignment OUT OF 30");
        marks1 = sc.nextInt();
        if (marks1>30){
            System.out.println("Invalid input enter again");
            System.out.println("------------------------------------");
            g.SQl();
        }

        System.out.println("Enter Student Marks For Quiz OUT OF 20");
        marks2 = sc.nextInt();
        if (marks2>20){
            System.out.println("Invalid input enter again");
            System.out.println("------------------------------------");
            g.SQl();
        }

        System.out.println("Enter Student Marks For Exams OUT OF 50");
        marks3 = sc.nextInt();
        if (marks3>50){
            System.out.println("Invalid input enter again");
            System.out.println("------------------------------------");
            g.SQl();
        }
        total4 = marks1+marks2+marks3;
        System.out.println("Your SQl Subject Marks is "+total4);
        System.out.println("------------------------------------");
    }

    // Javascript Subject Collecting Data Function
    void JavaScript(){
        int marks1,marks2,marks3;
        grade g=new grade();
        System.out.println("Enter JavaScript subject Marks");
        System.out.println("Enter Student Marks For Assignment OUT OF 30");
        marks1 = sc.nextInt();
        if (marks1>30){
            System.out.println("Invalid input enter again");
            System.out.println("------------------------------------");
            g.JavaScript();
        }

        System.out.println("Enter Student Marks For Quiz OUT OF 20");
        marks2 = sc.nextInt();
        if (marks2>20){
            System.out.println("Invalid input enter again");
            System.out.println("------------------------------------");
            g.JavaScript();
        }

        System.out.println("Enter Student Marks For Exams OUT OF 50");
        marks3 = sc.nextInt();
        if (marks3>50){
            System.out.println("Invalid input enter again");
            System.out.println("------------------------------------");
            g.JavaScript();
        }
        total5 = marks1+marks2+marks3;
        System.out.println("Your JavaScript Subject Marks is "+total5);
        System.out.println("------------------------------------");
    }

    // Sum Function
    void Total(){
        mtotal=total1+total2+total3+total4+total5;
        System.out.println("Overall subjects total is "+mtotal+" Out of 500");
        System.out.println("------------------------------------");
    }
    // Percentage Function
    void Percentage(){
        per=mtotal/5;
        System.out.println("Percentage is "+per);
        System.out.println("------------------------------------");
    }

    // Exit Function to Terminate the Program
    void exit1(){
        grade c1 = new grade();
        char last;

        System.out.println("Do you wish to Enter again Students Marks");
        System.out.println("For continue press y or Y");
        System.out.println("For continue press n or N");
        last = sc.next().charAt(0);
        System.out.println("---------------------------");

        if (last == 'y' || last == 'Y') {
            c1.main1();
        }else if (last == 'n' || last == 'N') {
            System.out.println("Program Exited Succesfully");
            System.out.println("---------------------------");
            System.exit(0);// I have use exit to terminate the program

        }
        else{
            System.out.println("Invalid Input Enter again Y or N");
            c1.exit1();
        }
    }

    //Converting Percentage into Grade Function
    void Grade(){
        grade g = new grade();

        if (per>=80 )
        {
            System.out.println("#################################");
            System.out.println("Excellent!You Passed with A Grade");
            System.out.println("#################################");
            g.exit1();
        }
        if (per>=65)
        {
            System.out.println("#################################");
            System.out.println("Great!You Passed with B Grade");
            System.out.println("#################################");
            g.exit1();
        }

        if (per>=50)
        {
            System.out.println("#################################");
            System.out.println("Good!You Passed with C Grade");
            System.out.println("#################################");
            g.exit1();
        }

        else  if (per>=35) {
            System.out.println("#################################");
            System.out.println("Nice!You Passed with D Grade ");
            System.out.println("#################################");
            g.exit1();
        }
        else if (per<35)
        {
            System.out.println("#################################");
            System.out.println("You are just Failed Your Grade is F") ;
            System.out.println("#################################");
            g.exit1();
        }
    }

    // Combined function to work according to our needs
 void main1 ()
 {
    grade obj = new grade();
     // Calling Function in Sequence
     obj.Design();
     obj.java();
     obj.C();
     obj.Python();
     obj.SQl();
     obj.JavaScript();
     obj.Total();
     obj.Percentage();
     obj.Grade();
 }

    // Main Function Without this Program Cannot Run
 public static void main(String[] args){
     // Object of Grade Class
        grade obj=new grade();
        //Starting the Program From Calling main1 Function
       obj.main1();
 }
}