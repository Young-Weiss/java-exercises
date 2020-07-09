
public class Programa {
	public static void main(String[] args) {
		Teclado teclado = new Teclado();
		
		System.out.println("Informe o id da conta: ");
		String id = teclado.leString();
		
		System.out.println("Informe seu nome: ");
		String nomeTitular = teclado.leString();
		
		System.out.println("Informe seu sobrenome: ");
		String sobrenomeTitular = teclado.leString();
		
		System.out.println("Informe seu endereço: ");
		String enderecoResidencialTitular = teclado.leString();
		
		System.out.println("Informe o saldo da conta: ");
		double saldo = teclado.leDouble();
		
		ContaBancaria conta = new ContaBancaria();
		
		conta.setId(id);
		conta.setNomeTitular(nomeTitular);
		conta.setSobrenomeTitular(sobrenomeTitular);
		conta.setEnderecoResidencialTitular(enderecoResidencialTitular);
		conta.setSaldo(saldo);
		
		conta.depositar(10);
		conta.depositar(15);
		conta.sacar(10);
		conta.depositar(5);
		
		System.out.println("O saldo da conta foi " + conta.getSaldo());
	}
	
}
