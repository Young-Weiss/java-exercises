package ProjExercicio2Lista8;

public class Reta {
	
	private Ponto ponto1;
	private Ponto ponto2;
	
	public Ponto getPonto1() {
		return ponto1;
	}
	public Ponto getPonto2() {
		return ponto2;
	}
	public void setPonto1(Ponto ponto1) {
		this.ponto1 = ponto1;
	}
	public void setPonto2(Ponto ponto2) {
		this.ponto2 = ponto2;
	}
	
	public Reta() {
		this.ponto1 = new Ponto();
		this.ponto2 = new Ponto();
	}
	
	public Reta(Ponto ponto1, Ponto ponto2) {
		this.ponto1 = ponto1;
		this.ponto2 = ponto2;
	}
	
	public double getDistancia() {
		double ponto1X = this.ponto1.getX();
		double ponto1Y = this.ponto1.getY();
				
		double ponto2X = this.ponto2.getX();
		double ponto2Y = this.ponto2.getY();
		
		double resultado = Math.sqrt(Math.pow((ponto2X - ponto1X), 2 ) + Math.pow((ponto2Y - ponto1Y ), 2));
		
		return resultado;
	}
	
}
