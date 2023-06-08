
    import java.util.Scanner;

    public class dem_ki_tu_chuoi {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Nhập vào một chuỗi: ");
            String chuoi = scanner.nextLine();

            System.out.print("Nhập vào ký tự cần đếm: ");
            char kyTuCanDem = scanner.next().charAt(0);

            int soLanXuatHien = demSoLanXuatHien(chuoi, kyTuCanDem);

            System.out.println("Số lần xuất hiện của ký tự '" + kyTuCanDem + "' trong chuỗi: " + soLanXuatHien);

            scanner.close();
        }

        public static int demSoLanXuatHien(String chuoi, char kyTu) {
            int dem = 0;

            for (int i = 0; i < chuoi.length(); i++) {
                if (chuoi.charAt(i) == kyTu) {
                    dem++;
                }
            }

            return dem;
        }


}
