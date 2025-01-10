package taskmanagement;
import java.util.Date;

public class Task {
    private final String id;
    private String title;
    private String desc;
    private Date due;
    private TaskStatus status;
    private TaskPriority priority;
    private User assignedUser;

    @Override
    public String toString() {
        return "Task{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", desc='" + desc + '\'' +
                ", due=" + due +
                ", status=" + status +
                ", priority=" + priority +
                ", assignedUser=" + assignedUser +
                '}';
    }

    public User getAssignedUser() {
        return assignedUser;
    }

    public void setAssignedUser(User assignedUser) {
        this.assignedUser = assignedUser;
    }

    public Task(String id, String title, String desc, Date due, TaskStatus status, TaskPriority priority, User assignedUser) {
        this.id = id;
        this.title = title;
        this.desc = desc;
        this.due = due;
        this.status = status;
        this.priority = priority;
        this.assignedUser=assignedUser;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Date getDue() {
        return due;
    }

    public void setDue(Date due) {
        this.due = due;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public TaskPriority getPriority() {
        return priority;
    }

    public void setPriority(TaskPriority priority) {
        this.priority = priority;
    }

}
