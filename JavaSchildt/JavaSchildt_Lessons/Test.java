package JavaSchildt_Lessons;

public class Test {

	int a, b;
	
	Test(int x, int y) {
		a = x;
		b = y;
	}
	
	//�������� ������� ������. ������ ���������� ob.a, ob.b ������� ��� ������ ���� ����� ��������
	
	void change (Test ob) {
		ob.a = ob.a + ob.b;
		ob.b = -ob.b;
	}
}
