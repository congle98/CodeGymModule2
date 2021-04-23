package Person;

public class Customer extends Person{
    public Customer() {
    }

    public Customer(String name, int IDCard, String email) {
        super(name, IDCard,email);
    }

    @Override
    public String toString() {
        return "Tên khách hàng: "+super.getName()+" , Số chứng minh thư: "+super.getIDCard()+", Email: "+super.getEmail();
    }
}
