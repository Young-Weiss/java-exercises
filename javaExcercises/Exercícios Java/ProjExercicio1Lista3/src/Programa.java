import java.util.Scanner;

public class Programa {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Aluno aluno1 = new Aluno();
		
		System.out.printf("Informe seu nome: ");
		aluno1.setNome(scan.next());
		
		System.out.printf("Informe seu sobrenome: ");
		aluno1.setSobrenome(scan.next());
		
		System.out.printf("Informe seu matricula: ");
		aluno1.setMatricula(scan.next());
		
		System.out.printf("Informe seu ano de nascimento: ");
		aluno1.setAnoNascimento(scan.nextInt());
		
		System.out.printf("Informe seu endere�o: ");
		aluno1.setNome(scan.next());
		
		System.out.printf("Informe seu telefone: ");
		aluno1.setNome(scan.next());
		
		System.out.println("Voc� informou as informa��es");
		System.out.println("Nome :" + aluno1.getNome());
		System.out.println("Sobrenome: " + aluno1.getSobrenome());
		System.out.println("Matricula: " + aluno1.getMatricula());
		System.out.println("Idade: " + aluno1.getCalcularIdade());
		System.out.println("Endere�o: " + aluno1.getEndere�o());
		System.out.println("Telefone: " + aluno1.getTelefone());
	}
}
