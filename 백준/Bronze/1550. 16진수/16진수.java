import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();

        int result = 0;
        for(int i =0; i<num.length(); i++){
            int digit = Character.getNumericValue(num.charAt(num.length()-i-1));
            result += (Math.pow(16, i) * digit);
        }
        System.out.println(result);

    }
}