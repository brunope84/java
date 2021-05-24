import java.util.Scanner;

public class URI1008{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int func, hora;
        double valhora, sal;

        //entrada
        
        func = teclado.nextInt();
        hora = teclado.nextInt();
        valhora = teclado.nextDouble();
                
        //var2 = teclado.nextDouble();
        //var3 = teclado.nextDouble();

        //processamento
        sal = valhora * hora;

        //saida
        System.out.println("NUMBER = "+ func);
        System.out.printf("SALARY = U$ %.2f\n",sal);

        }
}