public class House {
    private String tenant; // tenant name
    private String ICNo; // tenant IC number
    private String address; // tenant address

    public House(String tenant, String ICNo, String address) {
        this.tenant = tenant;
        this.ICNo = ICNo;
        this.address = address;
    }

    public String getTenant() {
        return this.tenant;
    }

    public void setTenant(String tenant) {
        this.tenant = tenant;
    }

    public String getICNo() {
        return this.ICNo;
    }

    public void setICNo(String ICNo) {
        this.ICNo = ICNo;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return "Tenant: " + this.tenant + "\nIC No: " + this.ICNo + "\nAddress: " + this.address;
    }
}
