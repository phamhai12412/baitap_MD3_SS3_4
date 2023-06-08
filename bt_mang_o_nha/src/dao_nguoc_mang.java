public class dao_nguoc_mang {
    public static void main(String[] args) {
        int[] mang = {1, 2, 3, 4, 5};

        System.out.println("Mảng ban đầu:");
        inMang(mang);

        daoNguocMang(mang);

        System.out.println("Mảng sau khi đảo ngược:");
        inMang(mang);
    }

    public static void daoNguocMang(int[] mang) {
        int i = 0;
        int j = mang.length - 1;

        while (i < j) {
            int temp = mang[i];
            mang[i] = mang[j];
            mang[j] = temp;
            i++;
            j--;
        }
    }

    public static void inMang(int[] mang) {
        for (int i = 0; i < mang.length; i++) {
            System.out.print(mang[i] + " ");
        }
        System.out.println();
    }
}
