import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int count = 0;
        if(A<B){
            for(int i=A+1; i<B; i++){
                count++;
            }
            System.out.println(count);
            for(int i=A+1; i<B; i++){
                System.out.print(i + " ");
            }
        }else{
            for(int i=B+1; i<A; i++){
                count++;
            }
            System.out.println(count);
            for(int i=B+1; i<A; i++){
                System.out.print(i + " ");
            }
        }
    }
}