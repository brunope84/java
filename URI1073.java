import java.util.Scanner;

public class URI1073{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int N, x;

    	N = teclado.nextInt();
    	for (x = 1; x <= N; x++) {
    		if (x % 2 == 0)
            System.out.println(x + "^2 = " + (x * x));
    	}
	}
}