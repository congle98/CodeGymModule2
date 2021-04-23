package HotelManager;

public class Customer {
    private String name;
    private String dateOfBirth;
    private int CMT;

    public Customer() {
    }

    public Customer(String name, String dateOfBirth, int CMT) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.CMT = CMT;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getCMT() {
        return CMT;
    }

    public void setCMT(int CMT) {
        this.CMT = CMT;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", CMT=" + CMT +
                '}';
    }
}
