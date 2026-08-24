import java.util.ArrayList;
import java.util.Scanner;

public class Customer extends User{

    private int cid;
    private String cname;

    private ArrayList<Task> tasks = new ArrayList<>();
    public Customer(){

    }
    public Customer(int cid, String cname, String username, String password){
        super(username, password);
        this.cid = cid;
        this.cname = cname;
    }

    public int getCid(){
        return cid;
    }

    public String getCname(){
        return cname;
    }

    public void setCid(int cid){
        this.cid = cid;
    }

    public void setCname(String cname){
        this.cname = cname;
    }

    public void addTask(Scanner sc){
        Task task = new Task();

        System.out.println("\n===== ADD TASK =====");

        System.out.print("Enter Task ID : ");
        task.setTaskId(sc.nextInt());
        sc.nextLine();

        System.out.print("Enter Task Name : ");
        task.setTaskName(sc.nextLine());

        System.out.print("Enter Description : ");
        task.setDescription(sc.nextLine());

        task.setCreatedBy(getUsername());
        tasks.add(task);
        System.out.println("Task Added Successfully.");
    }

    public void viewTasks(){
        if(tasks.isEmpty()){
            System.out.println("No Tasks Available.");
            return;
        }
        System.out.println("\n===== TASK LIST =====");
        for(Task task : tasks){
            task.displayTask();
        }
    }

    public void updateTask(Scanner sc){
        if(tasks.isEmpty()){
            System.out.println("No Tasks Available.");
            return;
        }
        System.out.print("Enter Task ID : ");
        int id = sc.nextInt();
        sc.nextLine();

        for(Task task : tasks){
            if(task.getTaskId() == id){
                System.out.println("1. Update Task Name");
                System.out.println("2. Update Description");
                System.out.print("Enter Choice : ");

                int choice = sc.nextInt();
                sc.nextLine();
                switch(choice){
                    case 1:
                        System.out.print("Enter New Task Name : ");
                        task.setTaskName(sc.nextLine());
                        break;
                    case 2:
                        System.out.print("Enter New Description : ");
                        task.setDescription(sc.nextLine());
                        break;
                    default:
                        System.out.println("Invalid Choice.");
                }
                System.out.println("Task Updated Successfully.");
                return;
            }
        }
        System.out.println("Task Not Found.");
    }
    public void deleteTask(Scanner sc){
        if(tasks.isEmpty()){
            System.out.println("No Tasks Available.");
            return;
        }

        System.out.print("Enter Task ID : ");
        int id = sc.nextInt();

        for(int i = 0; i < tasks.size(); i++){
            if(tasks.get(i).getTaskId() == id){
                tasks.remove(i);
                System.out.println("Task Deleted Successfully.");
                return;
            }
        }
        System.out.println("Task Not Found.");
    }
}