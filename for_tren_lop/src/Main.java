
public class Main {
    public static void main(String[] args) {
       //20 số nguyên tố đầu tiên
        int count=0;
        int n=2;

        do {
            int kiemtra=0;
            for (int i=2;i<=Math.sqrt(n);i++){
                if (n%i==0){
                    kiemtra++;
                    break;
                }
            }
            if(kiemtra==0){
                count++;
                System.out.printf("số nguyên tố thứ %d là: %d \n",count,n);

            }

            n++;
        } while (count<20);
    }
}