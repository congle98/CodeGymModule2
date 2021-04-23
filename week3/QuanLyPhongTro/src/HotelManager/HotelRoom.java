package HotelManager;

public class HotelRoom {
    private int dateOfRent;
    private String typeRoom;
    private double price;
    private Customer customer;

    public HotelRoom() {
    }

    public HotelRoom(int dateOfRent, String typeRoom, double price, Customer customer) {
        this.dateOfRent = dateOfRent;
        this.typeRoom = typeRoom;
        this.price = price;
        this.customer = customer;
    }

    public int getDateOfRent() {
        return dateOfRent;
    }

    public void setDateOfRent(int dateOfRent) {
        this.dateOfRent = dateOfRent;
    }

    public String getTypeRoom() {
        return typeRoom;
    }

    public void setTypeRoom(String typeRoom) {
        this.typeRoom = typeRoom;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
