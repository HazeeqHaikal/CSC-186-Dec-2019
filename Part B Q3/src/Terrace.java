public class Terrace extends House {
    private String type; // single-storey or double-storey
    private String status; // corner lot status (Yes or No)

    public Terrace(String tenant, String ICNo, String address, String type, String status) {
        super(tenant, ICNo, address);
        this.type = type;
        this.status = status;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String toString() {
        return super.toString() + "\nType: " + this.type + "\nCorner Lot: " + this.status;
    }

    public double calcPrice() {
        if (type.equals("single-storey")) {
            if (status.equals("Yes"))
                return 2000.00;
            else
                return 1500.00;
        } else if (type.equals("double-storey")) {
            if (status.equals("Yes"))
                return 3000.00;
            else
                return 2500.00;
        }

        return 0.00;
    }
}