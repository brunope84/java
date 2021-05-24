import java.util.Scanner;

public class URI1006{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double var1, var2, var3, media;

        //entrada
        
        var1 = teclado.nextDouble();
        var2 = teclado.nextDouble();
        var3 = teclado.nextDouble();

        //processamento
        media = ((2 * var1) + (3 * var2) + (5 * var3)) / 10;

        //saida
        //System.out.println("SOMA = "+ soma);
        System.out.printf("MEDIA = %.1f\n",media);

        }
}