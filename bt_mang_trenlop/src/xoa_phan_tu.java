import java.util.Arrays;

public class xoa_phan_tu {
    public static void main(String[] args) {
        int[] mang = {10, 20, 30, 40, 50};
        int X = 30;

        System.out.println("Mảng ban đầu: " + Arrays.toString(mang));

        int kichThuocMoi = mang.length - demSoLanXuatHien(mang, X);
        int[] mangMoi = new int[kichThuocMoi];
        int index = 0;

        for (int i = 0; i < mang.length; i++) {
            if (mang[i] != X) {
                mangMoi[index] = mang[i];
                index++;
            }
        }

        mang = mangMoi;

        System.out.println("Mảng sau khi xóa phần tử " + X + ": " + Arrays.toString(mang));
    }

    public static int demSoLanXuatHien(int[] mang, int X) {
        int dem = 0;

        for (int i = 0; i < mang.length; i++) {
            if (mang[i] == X) {
                dem++;
            }
        }

        return dem;
    }
}
