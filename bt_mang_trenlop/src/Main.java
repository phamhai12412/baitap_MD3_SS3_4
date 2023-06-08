import java.util.Arrays;
import java.util.Scanner;
//thêm phần tử vào mảng

public class Main {
    public static void main(String[] args) {
        // {1,2,3,4,5,6,7,8,9}
        // chèn số 10 vào giữa số 5 và 6 (index = 5)
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int b = 10;
        int index = 5;
        int arrUpdate[] = new int[10];
        insertArray(array, b, index, arrUpdate);
        System.out.println("Array " + Arrays.toString(arrUpdate));
    }
    public static void insertArray(int[] array, int value, int index, int[] arrUpdate) {
        for (int i = 0; i < arrUpdate.length; i++) {
            if (i < index) {
                arrUpdate[i] = array[i];
            } else if (i == index) {
                arrUpdate[i] = value;
            } else {
                arrUpdate[i] = array[i - 1];
            }
        }
}
}