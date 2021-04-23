import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        Person[] peoples = new Person[3];
        peoples[0]= new Person(18,"cong");
        peoples[1]= new Person(16,"ha");
        peoples[2]= new Person(20,"toan");
        Arrays.sort(peoples);
        for (int i = 0; i < peoples.length; i++) {
            System.out.println(peoples[i]);
        }
    }
}
