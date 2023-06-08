public class tong_cac_so_duong_cheo {

        public static void main(String[] args) {
            int[][] maTran = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };

            int tong = tinhTongDuongCheoChinh(maTran);

            System.out.println("Tổng các số ở đường chéo chính: " + tong);
        }

        public static int tinhTongDuongCheoChinh(int[][] maTran) {
            int tong = 0;

            for (int i = 0; i < maTran.length; i++) {
                tong += maTran[i][i];
            }

            return tong;
        }
    }


