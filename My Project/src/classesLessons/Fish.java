package classesLessons;

public class Fish extends Pet {
	int currentDepth = 0;
	
	public int dive(int howDeep) {
		currentDepth+=howDeep;
		System.out.println("Ныряю на глубину " + howDeep + " метров");
		
		if(currentDepth>100) {
			System.out.println("Я маленькая рыбка и не могу плавать глубже 100 метров!");
			currentDepth-=howDeep;
			System.out.println("Возвращаюсь на предыдущую глубину - " + currentDepth + " метра");
			System.out.println();
		} else {
		System.out.println("Я на глубине " + currentDepth + " футов");
		}
		
		return currentDepth;		
	}
	
	public String say(String someThing) {
		return "Ты разве не знаешь, что рыбы не говорят?!!!";
	}

}
