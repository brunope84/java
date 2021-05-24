import java.util.Scanner;

public class URI1005{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double var1, var2, media;

        //entrada
        
        var1 = teclado.nextDouble();
        var2 = teclado.nextDouble();

        //processamento
        media = ((3.5 * var1) + (7.5 * var2)) / 11;

        //saida
        //System.out.println("SOMA = "+ soma);
        System.out.printf("MEDIA = %.5f\n",media);

        }
}