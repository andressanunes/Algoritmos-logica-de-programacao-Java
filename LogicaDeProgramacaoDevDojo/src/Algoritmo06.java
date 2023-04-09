import java.util.Scanner;

public class Algoritmo06 {
    public static void main (String [] args) {
        /*
        Efetuar o cálculo de quantos litros de combustível um automóvel consome em uma viagem.
        Sabendo que o automóvel tem uma autonomia de 12 Km por litro de combustível, desenvolva o cálculo utilizando a fórmula abaixo:
        D=TV
	    LU=D / 12
	    Onde:
		D = Distância em Km
		T = Tempo gasto na viagem
		V = Velocidade



         */
        Scanner entrada = new Scanner(System.in);
        double distanciaTotalKm, tempoTotalViagem, velocidade, consumoLitrosViagem;
        System.out.printf("Digite a velocidade do carro: ");
        velocidade = entrada.nextDouble();
        System.out.printf("Digite o tempo total gasto na viagem em horas: ");
        tempoTotalViagem = entrada.nextDouble();
        distanciaTotalKm = tempoTotalViagem * velocidade;
        consumoLitrosViagem = distanciaTotalKm / 12;
        System.out.printf("O consumo médio de litros gastos em uma viagem é %.2f litros",consumoLitrosViagem);

    }
}
