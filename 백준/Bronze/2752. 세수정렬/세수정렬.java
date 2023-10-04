import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[3];
        for(int i=0; i<3; i++) {
            num[i] = sc.nextInt();
        }
        for(int i=0; i<2; i++) {
            if(num[i]>num[i+1]){
                int digit = num[i];
                num[i] = num[i+1];
                num[i+1] = digit;
            }
        }
        for(int i=0; i<2; i++) {
            if(num[i]>num[i+1]){
                int digit = num[i];
                num[i] = num[i+1];
                num[i+1] = digit;
            }
        }
        for(int i=0; i<3; i++){
            System.out.print(num[i] + " ");
        }
    }
}