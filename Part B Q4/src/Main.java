import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner strInput = new Scanner(System.in);
        Scanner intInput = new Scanner(System.in);

        System.out.print("Enter amount of baju kurung: ");
        int bajuKurungAmount = intInput.nextInt();

        System.out.print("Enter amount of baju melayu: ");
        int bajuMelayuAmount = intInput.nextInt();

        TailorOrder[] tailorOrders = new TailorOrder[bajuKurungAmount + bajuMelayuAmount];
        BajuKurung[] bajuKurungs = new BajuKurung[bajuKurungAmount];
        BajuMelayu[] bajuMelayus = new BajuMelayu[bajuMelayuAmount];

        System.out.println("\nBaju Kurung");
        for (int i = 0; i < bajuKurungAmount; i++) {
            System.out.print("Enter customer name: ");
            String custName = strInput.nextLine();

            System.out.print("Enter order number: ");
            String orderNum = strInput.nextLine();

            System.out.print("Enter deposit: ");
            double deposit = intInput.nextDouble();

            System.out.print("Enter delivery (true/false): ");
            boolean delivery = strInput.nextBoolean();

            System.out.print("Enter type (1/2/3/4): ");
            int type = intInput.nextInt();

            System.out.print("Enter embroidery (true/false): ");
            boolean embroidery = strInput.nextBoolean();

            bajuKurungs[i] = new BajuKurung(custName, orderNum, deposit, delivery, type, embroidery);
            tailorOrders[i] = bajuKurungs[i];
        }

        System.out.println("\nBaju Melayu");
        for (int i = 0; i < bajuMelayuAmount; i++) {
            System.out.print("Enter customer name: ");
            String custName = strInput.nextLine();

            System.out.print("Enter order number: ");
            String orderNum = strInput.nextLine();

            System.out.print("Enter deposit: ");
            double deposit = intInput.nextDouble();

            System.out.print("Enter delivery (true/false): ");
            boolean delivery = strInput.nextBoolean();

            System.out.print("Enter type (1/2): ");
            int type = intInput.nextInt();

            bajuMelayus[i] = new BajuMelayu(custName, orderNum, deposit, delivery, type);
            tailorOrders[i + bajuKurungAmount] = bajuMelayus[i];
        }

        int embroideryAmount = 0;
        for (int i = 0; i < bajuKurungAmount; i++) {
            if (bajuKurungs[i].getEmbroidery()) {
                embroideryAmount++;
            }
        }

        System.out.println("\nNumber of customer orders for baju Kurung with embroidery: " + embroideryAmount);

        double totalPayment = 0;
        System.out.print("Delivery? (true/false): ");
        boolean delivery = strInput.nextBoolean();

        if (delivery)
            totalPayment += 5.00;

        System.out.printf("%-20s %-8s", "Order Number", "Price(RM)");
        System.out.println();
        System.out.printf("%-20s %-8s", "=============", "========");

        for (int i = 0; i < bajuKurungAmount + bajuMelayuAmount; i++) {
            System.out.printf("\n%-20s %-8.2f", tailorOrders[i].getOrderNum(), tailorOrders[i].payment());
            totalPayment += tailorOrders[i].payment();
        }

        System.out.println("\n");
        System.out.printf("%-20s %-8.2f", "", "Total: RM" + totalPayment);

    }
}
