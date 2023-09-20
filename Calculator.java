//Importing Scanner class for basic java functions
import java.util.Scanner;
// Class for our Calculator program
class Calculator
{
    // Global variables
    int num1,num2,result,last;
    // Object of Scanner Class
    Scanner obj = new Scanner(System.in);
    // Addition Function
    void add1(){
        System.out.println("Please Enter two numbers for addition");
        num1 = obj.nextInt();
        num2 = obj.nextInt();

        result = num1 + num2;

        System.out.println("The addition is " + result);
        System.out.println("---------------------------");
    }
    // Subtraction Function
    void sub1(){
        System.out.println("Please Enter two numbers for subtraction");
        num1 = obj.nextInt();
        num2 = obj.nextInt();

        result = num1 - num2;

        System.out.println("The subtraction is " + result);
        System.out.println("---------------------------");
    }
    // Multiplication Function
    void mul1(){
        System.out.println("Please Enter two numbers for multiplication");
        num1 = obj.nextInt();
        num2 = obj.nextInt();

        result = num1 * num2;

        System.out.println("The multiplication is " + result);
        System.out.println("---------------------------");
    }
    // Division Function
    void div1(){
        System.out.println("Please Enter two numbers for division");
        num1 = obj.nextInt();
        num2 = obj.nextInt();
        // Object of calculator Class
        Calculator obj5 = new Calculator();

        //Exeption handling for division of 0
        if (num1 == 0 || num2 == 0)
        {
            try {
                int result = num1 / num2;
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Error: Number cannot be divided by zero ");
                System.out.println("---------------------------");
            }
            System.out.println("Please try again because 0 cannot be divided");
            obj5.div1();
        }
        else  {
            result = num1 / num2;
            System.out.println("The division is " + result);
            System.out.println("---------------------------");
        }


    }
    // Exit Function to Terminate the Program
    void exit1(){
        Calculator c1 = new Calculator();
        System.out.println("Do you wish to continue");
        System.out.println("For continue press y or Y");
        System.out.println("For continue press n or N");
        last = obj.next().charAt(0);
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
    // Design function
    void header(){

        System.out.println("\t========================================================================");
        System.out.println( "\t============================   CALCULATOR   ============================");
        System.out.println( "\t========================================================================");
        System.out.println("PROJECT BY : Nitesh Raut \n");
    }
    // Combined function to work according to our needs
    void main1()
    {
        Scanner obj = new Scanner(System.in);
        Calculator c = new Calculator();
        int choice;
        for (int i=1;i<=5;i++) {
            i = 1;
            System.out.println("Please Enter a Choice between 1 to 4 for Artihmetic Operations  ");
            System.out.println("  1 For   Addition                                             ");
            System.out.println("  2 For Subtraction                                            ");
            System.out.println("  3 For Multiplication                                         ");
            System.out.println("  4 For Division                                               ");
            System.out.println("  5 For Exit                                                   ");
            choice = obj.nextInt();


            switch (choice) {
                case 1:
                   c.add1();
                    break;
                case 2:
                    c.sub1();
                    break;
                case 3:
                    c.mul1();
                    break;
                case 4:
                    c.div1();
                    break;
                case 5:
                    c.exit1();
                    break;
                default:
                    System.out.println("Invalid Input Enter between 1 to 5 ");
                    System.out.println("---------------------------");
                }
                    }

            }
        // Main Function Without this Program Cannot Run
        public static void main(String[] args){
        // Object of Calculator Class
        Calculator c2 = new Calculator();
        // Calling Function in Sequence
        c2.header();
        c2.main1();
        }
}