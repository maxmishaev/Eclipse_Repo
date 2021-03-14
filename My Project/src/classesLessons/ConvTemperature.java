package classesLessons;

public class ConvTemperature {

	public static void main(String[] args) {
		float Fahr = 50f;
		float Cels = 0f;
		TemperatureConvert tc = new TemperatureConvert();
				
		System.out.println(Cels + " Celsius -> " + tc.temperConv(Cels, 'C') + " Fahrenheit");
		
		System.out.println(Fahr + " Fahrenheit -> " + tc.temperConv(Fahr, 'F') + " Celsius");

	}

}
