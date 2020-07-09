package ProjExercicio2Lista5;

public class Programa {

	public static void main(String[] args) {
		
		Teclado teclado = new Teclado();
		
		System.out.println("Informe o id da conta: ");
		int id = teclado.leInt();
		
		System.out.println("Informe o nome do titular da conta:");
		String nomeTitular = teclado.leString();
		
		System.out.println("Informe o sobrenome do titular da conta:");
		String sobrenomeTitular = teclado.leString();
		
		System.out.println("Informe o endereço do titular da conta:");
		String enderecoResidencialTitular = teclado.leString();
		
		System.out.println("Informe o saldo da conta:");
		double saldo = teclado.leDouble();
		
		ContaBancaria conta = new ContaBancaria();
		conta.setId(id);
		conta.setNomeTitular(nomeTitular);
		conta.setSobrenomeTitular(sobrenomeTitular);
		conta.setEnderecoResidencialTitular(enderecoResidencialTitular);
		conta.setSaldo(saldo);
		
		conta.depositar(16);
		conta.depositar(21);
		conta.sacar(5);
		conta.depositar(100);
		conta.sacar(250);
		
		System.out.println("Saldo da conta: " + conta.getSaldo());
		
	}
	
}
