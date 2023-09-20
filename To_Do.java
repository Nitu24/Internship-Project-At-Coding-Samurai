//Importing all class for basic java functions
import java.util.*;
// Class for our To_Do_List program
 class ToDoList {

     //Using DataStructure of ArrayList
    // Declaring ArrayList
    public static ArrayList<String> tasks = new ArrayList<String>();
    public static ArrayList<String> dec = new ArrayList<>();
    public static ArrayList<String> date = new ArrayList<>();

    // Main Function Without this Program Cannot Run
    public static void main(String[] args) {
        // Object of ToDolist Class
        ToDoList manager = new ToDoList();
        //Object of Scanner Class
        Scanner in = new Scanner(System.in);
        int choice;
        // Calling Design Function
        manager.header();
        //Menu For Accessing Function
        while (true) {
            System.out.println("1. Add task");
            System.out.println("2. Remove task");
            System.out.println("3. Completed task Or Mark task");
            System.out.println("4. View tasks");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            //Exception Handling For Other Input
            try {
                choice = in.nextInt();

                switch (choice) {
                    case 1:
                        addTask();
                        break;
                    case 2:
                        removeTask();
                        break;
                    case 3:
                        displayTasks();
                        System.out.print("Enter task number to mark as complete: ");
                        int taskIndex = in.nextInt();
                        //Passing the Value
                        manager.markTask(taskIndex);
                        break;
                    case 4:
                        viewTasks();
                        break;
                    case 5:
                        exit();
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                in.nextLine();
            }
        }
    }

    //Design Function
     void header(){

         System.out.println("\t========================================================================");
         System.out.println( "\t============================   To_Do_List   ============================");
         System.out.println( "\t========================================================================");
         System.out.println("PROJECT BY : Nitesh Raut \n");
     }

     // Entering New Task Function
    public static void addTask() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter task: ");
        tasks.add(in.nextLine());
        System.out.println("Enter description: ");
        dec.add(in.nextLine());
        System.out.println("Enter due date: ");
        date.add(in.nextLine());
        System.out.println("------------------------------------");
        System.out.println("Your Task is Added");
        System.out.println("------------------------------------");
    }

    //Delete Task function
    public static void removeTask() {
        Scanner in = new Scanner(System.in);
        int taskNum;

        displayTasks();
        System.out.print("Enter task number to Remove: ");
        // Exception Handling For Other Input
        try {
            taskNum = in.nextInt();
            if (taskNum <= 0 || taskNum > tasks.size()) {
                throw new IndexOutOfBoundsException();
            }
            tasks.remove(taskNum - 1);
            dec.remove(taskNum - 1);
            date.remove(taskNum - 1);
            System.out.println("------------------------------------");
            System.out.println("Your Task is Removed");
            System.out.println("------------------------------------");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");
            System.out.println("------------------------------------");
            in.nextLine();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid task number. Please try again.");
            System.out.println("------------------------------------");
        }
    }

    // To Complete Task Function
     public static void markTask(int index) {

         if (index >= 1 && index <= tasks.size()) {
             tasks.set(index - 1 , tasks.get(index - 1)+" [Completed]");
             System.out.println("------------------------------------");
             System.out.println("Your Task has been Completed");
             System.out.println("------------------------------------");
         } else {
             System.out.println("Invalid task index.");
             System.out.println("------------------------------------");
         }

     }
     //Sub Function to help others Functions to Display Which Task is Stored
    public static void displayTasks() {

        if (tasks.isEmpty()) {
            System.out.println("No tasks to display");
            System.out.println("------------------------------------");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                //Accessing through ArrayList DataStructure
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    //View Task Function
    public static void viewTasks(){
        if (tasks.isEmpty()) {
            System.out.println("No tasks to display");
            System.out.println("------------------------------------");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                //Accessing through ArrayList DataStructure
                System.out.println((i + 1) + ". Title " + tasks.get(i)+" Description " + dec.get(i)+" Due date " + date.get(i));
                System.out.println("---------------------------------------------------------------------------------------------");
            }
        }
    }

    // Exit Function to Terminate the Program
    public static void exit() {
        System.out.println("Exiting program");
        System.out.println("------------------------------------");
        System.exit(0);
    }
}