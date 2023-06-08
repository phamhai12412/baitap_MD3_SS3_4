
    import java.util.Arrays;

    public class gop_mang {
        public static void main(String[] args) {
            int[] mang1 = {1, 2, 3};
            int[] mang2 = {4, 5, 6};

            int kichThuocMoi = mang1.length + mang2.length;
            int[] mangGop = new int[kichThuocMoi];

            System.arraycopy(mang1, 0, mangGop, 0, mang1.length);
            System.arraycopy(mang2, 0, mangGop, mang1.length, mang2.length);

            System.out.println("Mảng gộp: " + Arrays.toString(mangGop));
        }
    }


