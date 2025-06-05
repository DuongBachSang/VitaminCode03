import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chon;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Tính chu vi, diện tích, cạnh nhỏ HCN");
            System.out.println("2. Cộng, Trừ, Nhân, Chia 2 số");
            System.out.println("3. Tính lãi suất gửi ngân hàng");
            System.out.println("4. Kiểm tra số chẵn lẻ");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            chon = scanner.nextInt();

            switch (chon) {
                case 1:
                    hinhChuNhat(scanner);
                    break;
                case 2:
                    congTruNhanChia(scanner);
                    break;
                case 3:
                    tinhLaiSuat(scanner);
                    break;
                case 4:
                    chanLe(scanner);
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }

        } while (chon != 0);
    }

    public static void hinhChuNhat(Scanner scanner) {
        System.out.print("Nhập chiều dài: ");
        double dai = scanner.nextDouble();
        System.out.print("Nhập chiều rộng: ");
        double rong = scanner.nextDouble();

        double chuVi = (dai + rong) * 2;
        double dienTich = dai * rong;
        double canhNho = Math.min(dai, rong);

        System.out.println("Chu vi: " + chuVi);
        System.out.println("Diện tích: " + dienTich);
        System.out.println("Cạnh nhỏ: " + canhNho);
    }
    public static void congTruNhanChia(Scanner scanner){
        System.out.println("nhap so thu nhat: ");
        int a = scanner.nextInt();
        System.out.println("nhap so thu hai: ");
        int b = scanner.nextInt();
        System.out.println("Tong: "+ (a+b));
        System.out.println("Hieu: "+ (a-b));
        System.out.println("Tich: "+ (a*b));
        if( b!=0 ){
            System.out.println("Thuong: "+ ((double) a/b) );

        }else {
            System.out.println("khong the chia cho 0 ");
        }
    }

    public static void tinhLaiSuat (Scanner scanner){
        System.out.println("nhap tien goc (P): ");
        Double P = scanner.nextDouble();
        System.out.println("nhap tien lai suat (%moi nam): ");
        Double R = scanner.nextDouble();
        System.out.println("nhap thoi gian: ");
        int T = scanner.nextInt();
        Double Lai = ( P*R*T )/100;;
        System.out.println("tien lai la: " + Lai);
    }
    public static void chanLe (Scanner scanner){
        System.out.println("nhap mot so: ");
        int num = scanner.nextInt();
        if ( num<0 ){
            System.out.println("vui long nhap mot so nguyen duong " );
        }else if( num%2==0 ){
            System.out.println( num +"la so chan " );
        }else {
            System.out.println( num +"la so le");
        }
    }
}
