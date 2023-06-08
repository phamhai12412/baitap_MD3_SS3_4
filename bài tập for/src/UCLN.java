import java.util.Scanner;

public class UCLN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số thứ nhất: ");
        int number1 = scanner.nextInt();

        System.out.print("Nhập số thứ hai: ");
        int number2 = scanner.nextInt();



        int uocChungLonNhat = timUCLN(number1, number2);

        System.out.println("Số ước chung lớn nhất của " + number1 + " và " + number2 + " là: " + uocChungLonNhat);
    }

    public static int timUCLN(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
