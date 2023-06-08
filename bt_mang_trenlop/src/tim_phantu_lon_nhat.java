public class tim_phantu_lon_nhat {

        public static void main(String[] args) {
            int[][] mang2Chieu = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };

            int max = timPhanTuLonNhat(mang2Chieu);

            System.out.println("Phần tử lớn nhất trong mảng hai chiều: " + max);
        }

        public static int timPhanTuLonNhat(int[][] mang2Chieu) {
            int max = mang2Chieu[0][0];

            for (int[] hang : mang2Chieu) {
                for (int phanTu : hang) {
                    if (phanTu > max) {
                        max = phanTu;
                    }
                }
            }

            return max;
        }
    }

