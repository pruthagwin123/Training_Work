// public class Main {
//     public static void main(String[] args) {

//         Runnable task = () -> {
//             String name = Thread.currentThread().getName();
//             System.out.println("Thread is running...");
//             System.out.println("Thread name: " + name);
//         };

//         Thread t = new Thread(task);
//         t.start();
//     }
// }



// class TicketCounter {
//     private int availableTickets = 60;

//     synchronized boolean bookTicket() {
//         if (availableTickets <= 0)
//             return false;

//         availableTickets--;
//         return true;
//     }

//     public int getAvailableTicket() {
//         return availableTickets;
//     }
// }

// public class Main {
//     public static void main(String[] args) throws InterruptedException {

//         TicketCounter t = new TicketCounter();

//         Runnable customer = () -> {
//             boolean statusOfTicket = t.bookTicket();

//             System.out.println(
//                 Thread.currentThread().getName() + " " +
//                 (statusOfTicket ? "Booked" : "Not Booked")
//             );
//         };

//         Thread a = new Thread(customer, "customerA");
//         Thread b = new Thread(customer, "customerB");

//         a.start();
//         b.start();

//         a.join();
//         b.join();

//         System.out.println("Completed " + t.getAvailableTicket());
//     }
// }


import java.util.Scanner;

class CouponCounter {

    private int availableCoupons = 10;

    synchronized boolean getCoupon() {

        if (availableCoupons <= 0) {
            return false;
        }

        availableCoupons--;
        return true;
    }
}

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of members in the line: ");
        int numberOfMembers = sc.nextInt();

        CouponCounter couponCounter = new CouponCounter();

        Thread[] members = new Thread[numberOfMembers];

        for (int i = 0; i < numberOfMembers; i++) {

            int memberNumber = i + 1;

            Runnable member = () -> {

                boolean hasCoupon = couponCounter.getCoupon();

                System.out.println(
                    "Member " + memberNumber + " -> " +
                    (hasCoupon ? "Coupon" : "No Coupon")
                );
            };

            members[i] = new Thread(member, "Member-" + memberNumber);

            members[i].start();
        }

        for (Thread member : members) {
            member.join();
        }

        sc.close();
    }
}