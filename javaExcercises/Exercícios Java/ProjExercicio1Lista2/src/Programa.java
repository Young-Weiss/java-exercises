import java.util.Scanner;

public class Programa {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Aluno novoAluno = new Aluno();
		
		System.out.printf("Informe sua matricula: ");
		novoAluno.matricula = scan.next();
		
		System.out.printf("Informe seu nome: ");
		novoAluno.nome = scan.next();
		
		System.out.printf("Informe seu sobrenome: ");
		novoAluno.sobrenome = scan.next();
		
		System.out.printf("Informe endereço residencial: ");
		novoAluno.enderecoResidencial = scan.next();
		
		System.out.printf("Informe seu ano de nascimento: ");
		novoAluno.anoNascimento = scan.nextInt();
		
		System.out.printf("Informe seu telefone: ");
		novoAluno.telefone = scan.next();
		
		System.out.printf("O senhor(a) " + novoAluno.nome + " " + novoAluno.sobrenome + ", com número de matricula " + novoAluno.matricula 
				+ ", com seu endereço " + novoAluno.enderecoResidencial + ", e seu número de telefone é " + novoAluno.telefone + "!");
	}
}
