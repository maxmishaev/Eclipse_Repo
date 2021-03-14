package classesLessons;

public class CarOwner {
	public static void main(String[] args) {
		Car carDrive = new Car();
		int timeSpeed = 70;
		
		carDrive.start();
		carDrive.stop();
		System.out.println("Мы ехали " + timeSpeed + " мин., и за это время проехали расстояние " + carDrive.drive(70) + " метров.");
		carDrive.drive(70);
		System.out.println();
		
		JamesBondCar driveBond = new JamesBondCar();
		
		System.out.println("А теперь мы несёмся по улицам с агентом 007!");
		System.out.println("Его машина едет в " + driveBond.drive(timeSpeed)/carDrive.drive(timeSpeed) + " раза быстрее,");
		System.out.println("и за те же " + timeSpeed + " минут мы проедем " + driveBond.drive(timeSpeed) + " метров! Хааа!\nЕсли только не попадём в пробку!");
		System.out.print("Бонд! ");
		driveBond.stop();
	}

}
