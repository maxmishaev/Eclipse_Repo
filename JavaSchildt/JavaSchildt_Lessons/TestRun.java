package JavaSchildt_Lessons;

public class TestRun {

	public static void main(String[] args) {
		Test ob = new Test(15,20);
		System.out.println("ob.a � ob.b ����� �������: " + ob.a + " " + ob.b);
		ob.change(ob);
		System.out.println("ob.a � ob.b ����� ������: " + ob.a + " " + ob.b);		

	}

}
