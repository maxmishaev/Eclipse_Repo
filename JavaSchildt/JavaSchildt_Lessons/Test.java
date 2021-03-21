package JavaSchildt_Lessons;

public class Test {

	int a, b;
	
	Test(int x, int y) {
		a = x;
		b = y;
	}
	
	//Передача объекта методу. Теперь переменные ob.a, ob.b объекта при вызове тоже будут меняться
	
	void change (Test ob) {
		ob.a = ob.a + ob.b;
		ob.b = -ob.b;
	}
}
