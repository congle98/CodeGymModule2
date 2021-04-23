import java.util.ArrayList;
import java.util.List;

public class demo {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(1);
        arr.add(1);
        arr.add(1);
        System.out.println(arr.size());
        arr.remove(0);
        System.out.println(arr.size());



    }
    static void interchangeSort(int arr[], int size)
    {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
