import java.util.Scanner;

public class Exercicio2e{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double basemaior, basemenor, area, altura;

        //entrada
        System.out.println("Por favor digite o valor da maior base do trapézio");
        basemaior = teclado.nextDouble();

        System.out.println("Por favor digite o valor da menor base do trapézio");
        basemenor = teclado.nextDouble();

        System.out.println("Por favor digite o valor da altura do trapézio");
        altura = teclado.nextDouble();

        //processamento
        area = (basemaior + basemenor)* altura/2;

        //saida
        System.out.println("A area do trapézio bases "+ basemaior + " e "+ basemenor + " e altura "+ altura + " é "+ area);
        
        }
}