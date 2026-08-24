import java.util.ArrayList;
import java.util.Scanner;

public class Admin extends User{
    private int aid;
    private String aname;

    private ArrayList<Customer> customers = new ArrayList<>();

    public Admin() {
        setUsername("admin");
        setPassword("admin123");
    }

    public Admin(int aid, String aname, String username, String password){
        super(username, password);
        this.aid = aid;
        this.aname = aname;
    }

    public int getAid(){
        return aid;
    }

    public String getAname(){
        return aname;
    }

    public void setAid(int aid){
        this.aid = aid;
    }

    public void setAname(String aname){
        this.aname = aname;
    }

    public void addCustomer(Scanner sc){
        Customer customer = new Customer();
        System.out.println("\n===== ADD CUSTOMER =====");
        System.out.print("Enter Customer ID : ");
        customer.setCid(sc.nextInt());
        sc.nextLine();

        System.out.print("Enter Customer Name : ");
        customer.setCname(sc.nextLine());

        System.out.print("Enter Username : ");
        customer.setUsername(sc.nextLine());

        System.out.print("Enter Password : ");
        customer.setPassword(sc.nextLine());

        customers.add(customer);

        System.out.println("Customer Added Successfully.");
    }

    public void viewCustomers(){
        if(customers.isEmpty()){
            System.out.println("No Customers Found.");
            return;
        }

        System.out.println("\n========== CUSTOMER LIST ==========");
        for(Customer customer : customers){
            System.out.println("--------------------------------");
            System.out.println("Customer ID   : " + customer.getCid());
            System.out.println("Customer Name : " + customer.getCname());
            System.out.println("Username      : " + customer.getUsername());
            System.out.println("--------------------------------");
        }
    }

    public void editCustomer(Scanner sc){
        if(customers.isEmpty()){
            System.out.println("No Customers Found.");
            return;
        }

        System.out.print("Enter Customer ID : ");
        int id = sc.nextInt();
        sc.nextLine();

        for(Customer customer : customers){
            if(customer.getCid() == id){
                System.out.println("\n1. Edit Name");
                System.out.println("2. Edit Username");
                System.out.println("3. Edit Password");
                System.out.print("Enter Choice : ");

                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice){
                    case 1:
                        System.out.print("Enter New Name : ");
                        customer.setCname(sc.nextLine());
                        break;

                    case 2:

                        System.out.print("Enter New Username : ");
                        customer.setUsername(sc.nextLine());
                        break;

                    case 3:

                        System.out.print("Enter New Password : ");
                        customer.setPassword(sc.nextLine());
                        break;

                    default:

                        System.out.println("Invalid Choice.");
                        return;
                }
                System.out.println("Customer Updated Successfully.");
                return;
            }
        }
        System.out.println("Customer Not Found.");
    }
    public void deleteCustomer(Scanner sc){
        if(customers.isEmpty()){
            System.out.println("No Customers Found.");
            return;
        }
        System.out.print("Enter Customer ID : ");
        int id = sc.nextInt();
        for(int i = 0; i < customers.size(); i++){
            if(customers.get(i).getCid() == id){
                customers.remove(i);
                System.out.println("Customer Deleted Successfully.");
                return;
            }
        }
        System.out.println("Customer Not Found.");
    }

    public Customer customerLogin(String username, String password){
        for(Customer customer : customers){
            if(customer.getUsername().equals(username)
                    && customer.getPassword().equals(password)){
                return customer;
            }
        }
        return null;
    }
}