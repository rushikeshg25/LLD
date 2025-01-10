import taskmanagement.*;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws Exception {
        // Get the TaskManager instance
        TaskManager taskManager = TaskManager.getInstance();

        // Add users
        User user1 = new User("U001", "Alice");
        User user2 = new User("U002", "Bob");
        taskManager.addUser(user1);
        taskManager.addUser(user2);

        // Create tasks
        Task task1 = new Task(
                "T001",
                "Design Database",
                "Create ER diagrams and schema for the project",
                getDateOffsetFromToday(5), // 5 days from today
                TaskStatus.PENDING,
                TaskPriority.HIGH
        );

        Task task2 = new Task(
                "T002",
                "Write Documentation",
                "Draft the API documentation",
                getDateOffsetFromToday(10), // 10 days from today
                TaskStatus.INPROGRESS,
                TaskPriority.LOW
        );

        // Add tasks to the TaskManager
        taskManager.addTask(task1.getAssignedUser());
        taskManager.addTask(task2.getAssignedUser());

        // Assign tasks to users
        taskManager.assignTaskToUser("T001", "U001");
        taskManager.assignTaskToUser("T002", "U002");

        // List all tasks
        System.out.println("All Tasks:");
        for (Task task : taskManager.listAllTasks()) {
            System.out.println(task);
        }

        // List all users
        System.out.println("\nAll Users:");
        for (User user : taskManager.listAllUsers()) {
            System.out.println(user);
        }

        // Update a task
        taskManager.updateTask(
                "T001",
                "Design Database Schema",
                "Update ER diagrams and schema for the project",
                getDateOffsetFromToday(7), // Extended deadline
                TaskStatus.INPROGRESS,
                TaskPriority.HIGH
        );


        System.out.println("\nUpdated Task T001:");
        System.out.println(taskManager.getTask("T001"));


        taskManager.removeTask("T002");
        System.out.println("\nAfter removing Task T002:");
        for (Task task : taskManager.listAllTasks()) {
            System.out.println(task);
        }
    }

    // Utility method to get a Date object for a specified number of days from today
    private static Date getDateOffsetFromToday(int days) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, days);
        return calendar.getTime();
    }
}