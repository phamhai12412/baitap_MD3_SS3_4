import java.util.Scanner;
//số nguyên tố
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập một số nguyên dương: ");
        int number = sc.nextInt();
        boolean check=true;
        if(number<2){
            check=false;
        }
        for(int i=2;i<=Math.sqrt(number);i++){
            if(number%i==0){
                check=false;
            }
        }
           if(check) {
               System.out.printf("số vừa nhập %d là số nguyên tô", number);
           }
           else System.out.printf("số %d vừa nhâp không phải là số nguyên tố",number);
        }
    }
