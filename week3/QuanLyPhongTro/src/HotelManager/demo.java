package HotelManager;

import java.util.ArrayList;
public class demo {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Cong","20/11/1998",123);
        Customer customer2 = new Customer("Ha","20/11/1997",1234);
        Customer customer3 = new Customer("Tung","20/11/1995",12345);
        HotelRoom hotelRoom1 = new HotelRoom(15,"vip1",200,customer1);
        HotelRoom hotelRoom2 = new HotelRoom(20,"vip2",300,customer3);
        ArrayList<Customer> customers = new ArrayList<Customer>();
        ArrayList<HotelRoom> hotelRooms = new ArrayList<HotelRoom>();




        Manager manager = new Manager(customers,hotelRooms);
        manager.addCustomers(customer1);
        manager.showCustomers();
        hotelRooms.add(hotelRoom1);
        manager.getCustomersInHotel();



    }


}
