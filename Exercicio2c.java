import java.util.Scanner;

public class Exercicio2c{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double base, altura, area;

        //entrada
        System.out.println("Por favor digite o valor da base");
        base = teclado.nextDouble();

        System.out.println("Por favor digite o valor da altura");
        altura = teclado.nextDouble();

        //processamento
        area = (base * altura)/2;

        //saida
        System.out.println("A area do triângulo de base"+ base + "e altura "+ altura + "é "+ area);
        }
}