package JavaSchildt_Lessons;

public class PassBlock {

	public static void main(String[] args) {
		Block ob1 = new Block(10,2,5);
		Block ob2 = new Block(10,2,5);
		Block ob3 = new Block(4,5,5);
		
		System.out.println(ob1.a + " " + ob1.b + " " + ob1.c);
		System.out.println(ob2.a + " " + ob2.b + " " + ob2.c);
		System.out.println(ob3.a + " " + ob3.b + " " + ob3.c);
							
		System.out.println("ob1 טלווע עו זו נאחלונû, קעמ ט ob2: " + ob1.sameBlock(ob2));
		System.out.println("ob2 טלווע עו זו נאחלונû, קעמ ט ob3: " + ob2.sameBlock(ob3));
		System.out.println("־בת¸ל ob1 עמע זו, קעמ ט ף ob3: " + ob1.sameVolume(ob3));

	}

}
