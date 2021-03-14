package classesLessons;

public class FishMaster {

	public static void main(String[] args) {
		Fish myFish = new Fish();
		myFish.dive(94);
		myFish.dive(7);
		
		System.out.println(myFish.say("Hello!"));
		
		myFish.sleep();

	}

}
