import java.util.Scanner;

public class Algoritmo04 {
    public static void main (String [] args) {
        /*
        Escreva um programa que realize a conversão de graus Fahrenheit (F)  para graus Celsius (C). Utilize a fórmula abaixo:

        C = (( F - 32)  5)9

         */
        Scanner entrada = new Scanner(System.in);
        double tempFahrenheit, conversaoCelsius;
        System.out.printf("Digite a temperatura em Fahrenheit: ");
        tempFahrenheit = entrada.nextDouble();
        conversaoCelsius = (tempFahrenheit - 32) * 5 / 9;
        System.out.printf("A temperatura %.2f Fahrenheit é %.2f Celsius",tempFahrenheit,conversaoCelsius);

    }
}
