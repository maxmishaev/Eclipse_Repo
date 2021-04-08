package mishaev.Lesson8;

public class ManCatRobot {
	
	public static void main(String[] args) {
		System.out.println("�������� ���");
		RunAndJump[] sprint = {
				new Man("����", 100, 3),
				new Man("Sirgay", 50, 1),
				new Cat("����", 70, 3),
				new Cat ("�����", 150, 2),
				new Robot("T1000", 200, 3),
				new Robot("T100", 100, 2),
		};
		Prepyatstviya[] wallsAndRoads = {
				new Wall("�����1", 1),
				new RunRoad("�������1", 50),
				new Wall("�����2", 3),
				new RunRoad("�������2", 130),				 
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
		System.out.println("�����");
		System.out.println("\n�� ������ �����:");
		for(RunAndJump spr: sprint) {
			System.out.println(spr.getName() + " - " + spr.getSposobnost());
		}
		
	}

}














