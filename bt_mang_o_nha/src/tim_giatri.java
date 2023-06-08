public class tim_giatri {
    public static void main(String[] args) {
        int[] mang = {10, 5, 8, 20, 15};
        int soCanTim = 8;

        boolean timThay = false;

        for (int i = 0; i < mang.length; i++) {
            if (mang[i] == soCanTim) {
                timThay = true;
                break;
            }
        }

        if (timThay) {
            System.out.println("Số " + soCanTim + " được tìm thấy trong mảng.");
        } else {
            System.out.println("Số " + soCanTim + " không tồn tại trong mảng.");
        }
    }
}
