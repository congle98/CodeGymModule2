import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class test {
    public static void main(String[] args) {
        ArrayList<Integer> numbers= new ArrayList<Integer>();
        ArrayList<Integer> numberss = new ArrayList<Integer>();
        numberss.add(0,3);
        numberss.add(1,7);
        numberss.add(2,10);
        numberss.add(3,5);
//        for (int i = 0; i < numbers.size(); i++) {
//            System.out.println(numbers.get(i));
//        }
//        numbers.add(1,8);
//        numbers.remove(0);
//        numbers.addAll(1,numberss);
//        System.out.println(numbers);

//        }
        List<Integer> list = numberss.subList(1,3);
        System.out.println(list);

    }
}
