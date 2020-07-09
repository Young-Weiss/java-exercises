package ProjExercicio4Lista8;

public class AcademiaUtil {

	public static double obterPesoIdeal(Aluno aluno) {
		double pesoIdeal = 0;
		
		if ( aluno.getGenero() == 1 ) {
			pesoIdeal = (aluno.getAltura() - 100) * 0.9;
		} else {
			pesoIdeal = (aluno.getAltura() - 100) * 0.85;
		}
		
		return pesoIdeal;
	}
		
	
}
