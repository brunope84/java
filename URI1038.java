import java.util.Scanner;

public class URI1038{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double tot;

        int cod = teclado.nextInt();
        int qnt = teclado.nextInt();
        
        if (cod == 1){
            tot = qnt * 4.00;
            System.out.printf("Total: R$ %.2f\n",tot);
        }
        else if (cod == 2){
            tot = qnt * 4.50;
            System.out.printf("Total: R$ %.2f\n",tot);
        }
        else if (cod == 3){
            tot = qnt * 5.00;
            System.out.printf("Total: R$ %.2f\n",tot);
        }
        else if (cod == 4){
            tot = qnt * 2.00;
            System.out.printf("Total: R$ %.2f\n",tot);
        }
        else if (cod == 5){
            tot = qnt * 1.50;
            System.out.printf("Total: R$ %.2f\n",tot);
        }
                
    }
}