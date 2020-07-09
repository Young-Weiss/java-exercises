package ProjExercicio2Lista9;

import java.util.ArrayList;

public class Programa {

	public static void main(String[] args) {
		
		Teclado teclado = new Teclado();
		int continuar = 0;
		ArrayList<OperacaoBancaria> operacoesBancarias = new ArrayList<OperacaoBancaria>();
		
		do {
			
			System.out.println("Digite a descrição da operação:");
			String descricao = teclado.leString();
			
			System.out.println("Digite o tipo da operação: (C para crédito e D para débito)");
			char tipo = teclado.leChar();

			System.out.println("Digite o valor da operação:");
			double valor = teclado.leDouble();
			
			OperacaoBancaria operacao = new OperacaoBancaria(descricao, valor, tipo );
			operacoesBancarias.add(operacao);
			
			System.out.println("Deseja realizar outra operação? [1] Sim [2] Não");
			continuar = teclado.leInt();
			
		} while (continuar == 1);
		
		double somaTotal = 0;
		double saldo = 0;
		
		for (int i = 0; i < operacoesBancarias.size(); i++) {
			double valor = operacoesBancarias.get(i).getValor();
			somaTotal = somaTotal + valor;
			
			if (operacoesBancarias.get(i).getTipo() == 'C')
				saldo += valor;
			else
				saldo -= valor;
			
		}

		System.out.println("Soma de valores das operações: " + somaTotal);
		System.out.println("Média dos valores das operações: " + somaTotal / operacoesBancarias.size() );
		System.out.println("Saldo da conta: " + saldo );
		
		
				
	}
}
