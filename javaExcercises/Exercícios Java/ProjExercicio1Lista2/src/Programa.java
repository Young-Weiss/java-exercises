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
		
		System.out.printf("Informe endere�o residencial: ");
		novoAluno.enderecoResidencial = scan.next();
		
		System.out.printf("Informe seu ano de nascimento: ");
		novoAluno.anoNascimento = scan.nextInt();
		
		System.out.printf("Informe seu telefone: ");
		novoAluno.telefone = scan.next();
		
		System.out.printf("O senhor(a) " + novoAluno.nome + " " + novoAluno.sobrenome + ", com n�mero de matricula " + novoAluno.matricula 
				+ ", com seu endere�o " + novoAluno.enderecoResidencial + ", e seu n�mero de telefone � " + novoAluno.telefone + "!");
	}
}
