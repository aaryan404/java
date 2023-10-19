 import java.util.ArrayList;
 import java.util.Scanner;
  public class taskManager_v2{
    public static void choices(){
        System.out.println("1. Add task");
        System.out.println("2. view tasks");
        System.out.println("3. Delete task");
        System.out.println("4. Exit");

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();
        boolean a = true;
        System.out.println("*****welcome to task manager*****");
        while (a == true) {
            choices();
            System.out.println("_______________ ");


            System.out.println("Enter your choice: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:

                    System.out.println("Enter your task: ");
                    input.nextLine();
                    String newTask = input.nextLine();
                    tasks.add(newTask);
                    System.out.println("Task has been added: " + newTask);

                    break;

                case 2:
                    for (int i = 0 ; i < tasks.size() ; i++) {
                        System.out.println("_______________");
                        System.out.println(i+1+"." +" "+tasks.get(i));
                    }
                    System.out.println("_______________");
                    break;

                case 3:
                    System.out.print("which task do you want to delete: ");
                    int delTask = input.nextInt();
                    System.out.println("Latest delete : " + tasks.get(delTask -1));
                    tasks.remove(delTask-1);

                    break;

                case 4:
                    System.out.println("exiting the program....");
                    System.exit(0);
                    a = false;
                    break;
            }
        }


    }

}