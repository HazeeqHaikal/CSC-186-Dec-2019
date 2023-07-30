import java.util.Date;

public class Order {
    private String name;
    private String phoneNo;
    private Dates date;
    private char packages;
    private int numCustomer;

    public Order(String name, String phoneNo, Dates date, char packages, int numCustomer) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.date = date;
        this.packages = packages;
        this.numCustomer = numCustomer;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNo() {
        return this.phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public Dates getDate() {
        return this.date;
    }

    public void setDate(Dates date) {
        this.date = date;
    }

    public char getPackages() {
        return this.packages;
    }

    public void setPackages(char packages) {
        this.packages = packages;
    }

    public int getNumCustomer() {
        return this.numCustomer;
    }

    public void setNumCustomer(int numCustomer) {
        this.numCustomer = numCustomer;
    }

    public String toString() {
        return "Name: " + this.name + "\nPhone Number: " + this.phoneNo + "\nDate: " + date.toString() + "\nPackages: "
                + this.packages + "\nNumber of Customer: " + this.numCustomer;
    }

    // if order1 is more expensive than order2, return true
    public boolean isExpensive(Order order) {
        double totalPrice1, totalPrice2 = 0;
        switch(packages){
            case 'A':
                totalPrice1 = 25 * numCustomer;
                break;
            case 'B':
                totalPrice1 = 35 * numCustomer;
                break;
            case 'C':
                totalPrice1 = 45 * numCustomer;
                break;
            default:
                totalPrice1 = 0;
        }

        switch(order.getPackages()){
            case 'A':
                totalPrice2 = 25 * order.getNumCustomer();
                break;
            case 'B':
                totalPrice2 = 35 * order.getNumCustomer();
                break;
            case 'C':
                totalPrice2 = 45 * order.getNumCustomer();
                break;
            default:
                totalPrice2 = 0;
        }

        return totalPrice1 > totalPrice2;
    }
}