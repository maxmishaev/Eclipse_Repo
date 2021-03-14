package classesLessons;

public class Pet {
	int age;
	float weight;
	float height;
	String color;
	
	public void sleep() {
		System.out.println("Всё, я очень хочу спааать! Спокойной ночи!");
	}

	public void eat() {
		System.out.println("Я очень голоден. Давайте что-нибудь скушаем");		
	}
	
	public String say(String aWord) {
		String petResponse = ("Я хочу сказать: " + aWord);
		return petResponse;
	}
	
}
	