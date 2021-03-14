package classesLessons;

public class TemperatureConvert {
	
	public float temperConv(float temperature, char systemTemp) {
		//Метод переводит градусы Цельсия в температуру по Фаренгейту, и наоборот.
			float temp = 0f;
		switch (systemTemp) {
		case 'F':
			temp = (temperature - 32)*5/9;
			break;
		case 'C':
			temp = temperature * 9/5 +32;
			break;
		}		
		
		return temp;
	}

}
