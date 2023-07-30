import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner strInput = new Scanner(System.in);
        Scanner intInput = new Scanner(System.in);

        Order[] orders = new Order[10];

        for (int i = 0; i < orders.length; i++) {
            System.out.println("Order " + (i + 1));
            System.out.print("Enter name: ");
            String name = strInput.nextLine();
            System.out.print("Enter phone number: ");
            String phoneNo = strInput.nextLine();
            System.out.print("Enter day (1-31): ");
            int day = intInput.nextInt();
            System.out.print("Enter month (1-12): ");
            int month = intInput.nextInt();
            System.out.print("Enter year: ");
            int year = intInput.nextInt();
            System.out.print("Enter packages (A/B/C): ");
            char packages = strInput.nextLine().charAt(0);
            System.out.print("Enter number of customer: ");
            int numCustomer = intInput.nextInt();

            orders[i] = new Order(name, phoneNo, new Dates(day, month, year), packages, numCustomer);

        }

        System.out.println("Order List");
        for (int i = 0; i < orders.length; i++) {
            System.out.println("Order " + (i + 1));
            System.out.println(orders[i].toString());
        }

    }
}
