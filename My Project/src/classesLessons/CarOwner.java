package classesLessons;

public class CarOwner {
	public static void main(String[] args) {
		Car carDrive = new Car();
		int timeSpeed = 70;
		
		carDrive.start();
		carDrive.stop();
		System.out.println("�� ����� " + timeSpeed + " ���., � �� ��� ����� �������� ���������� " + carDrive.drive(70) + " ������.");
		carDrive.drive(70);
		System.out.println();
		
		JamesBondCar driveBond = new JamesBondCar();
		
		System.out.println("� ������ �� ������ �� ������ � ������� 007!");
		System.out.println("��� ������ ���� � " + driveBond.drive(timeSpeed)/carDrive.drive(timeSpeed) + " ���� �������,");
		System.out.println("� �� �� �� " + timeSpeed + " ����� �� ������� " + driveBond.drive(timeSpeed) + " ������! ����!\n���� ������ �� ������ � ������!");
		System.out.print("����! ");
		driveBond.stop();
	}

}
