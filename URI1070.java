import java.util.Scanner;

public class URI1070{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int x, cont;

        x = teclado.nextInt();
        cont = 0;
        while (cont < 6) {
            x++;
        	if (x % 2 == 1) {
        		System.out.println(x);
                cont++;
        	}
        }
    }
}