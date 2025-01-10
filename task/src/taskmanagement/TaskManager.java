package taskmanagement;

import javax.xml.crypto.Data;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class TaskManager {
    private static TaskManager instance;
    private final Map<String,Task> tasks;
    private final Map<String,User> users;

    private TaskManager(){
        tasks=new HashMap<>();
        users=new HashMap<>();
    }

    public static TaskManager getInstance(){
        if (instance == null){
            instance=new TaskManager();
        }
        return instance;
    }

    public void addTask(User user) throws Exception {
        if(users.containsKey(user.getId())){
            throw new Exception("User exists");
        }
        users.put(user.getId(),user);
    }

    public Task getTask(String taskId){
        return tasks.get(taskId);
    }

    public void removeTask(String taskId) throws Exception{
        if(tasks.containsKey(taskId)){
            throw new Exception("No such Task");
        }
        tasks.remove(taskId);
    }


    public Collection<Task> listAllTasks() {
        return tasks.values();
    }

    public void addUser(User user) {
        if (users.containsKey(user.getId())) {
            throw new IllegalArgumentException("User with ID already exists: " + user.getId());
        }
        users.put(user.getId(), user);
    }

    public void updateTask(String id, String title, String desc, Date due, TaskStatus status, TaskPriority priority){
        Task task = getTask(id);
        if (task == null) {
            throw new IllegalArgumentException("Task with ID not found: " + id);
        }
        task.setTitle(title);
        task.setDesc(desc);
        task.setDue(due);
        task.setStatus(status);
        task.setPriority(priority);
    }


    public User getUser(String id) {
        return users.get(id);
    }

    public void assignTaskToUser(String taskId, String userId) {
        Task task = getTask(taskId);
        User user = getUser(userId);
        if (task == null) {
            throw new IllegalArgumentException("Task with ID not found: " + taskId);
        }
        if (user == null) {
            throw new IllegalArgumentException("User with ID not found: " + userId);
        }
        // Add logic to maintain a mapping of tasks to users if needed
        System.out.println("Task " + taskId + " assigned to user " + userId);
    }


    // List all users
    public Collection<User> listAllUsers() {
        return users.values();
    }

    @Override
    public String toString() {
        return "TaskManager{" +
                "tasks=" + tasks.values() +
                ", users=" + users.values() +
                '}';
    }

}
