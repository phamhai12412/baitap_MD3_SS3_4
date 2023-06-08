import java.util.Scanner;

public class sinh_vien_dau {
    public static void main(String[] args) {
        int size;
        int[] danhSachDiem; // Mảng chứa danh sách điểm của sinh viên
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Nhập kích thước mảng: ");
            size = scanner.nextInt();
            if (size > 30)
                System.out.println("Kích thước không được vượt quá 30");
        } while (size > 30);

        danhSachDiem = new int[size];
        int i = 0;
        while (i < danhSachDiem.length) {
            System.out.print("Nhập điểm cho sinh viên " + (i + 1) + ": ");
            danhSachDiem[i] = scanner.nextInt();
            i++;
        }

        int soLuongDau = 0; // Số lượng sinh viên đậu
        System.out.print("Danh sách điểm: ");
        for (int j = 0; j < danhSachDiem.length; j++) {
            System.out.print(danhSachDiem[j] + "\t");
            if (danhSachDiem[j] >= 5 && danhSachDiem[j] <= 10)
                soLuongDau++;
        }

        System.out.print("\nSố lượng sinh viên đậu kỳ thi là: " + soLuongDau);
    }
}
