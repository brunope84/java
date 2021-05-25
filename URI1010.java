import java.util.Scanner;

public class URI1010{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);
        
        

        int cod1, cod2, qtd1, qtd2;
        double vlr1, vlr2, total;

        //entrada
        cod1 = teclado.nextInt();
        qtd1 = teclado.nextInt();
        vlr1 = teclado.nextDouble();

        cod2 = teclado.nextInt();
        qtd2 = teclado.nextInt();
        vlr2 = teclado.nextDouble();
        
        //var2 = teclado.nextDouble();
        //var3 = teclado.nextDouble();

        //processamento
        total = (qtd1 * vlr1) + (qtd2 * vlr2);

        //saida
        //System.out.println("NUMBER = "+ func);
        System.out.printf("VALOR A PAGAR: R$ %.2f\n",total);

        }
}