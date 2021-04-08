package mishaev.Lesson8;

public class ManCatRobot {
	
	public static void main(String[] args) {
		System.out.println("ТЕСТОВЫЙ КОД");
		RunAndJump[] sprint = {
				new Man("Вася", 100, 3),
				new Man("Sirgay", 50, 1),
				new Cat("Котя", 70, 3),
				new Cat ("Мурза", 150, 2),
				new Robot("T1000", 200, 3),
				new Robot("T100", 100, 2),
		};
		Prepyatstviya[] wallsAndRoads = {
				new Wall("Стена1", 1),
				new RunRoad("Дорожка1", 50),
				new Wall("Стена2", 3),
				new RunRoad("Дорожка2", 130),				 
		};
		
		
		for(int i = 0; i < wallsAndRoads.length; i++) {
			for(int j = 0; j < sprint.length; j++) {
				if (wallsAndRoads[i] instanceof Wall) {
					sprint[j].jump((Wall)wallsAndRoads[i]);
				} else {
					sprint[j].run((RunRoad)wallsAndRoads[i]);					
				}
			}
		}
		System.out.println("ФИНИШ");
		System.out.println("\nДо ФИНИША дошли:");
		for(RunAndJump spr: sprint) {
			System.out.println(spr.getName() + " - " + spr.getSposobnost());
		}
		
	}

}














