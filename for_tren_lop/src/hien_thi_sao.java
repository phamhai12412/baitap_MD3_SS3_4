public class hien_thi_sao {
    public static void main(String[] args) {
        int n = 5; // Số dòng của mẫu
        System.out.println("hiện thị mẫu 1");
        // Lặp qua từng dòng
        for (int i = 1; i <= n; i++) {
            // In ra dấu '*' cho từng cột tương ứng
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Xuống dòng sau khi in mỗi dòng
        }
        System.out.println("hiện thị mẫu 2");

        // Lặp qua từng dòng
        for (int i = n; i >= 1; i--) {
            // In ra dấu '*' cho từng cột tương ứng
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Xuống dòng sau khi in mỗi dòng
        }
    }
}
