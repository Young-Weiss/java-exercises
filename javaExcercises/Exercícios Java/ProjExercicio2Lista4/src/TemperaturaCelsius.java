
public class TemperaturaCelsius {

	private double temperatura;
	
	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}

	public double getTemperatura() {
		return temperatura;
	}
	
	public double obterTemperaturaEmFahrenheit() {

		return (this.temperatura * 1.8) + 32;
				
	}
	
	public double obterTemperaturaEmKelvin() {
		
		return this.temperatura + 273.15;
				
	}
	
}
