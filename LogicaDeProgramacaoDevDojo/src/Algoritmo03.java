import java.util.Scanner;

public class Algoritmo03 {
    public static void main (String [] args) {
        /*
        Escreva um programa que realize a conversão de graus Celsius (C)  para graus Fahrenheit (F). Utilize a fórmula abaixo:

        F = (9 * C / 5) + 32

         */
        System.out.printf("Algoritmo para conversão de temperatura em Celsius para Fahrenheit %n");
        Scanner entrada = new Scanner(System.in);
        double tempCelsius, conversaoFahrenheit;
        System.out.print("Digite a temperatura em Celsius: ");
        tempCelsius = entrada.nextDouble();
        conversaoFahrenheit = (9 * tempCelsius / 5) + 32;
        System.out.printf("A temperatura %.2f Celsius é %.2f Fahrnheit",tempCelsius, conversaoFahrenheit );
    }
}
