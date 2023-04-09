import java.util.Scanner;

public class Algoritmo01 {
    public static void main (String[] args) {
        /*
       Baseado na fórmula abaixo escreva um programa que calcule e apresente a área de um círculo.

       A = piR ao quadrado
       Onde
       A = Area do circulo
       pi = 3,14
       R = Raio do circulo
         */
        Scanner entrada = new Scanner(System.in);
        System.out.println("Algoritmo para calculo da area de um circulo");
        System.out.print("Informe o raio do circulo em centimetros (cm): ");
        double raioCirculo = entrada.nextDouble();
        double areaCirculo = 3.14*Math.pow(raioCirculo, 2);
        System.out.printf("A area do cirulo é %.2f cm",areaCirculo);



    }
}
