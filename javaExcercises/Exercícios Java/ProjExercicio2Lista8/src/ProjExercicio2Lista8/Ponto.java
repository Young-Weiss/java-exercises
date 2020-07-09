package ProjExercicio2Lista8;

public class Ponto {
	
	private double x;
	private double y;
	
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public void setX(double x) {
		if ( x > 0)
			this.x = x;
	}
	public void setY(double y) {
		if (y > 0)
			this.y = y;
	}
	
	public Ponto(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public Ponto() {}
	
}
