public class tim_gia_tri_nho_nhat {
    public static void main(String[] args) {
        int[][] mang2Chieu = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int min = timPhanTuNhoNhat(mang2Chieu);

        System.out.println("Phần tử lớn nhất trong mảng hai chiều: " + min);
    }

    public static int timPhanTuNhoNhat(int[][] mang2Chieu) {
        int min = mang2Chieu[0][0];

        for (int[] hang : mang2Chieu) {
            for (int phanTu : hang) {
                if (phanTu < min) {
                    min = phanTu;
                }
            }
        }

        return min;
    }
}
