package JavaSchildt_Lessons;

public class FileSoftDemo {

	public static void main(String[] args) {
		
		//������������ ������ � ���������������� ��������
		FailSoftArray fs = new FailSoftArray(5,-1);
		int x;
		
		//������������ ���������� ��������� ������
		System.out.println("��������� ������ ��� ������ ������");
		for(int i=0; i<(fs.length*2); i++) {
			fs.put(i, i*10);			
		}
		for(int i=0; i<(fs.length*2); i++) {
			x = fs.get(i);
			if (x != -1) System.out.print(x + " ");
		}
		System.out.println();
		
		//��������� ������
		System.out.println("\n��������� ������ � ������� ������");
		for(int i=0; i<(fs.length*2); i++) {
			if(!fs.put(i, i*10)) 
				System.out.println("������ " + i + " ��� ����������� ���������");
		}
		System.out.println("\n");
		for (int i = 0; i<(fs.length*2); i++) {
			x = fs.get(i);
			if(x != -1) System.out.print(x + " ");
			else System.out.print("\n������ " + i + " ��� ����������� ���������");
		}		

	}

}
