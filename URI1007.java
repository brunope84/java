import java.util.Scanner;

public class URI1007{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int A, B, C, D, DIFERENCA;

        //entrada
        
        A = teclado.nextInt();
        B = teclado.nextInt();
        C = teclado.nextInt();
        D = teclado.nextInt();
        
        //var2 = teclado.nextDouble();
        //var3 = teclado.nextDouble();

        //processamento
        DIFERENCA = (A * B - C * D);

        //saida
        System.out.println("DIFERENCA = "+ DIFERENCA);
        //System.out.printf("DIFERENCA = %.1f\n",DIFERENCA);

        }
}