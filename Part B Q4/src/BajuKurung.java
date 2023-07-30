public class BajuKurung extends TailorOrder {
    private int type;
    private boolean embroidery;

    public BajuKurung(String custName, String orderNum, double deposit, boolean delivery, int type,
            boolean embroidery) {
        super(custName, orderNum, deposit, delivery);
        this.type = type;
        this.embroidery = embroidery;
    }

    public int getType() {
        return this.type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public boolean isEmbroidery() {
        return this.embroidery;
    }

    public boolean getEmbroidery() {
        return this.embroidery;
    }

    public void setEmbroidery(boolean embroidery) {
        this.embroidery = embroidery;
    }

    public double addEmbroidery() {
        double price = 0;
        if (this.embroidery) {
            price += 25.00;
        }
        return price;
    }

    public double payment() {
        double price = 0;
        switch (type) {
            case 1:
                price = 30.00;
                break;
            case 2:
                price = 60.00;
                break;
            case 3:
                price = 55.00;
                break;
            case 4:
                price = 110.00;
                break;
        }

        return price + addEmbroidery();
    }

    public String toString() {
        return super.toString() + "\nType: " + this.type + "\nEmbroidery: " + this.embroidery;
    }
}
