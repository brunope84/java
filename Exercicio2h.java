import java.util.Scanner;

public class Exercicio2h{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double raio, altura, pi, volume;

        pi=3.14;

        //entrada
        System.out.println("Por favor digite o valor do raio");
        raio = teclado.nextDouble();

        System.out.println("Por favor digite o valor da altura");
        altura = teclado.nextDouble();

        //processamento
        volume = pi * raio * raio * altura;

        //saida
        System.out.println("O volume do cilindro de raio "+ raio + " e altura "+ altura + " é "+ volume);
        }
}