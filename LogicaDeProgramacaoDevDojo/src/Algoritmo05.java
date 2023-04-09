import java.util.Scanner;

public class Algoritmo05 {
    public static void main (String[] args) {

        /*
        Escreva uma rotina capaz de calcular e apresentar o valor do volume de uma lata de óleo, utilize a fórmula abaixo.

        V = pi * R ao quadrado * A

        Onde:
	    V = Volume
	    = 3.141592654
	    R = Raio da circunferência da lata
	    A = Altura da lata
	    OBS: O volume deve ser apresentado com a unidade de medida correto cm3.
         */
        Scanner entrada = new Scanner(System.in);
        double volumeLataDeOleo, raioCircuferenciaLata, alturaDaLata;
        System.out.printf("Digite o valor do raio da circuferencia da lata: ");
        raioCircuferenciaLata = entrada.nextDouble();
        System.out.printf("Digite o valor da altura da lata: ");
        alturaDaLata = entrada.nextDouble();
        volumeLataDeOleo = 3.14 * Math.pow(raioCircuferenciaLata, 2) * alturaDaLata;
        System.out.printf("O volume da lata de óleo é %.2f cm3",volumeLataDeOleo);

    }
}
