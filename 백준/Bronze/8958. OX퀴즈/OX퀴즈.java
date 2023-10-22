import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        String[] str = new String[input];
        for(int i=0; i<input; i++){
            str[i] = sc.next();
        }
        for(int i=0; i<str.length; i++){
            int count=0;
            int sum=0;
            for(int j=0; j<str[i].length(); j++){
                if(str[i].charAt(j)=='O'){
                    count++;
                }else{
                    count =0;
                }
                sum +=count;
            }
            System.out.println(sum);
        }

    }
}