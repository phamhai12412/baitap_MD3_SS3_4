public class phan_tu_lon_thu2 {

        public static void main(String[] args) {
            int[] mang = {10, 5, 8, 20, 15};

            int lonNhat =mang[0];
            int lonThuHai =mang[0];

            for (int i = 0; i < mang.length; i++) {
                if (mang[i] > lonNhat) {
                    lonThuHai = lonNhat;
                    lonNhat = mang[i];
                } else if (mang[i] > lonThuHai && mang[i] < lonNhat) {
                    lonThuHai = mang[i];
                }
            }

            System.out.println("Phần tử lớn thứ hai trong mảng là: " + lonThuHai);
        }
    }


