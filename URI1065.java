import java.util.Scanner;

public class URI1065{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int x, y;
        int cont = 0;

        for (y = 0; y < 5; y++) {
        	x = teclado.nextInt();
        	if (x % 2 == 0 ) cont++;
        }
        System.out.println(cont + " valores pares");
    }
}
