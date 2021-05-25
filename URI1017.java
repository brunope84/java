import java.util.Scanner;

public class URI1017{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int tempo, velocidade, distancia;
        
        double litros;

        //entrada
        
        tempo = teclado.nextInt();
        velocidade = teclado.nextInt();
                        
        //var2 = teclado.nextDouble();
        //var3 = teclado.nextDouble();

        //processamento
        distancia = velocidade * tempo;
        litros = distancia / 12.00;

        //saida
        //System.out.println("NUMBER = "+ func);
        System.out.printf("%.3f\n",litros);

        }
}