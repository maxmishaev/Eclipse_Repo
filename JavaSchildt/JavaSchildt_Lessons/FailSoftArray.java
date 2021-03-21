package JavaSchildt_Lessons;

public class FailSoftArray {
	
	//���� ����� ��������� ���������������� ������, ���������� ���������� ����� �� ������� �������
	private int a[]; //������ �� ������
	private int errval; //��� �������� ������������ ������ get � ���������� ������
	public int length; // �������� ���������� length
	
	//������������ ������ ���������� ������ ������� � ��������, 
	//������� ����� get ������� � ������ ������
	
	public FailSoftArray(int size, int errv) {
		a = new int[size];
		errval = errv;
		length = size;
	}
	
	//������� true, ���� ������ �� ������� �� ������� �������
	private boolean indexOK(int index) {
		if (index>=0 && index<length) return true;
		return false;
	}
	
	//������� �������� �������� ������� � �������� ��������
	public int get (int index) {
		if(indexOK(index)) return a[index];
		return errval; 
			
	}

	//��������� �������� �������� � �������� ��������
	//���� ������, ������������ �������� false
	
	public boolean put(int index, int val) {
		if(indexOK(index)) {
			a[index] = val;
			return true;
		}
		return false;
	}
	
}
