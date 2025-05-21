import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main (String [] args){
        System.out.println("Hello Vitamin Code 03");
        System.out.println("Hello Admin");

        calNumberANumberB();
    }
    public static void calNumberANumberB(){
        System.out.println("Nhap vao hai so : ");
        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();
        System.out.println("a + b = "+(a+b));
        System.out.println("a - b = "+(a-b));
        System.out.println("a * b = "+(a*b));
        if(b ==0){
            System.out.println("Không thể chia A cho số 0");
        } else {
            System.out.println("a / b = "+(float)a/b);
        }
    }
}
// Trước khi push thì pull nhánh chính
// Trước khi check out thì pull nhánh chính