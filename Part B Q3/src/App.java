import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Terrace[] terrace = new Terrace[10];
        Scanner strInput = new Scanner(System.in);
        Scanner intInput = new Scanner(System.in);
        int doubleStoreyCount = 0;
        double totalRent = 0.00;

        for (int i = 0; i < terrace.length; i++) {
            System.out.println("House " + (i + 1));
            System.out.print("Tenant: ");
            String tenant = strInput.nextLine();
            System.out.print("IC No: ");
            String ICNo = strInput.nextLine();
            System.out.print("Address: ");
            String address = strInput.nextLine();
            System.out.print("Type (single-storey or double-storey): ");
            String type = strInput.nextLine();
            System.out.print("Corner Lot (Yes or No): ");
            String status = strInput.nextLine();

            terrace[i] = new Terrace(tenant, ICNo, address, type, status);
        }

        System.out.println("\nTenants for double-storey terrace corner lot:");
        for (int i = 0; i < terrace.length; i++) {
            if (terrace[i].getType().equals("double-storey") && terrace[i].getStatus().equals("Yes")) {
                System.out.println(terrace[i].getTenant());
                doubleStoreyCount++;
            }
        }

        System.out.println("\nTotal double-storey terrace corner lot: " + doubleStoreyCount);

        for (int i = 0; i < terrace.length; i++) {
            totalRent += terrace[i].calcPrice();
        }

        System.out.println("Total rent for all houses: RM" + totalRent);

        System.out.println("\nType of house rented by a tenant named 'Ali bin Abu':");
        for (int i = 0; i < terrace.length; i++) {
            if (terrace[i].getTenant().equals("Ali bin Abu"))
                System.out.println(terrace[i].getType());
        }

        strInput.close();
        intInput.close();

    }
}
