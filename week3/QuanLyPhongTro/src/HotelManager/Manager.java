package HotelManager;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
    public ArrayList<Customer> customers;
    public ArrayList<HotelRoom> hotelRooms;

    public Manager() {
    }

    public Manager(ArrayList<Customer> customers, ArrayList<HotelRoom> hotelRooms) {
        this.customers = customers;
        this.hotelRooms = hotelRooms;
    }

    public void addCustomers(Customer customer){
        customers.add(customer);
    }
    public void showCustomer(String name, int CMT){
        boolean check = false;
        for (int i = 0; i < customers.size(); i++) {
            if(customers.get(i).getName()==name&&customers.get(i).getCMT()==CMT){
                System.out.println(customers.get(i));
                check = true;
                break;
            }
        }
        if(check==false){
            System.out.println("không tồn tại khách hàng này");
        }
    }
    public void removeCustomers(String name, int CMT){
        boolean check = false;
        for (int i = 0; i < customers.size(); i++) {
            if(customers.get(i).getName()==name&&customers.get(i).getCMT()==CMT){
                customers.remove(i);
                check = true;
                break;
            }
        }
        if(check==false){
            System.out.println("không tồn tại khách hàng này");
        }
    }
    public void showCustomers(){
        for (int i = 0; i < customers.size(); i++) {
            System.out.println(customers.get(i));
        }
    }
    public void setCustomers(ArrayList<Customer> customers){
        this.customers = customers;
    }
    public void getCustomersInHotel(){
        for (int i = 0; i < hotelRooms.size(); i++) {
            System.out.println(hotelRooms.get(i).getCustomer());
        }
    }
    public void setHotelRooms(ArrayList<HotelRoom> hotelRooms){
        this.hotelRooms = hotelRooms;
    }
    public void getPrice(int CMT){
        boolean check = false;
        for (int i = 0; i < hotelRooms.size(); i++) {
            if(hotelRooms.get(i).getCustomer().getCMT()==CMT){
                System.out.println(hotelRooms.get(i).getPrice()*hotelRooms.get(i).getDateOfRent());
                check = true;
                break;
            }
        }
        if (check==false){
            System.out.print("không tồn tại khách hàng này");
        }
    }
    private void Menu(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Mời nhập lựa chọn : \n 1.Hiển thị thông tin các khách trọ đang trọ \n 2.Tính số tiền phải trả của khách \n 3.Thoát" );
            int choose = scanner.nextInt();
            switch (choose){
                case 1:
                    getCustomersInHotel();
                    break;
                case 2:
                    System.out.println("Mời nhập CMT của khách hàng đó");
                    int CMT = scanner.nextInt();
                    getPrice(CMT);
                    break;
                case 3:
                    System.exit(0);
            }
        }
    }

}
