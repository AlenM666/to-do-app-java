import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ToDoListApp {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("To-Do List Application");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Mark Task as Complete");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            //for user input
            int choice = scanner.nextInt();
            scanner.nextLine();


            switch (choice){
                case 1:
                    // Implement the logic to add a task
                    System.out.print("Enter task name: \n");
                    String taskName = scanner.nextLine();
                    tasks.add(taskName);
                    System.out.println("Task '" + taskName + "' added.\n");

                    break;
                case 2:
                    // Implement the logic to view tasks
                    System.out.println("\nTasks:");
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println((i + 1) + ". " + tasks.get(i));
                    }
                    break;
                case 3:
                    // Implement the logic to mark a task as complete

                    break;
                case 4:
                    // Implement the logic to delete a task
                    break;
                case 5:
                    // Exit the program
                    System.out.println("Exiting the program. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");


            }
        }
    }
}


class Task {
    private String name;
    private String description;
    private boolean completed;

    // Constructors, getters, and setters for the Task class
}

