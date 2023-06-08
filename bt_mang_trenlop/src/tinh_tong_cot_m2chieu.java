import java.util.Scanner;

public class tinh_tong_cot_m2chieu {


        public static void main(String[] args) {
            int[][] mang2Chieu = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };

            Scanner scanner = new Scanner(System.in);

            System.out.print("Nhập vào vị trí cột: ");
            int cotXacDinh = scanner.nextInt();

            int tong = tinhTongCot(mang2Chieu, cotXacDinh);

            System.out.println("Tổng của cột " + cotXacDinh + ": " + tong);


        }

        public static int tinhTongCot(int[][] mang2Chieu, int cot) {
            int tong = 0;

            for (int i = 0; i < mang2Chieu.length; i++) {
                if (cot >= 0 && cot < mang2Chieu[i].length) {
                    tong += mang2Chieu[i][cot];
                }
            }

            return tong;
        }
    }


