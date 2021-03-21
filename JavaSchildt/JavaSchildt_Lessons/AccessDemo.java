package JavaSchildt_Lessons;

public class AccessDemo {

	public static void main(String[] args) {
		MyClasses ob = new MyClasses();
		
		// Доступ к alpha возможен только с помощью определённых внутри класса методов
		ob.setAlpha(-99);
		System.out.println("ob.alpha:" + ob.getAlpha());
		
		//Ниже показан недопустимый способ к переменной alpha
		//ob.alpha = 10; - выдаёт ошибку при компилировании. alpha - закрытая переменная (private)
		
		ob.beta = 98;
		ob.gamma = 99;
		System.out.print("ob.beta: " + ob.beta + "\n" + "ob.gamma: " + ob.gamma + "\n");

	}

}
