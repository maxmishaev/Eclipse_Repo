package JavaSchildt_Lessons;

public class AccessDemo {

	public static void main(String[] args) {
		MyClasses ob = new MyClasses();
		
		// ������ � alpha �������� ������ � ������� ����������� ������ ������ �������
		ob.setAlpha(-99);
		System.out.println("ob.alpha:" + ob.getAlpha());
		
		//���� ������� ������������ ������ � ���������� alpha
		//ob.alpha = 10; - ����� ������ ��� ��������������. alpha - �������� ���������� (private)
		
		ob.beta = 98;
		ob.gamma = 99;
		System.out.print("ob.beta: " + ob.beta + "\n" + "ob.gamma: " + ob.gamma + "\n");

	}

}
