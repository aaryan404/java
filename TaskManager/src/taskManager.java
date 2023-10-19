import java.util.ArrayList;
import java.util.Scanner;

public class taskManager{
    public static void choices(){
        System.out.println("***Welcome to the Task Manager***");
        System.out.println("1. Add Task");
        System.out.println("2. View Tasks");
        System.out.println("3. Delete Tasks");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();

        while (true) {
            choices();
            int choice = sc.nextInt();
            switch (choice) {
                case 1:

                        System.out.println("Enter your task: ");
                        sc.nextLine();
                        String newTask = sc.nextLine();
                        tasks.add(newTask);
                        System.out.println("new task added: " + tasks.get(0));
                        System.out.println("the size of the task array is : " + tasks.size());
                    break;
                case 2:
                    if(tasks.isEmpty()){
                        System.out.println("there is no task to view.");
                    } else {
                        System.out.println("you choose 2");
                        System.out.println(tasks.size());
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println(tasks.get(i));
                        }
                    }
                    break;
                case 3:
                    if(tasks.isEmpty()){
                        System.out.println("there is no task to delete.");
                    }
                    System.out.println("Enter the position of the task to delete");
                     int deleteTask = sc.nextInt();
                     if(deleteTask > tasks.size() || deleteTask < 1){
                         System.out.println("there is no task at that position");
                         break;
                     }
                    tasks.remove(deleteTask -1);
                    System.out.println("you deleted " + deleteTask+ " task.");
                    break;
                case 4:
                    System.out.println("exiting the task manager......");
                    System.exit(0);
                    break;

                default:
                    System.out.println("invalid choice");
                    break;
            }


        }
    }
}