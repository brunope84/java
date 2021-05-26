import java.util.Scanner;

public class URI1066{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int contPar = 0;
        int contImpar = 0;
        int contPositivos = 0;
        int contNegativos = 0;
        int x, y;
        for (y = 0; y < 5; y++) {
        	x = teclado.nextInt();
        	if (x % 2 == 0) contPar++;
        	else contImpar++;
        	if (x > 0) contPositivos++;
        	else if(x < 0) contNegativos++;
        }
        System.out.println(contPar + " valor(es) par(es)");
        System.out.println(contImpar + " valor(es) impar(es)");
        System.out.println(contPositivos + " valor(es) positivo(s)");
        System.out.println(contNegativos + " valor(es) negativo(s)");
    }    
}
