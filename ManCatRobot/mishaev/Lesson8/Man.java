package mishaev.Lesson8;

public class Man implements RunAndJump {
	//Поля
	private String name;
	private int maxDist;
	private int maxHeight;
	private boolean sposobnost = true;
	
	//Конструктор класса
	Man(String name, int maxDist, int maxHeight) {
		this.name = name;
		this.maxDist = maxDist;
		this.maxHeight = maxHeight;
	}	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getMaxDist() {
		return maxDist;
	}
	
	public void setMaxDist(int maxDist) {
		this.maxDist = maxDist;
	}
	
	public int getMaxHeight() {
		return maxHeight;
	}
	
	public void setMaxHeight(int maxHeight) {
		this.maxHeight = maxHeight;
	}
	
	public boolean getSposobnost() {
		return sposobnost;
	}
	
	public void setSposobnost(boolean sposobnost) {
		this.sposobnost = sposobnost;
	}
	
	public void jump(Wall height) {
		if(sposobnost) {
			int h = height.getWallHeight();
			String t = height.getType();
			System.out.printf("Я человек. Меня зовут %s. Я сейчас лезу на %s высотой %d\n", name, t, h);
			System.out.printf("А взобраться я могу на высоту %d\n", maxHeight);
			if (h <= maxHeight) {
				System.out.println("Преодолеваю!!!\n");			
			} else {
				System.out.println("АААА! Не могу преодолеть! Сошёл с дистанции.\n");
				setSposobnost(false);
		}
		} else {
			System.out.printf("Человек %s сошёл с дистанции\n\n", name);
		}
	}

	@Override
	public void run(RunRoad distance) {
		if(sposobnost) {
			int h = distance.getRoadDist();
			String t = distance.getType();
			System.out.printf("Я человек. Меня зовут %s. Я сейчас бегу по %s длиной %d\n", name, t, h);
			System.out.printf("А пробежать я могу %d\n", maxDist);
			if (h <= maxDist) {
				System.out.println("Преодолеваю!!!\n");			
			} else {
				System.out.println("АААА! Не могу преодолеть! Сошёл с дистанции.\n");
				setSposobnost(false);
		}
		} else {
			System.out.printf("Человек %s сошёл с дистанции\n\n", name);
		}	
		
	}
	
	
}

