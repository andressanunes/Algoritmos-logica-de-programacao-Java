import java.util.Scanner;

public class Algoritmo02 {
    public static void main (String[] args) {
        /*
        Baseado nas fórmulas abaixo, desenvolva uma rotina que calcule o salário líquido de um funcionário.
        Após o cálculo o programa deve apresentar o salário base e o salário líquido calculado.

        SB = HT * VH
        TD = (PD / 100) * SB
        SL = SB  - TD

        Onde:
        SB =  Salário Base
        HT = Horas Trabalhadas
	    VH = Valor Hora de trabalho
	    TD = Total de Descontos
        PD = Percentual de Desconto
        SL = Salário Líquido

        Futuro upgrade: colocar aliquota do INSS

         */
        System.out.println("Algoritmo para calculo de salário!");
        Scanner entrada = new Scanner(System.in);
        double horasTrabalhadas, valorHoras;
        System.out.print("Informe o valor de horas trabalhadas: ");
        horasTrabalhadas = entrada.nextDouble();
        System.out.print("Informe o valor de hora: ");
        valorHoras = entrada.nextDouble();
        double salarioBase,totalDescontos, salarioLiquido, percentualDesconto;
        percentualDesconto = 10;
        salarioBase = horasTrabalhadas * valorHoras;
        totalDescontos = (percentualDesconto/100)*salarioBase;
        salarioLiquido = salarioBase - totalDescontos;
        System.out.printf("O valor do salário base é R$%.2f e o valor do salário liquido é R$%.2f"
                ,salarioBase,salarioLiquido);
    }
}
