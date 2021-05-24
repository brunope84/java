import java.util.Scanner;

public class URI1003{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int var1, var2, soma;

        //entrada
        
        var1 = teclado.nextInt();
        var2 = teclado.nextInt();

        //processamento
        soma = var1 + var2;

        //saida
        System.out.println("SOMA = "+ soma);
        }
}