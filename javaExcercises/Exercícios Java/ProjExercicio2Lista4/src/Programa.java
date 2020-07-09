
public class Programa {
	
	public static void main(String[] args) {
		
		Teclado tec = new Teclado();
		TemperaturaCelsius temp = new TemperaturaCelsius();
		
		System.out.println("Digite a temperatura em Celsius: ");
		temp.setTemperatura(tec.leDouble());
		
		System.out.println("O valor em Fahrenheit: " + temp.obterTemperaturaEmFahrenheit());
		System.out.println("O valor em Kelvin: " + temp.obterTemperaturaEmKelvin());
	}
}
