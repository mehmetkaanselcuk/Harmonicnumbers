import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("N sayısnı giriniz: ");
        int n = sc.nextInt();
        double result = 0;
        for (int i = 1; i <= n; i++) {
            result+=(1/i);
        }
        System.out.println(result);


    }
}