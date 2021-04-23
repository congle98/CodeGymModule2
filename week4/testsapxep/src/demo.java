public class demo {
    public static void main(String[] args) {
    int []arr={1,2,5,3,7,12,2,5,10};
    int []arr2=sapxepnoibot(arr);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }




    static int [] sapxepnoibot(int []arr){
        int []array = arr;
        for (int i = 0; i < array.length-1; i++) {
            for (int j = array.length-1; j>i  ; j--) {
                if(array[j]<array[j-1]){
                    int temp=array[j];
                    array[j]=array[j-1];
                    array[j-1]=temp;
                }
            }
        }
        return arr;
    }
}
