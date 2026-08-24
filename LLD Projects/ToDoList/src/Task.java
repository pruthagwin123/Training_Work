public class Task {

    private int taskId;
    private String taskName;
    private String description;
    private String createdBy;

   public Task(){

    }

    public Task(int taskId, String taskName, String description, String createdBy){
        this.taskId = taskId;
        this.taskName = taskName;
        this.description = description;
        this.createdBy = createdBy;
    }

    public int getTaskId(){
        return taskId;
    }

    public String getTaskName(){
        return taskName;
    }

    public String getDescription(){
        return description;
    }

    public String getCreatedBy(){
        return createdBy;
    }

    public void setTaskId(int taskId){
        this.taskId = taskId;
    }

    public void setTaskName(String taskName){
        this.taskName = taskName;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setCreatedBy(String createdBy){
        this.createdBy = createdBy;
    }

    public void displayTask(){
        System.out.println("--------------------------------");
        System.out.println("Task ID      : " + taskId);
        System.out.println("Task Name    : " + taskName);
        System.out.println("Description  : " + description);
        System.out.println("Created By   : " + createdBy);
        System.out.println("--------------------------------");

    }
}