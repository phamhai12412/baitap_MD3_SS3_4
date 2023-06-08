//tìm phần tử lớn nhất nhỏ nhất trong mảng
public class Main {
    public static void main(String[] args) {
        int[] mang = {10, 5, 8, 20, 15};

        int lonNhat = mang[0];
        int nhoNhat = mang[0];

        for (int i = 1; i < mang.length; i++) {
            if (mang[i] > lonNhat) {
                lonNhat = mang[i];
            }

            if (mang[i] < nhoNhat) {
                nhoNhat = mang[i];
            }
        }

        System.out.println("Phần tử lớn nhất trong mảng là: " + lonNhat);
        System.out.println("Phần tử nhỏ nhất trong mảng là: " + nhoNhat);
    }
}
