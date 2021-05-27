import java.util.Scanner;

public class URI1067{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int num, x;

        num = teclado.nextInt();

        if (num >= 1 && num <= 1000) {
            for (x = 1; x <= num; x++) {
                if (x % 2 != 0) {
                    System.out.println(x);
                }
            }
        }
    }
}