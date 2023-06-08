import java.util.Scanner;

public class bt_nganhang {
    public static void main(String[] args) {
        double soTienGui = 1.0;
        int soThangGui = 1;
        double laiSuatHangNam = 1.0;

        Scanner input = new Scanner(System.in);

        System.out.print("Nhập số tiền gửi: ");
        soTienGui = input.nextDouble();

        System.out.print("Nhập số tháng gửi: ");
        soThangGui = input.nextInt();

        System.out.print("Nhập tỷ lệ lãi suất hàng năm (phần trăm): ");
        laiSuatHangNam = input.nextDouble();

        double tongLaiSuat = 0;

        for (int i = 0; i < soThangGui; i++) {
            tongLaiSuat += (soTienGui * laiSuatHangNam / 100) / 12;
        }

        System.out.println("Tổng lãi suất: " + tongLaiSuat);


    }
}
