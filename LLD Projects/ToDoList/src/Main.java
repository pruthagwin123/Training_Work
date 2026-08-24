import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Admin admin = new Admin();

        int choice;

        do {

            System.out.println("\n=================================");
            System.out.println("        TO DO LIST SYSTEM");
            System.out.println("=================================");
            System.out.println("1. Admin Login");
            System.out.println("2. Customer Login");
            System.out.println("3. Exit");
            System.out.print("Enter Your Choice : ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Admin Username : ");
                    String adminUser = sc.nextLine();

                    System.out.print("Enter Admin Password : ");
                    String adminPass = sc.nextLine();

                    if (admin.login(adminUser, adminPass)) {

                        admin.login();
                        adminMenu(admin, sc);

                    } else {

                        System.out.println("Invalid Username or Password.");

                    }

                    break;

                case 2:

                    System.out.print("Enter Customer Username : ");
                    String customerUser = sc.nextLine();

                    System.out.print("Enter Customer Password : ");
                    String customerPass = sc.nextLine();

                    Customer customer = admin.customerLogin(customerUser, customerPass);

                    if (customer != null) {

                        customer.login();
                        customerMenu(customer, sc);

                    } else {

                        System.out.println("Invalid Username or Password.");

                    }

                    break;

                case 3:

                    System.out.println("Thank You...");
                    break;

                default:

                    System.out.println("Invalid Choice.");

            }

        } while (choice != 3);

        sc.close();
    }

    public static void adminMenu(Admin admin, Scanner sc) {

        int choice;

        do {

            System.out.println("\n========== ADMIN MENU ==========");
            System.out.println("1. Add Customer");
            System.out.println("2. Edit Customer");
            System.out.println("3. Delete Customer");
            System.out.println("4. View Customers");
            System.out.println("5. Logout");
            System.out.print("Enter Your Choice : ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    admin.addCustomer(sc);
                    break;

                case 2:
                    admin.editCustomer(sc);
                    break;

                case 3:
                    admin.deleteCustomer(sc);
                    break;

                case 4:
                    admin.viewCustomers();
                    break;

                case 5:
                    System.out.println("Logged Out Successfully.");
                    break;

                default:
                    System.out.println("Invalid Choice.");

            }

        } while (choice != 5);
    }

    public static void customerMenu(Customer customer, Scanner sc) {

        int choice;

        do {
            System.out.println("\n========= CUSTOMER MENU =========");
            System.out.println("1. Add Task");
            System.out.println("2. Update Task");
            System.out.println("3. Delete Task");
            System.out.println("4. View Tasks");
            System.out.println("5. Logout");
            System.out.print("Enter Your Choice : ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    customer.addTask(sc);
                    break;

                case 2:
                    customer.updateTask(sc);
                    break;

                case 3:
                    customer.deleteTask(sc);
                    break;

                case 4:
                    customer.viewTasks();
                    break;

                case 5:
                    System.out.println("Logged Out Successfully.");
                    break;

                default:
                    System.out.println("Invalid Choice.");

            }

        } while (choice != 5);
    }
}