import java.util.InputMismatchException;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = 10;
        int y = 0;
//        int arr [] = {3,6,8,3};
        try {
            System.out.println(x / y);
//            System.out.println(arr[4]);
        }
//        catch (ArrayIndexOutOfBoundsException ex){
//            System.out.println(" lỗi do mảng");
//        }
//        catch (ArithmeticException ex){
//            System.out.println("lỗi này là lỗi mẫu bằng 0");
//        }
        catch (Exception ex) {
            System.out.println("có lỗi rồi mời nhập lại y");
//            y = scanner.nextInt();
////            System.out.println(x / y);
            ex.printStackTrace();
        }
        System.out.println(5_8);
//        finally {
//            System.out.println("dù lỗi hay không lỗi thì các câu lệnh ở trong finally vẫn chạy");
//        }




//
//        try {
//            tinhtoan(5,0);
//        }
//        catch (Exception ex){
//            System.out.println(" co noi o day a");
//        }



    }
    static void tinhtoan(int x, int y) throws Exception
    {
        try {
            System.out.println(x/y);
        }
        catch (Exception ex){
            throw ex;
        }

    }
}
