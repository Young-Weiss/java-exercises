package ProjExercicio3Lista7;

public class Triangulo {
	
	private double a;
	private double b;
	private double c;
	
	public double getA() {
		return a;
	}
	
	public void setA(double a) {
		if ( a > 0 )
			this.a = a;
	}
	
	public double getB() {
		return b;
	}
	
	public void setB(double b) {
		if ( b > 0 )
			this.b = b;
	}
	
	public double getC() {
		return c;
	}
	public void setC(double c) {
		if ( c > 0 )
			this.c = c;
	}
	
	public String obterTipoTriangulo() {
		String triangulo;
				
		if ( this.a == this.b && this.b == this.c ) {
			triangulo = "Equilátero";
			
		} else if ( (this.a == this.b && this.b != this.c) || (this.a == this.c && this.c != this.b) || ( this.b == this.c && this.b != this.a)  ) {
			triangulo = "Isósceles";	
		} else {
			triangulo = "Escaleno";
		}
		
		return triangulo;
	}
	
}
