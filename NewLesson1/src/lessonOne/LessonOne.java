package lessonOne;

public class LessonOne {

		  public static double formula(int a, int b, int c, int d) {
		    //����� ��������� ��������� a * (b + (c / d)) � ���������� ��������� � ��������� ������.
		    double x = (double) c/d;
		    return a * (b + x);
		  }

		  public static boolean betwTenAndTwenty(int a, int b) {
		    //����� ��������� �� ���� ��� ����� ����� � ���������, ��� �� ����� ����� � �������� �� 10 �� 20(������������)
		    int x = a + b;
		    return (x>=10 && x<=20) ? true: false;
		  }

		  public static String posOrNeg(int a) {
		    //����� �������� ����� ����� � ������ ��������� ������������� �� ��� ������������� ��� �����.
		    return (a<0)? " �������������": " �������������";
		  }

		  public static void privetName(String name) {
		    System.out.println("������, " + name);
		  }


		 public static void leapYearMethod (int year) {
			
		if(year%4!=0) {
				System.out.println("�� ����������");
				} else {
			
			if (year%100 != 0 || (year%100 == 0 && year%400 == 0))   {
				
				System.out.println("����������");
				 	
		     }
		    }
		 }

		  public static void main(String[] args) {
		    
		    /*
		1.�������� ����� ����������� ��������� a * (b + (c / d)) � ������������ ��������� � ��������� ������, ��� a, b, c, d � ������������� ������� ��������� ����� ������;
		2. �������� �����, ����������� �� ���� ��� ����� �����, � ����������� ��� �� ����� ����� � �������� �� 10 �� 20(������������), ���� �� � ������� true, � ��������� ������ � false;
		3. �������� �����, �������� � �������� ��������� ���������� ����� �����, ����� ������ ��������� ������������� �� ����� ��������, ��� �������������. ���������: ���� ������� ������������� ������. ��������� ������ ������ ������� � �������
		4. �������� �����, �������� � �������� ��������� ���������� ������, ������������ ���, ����� ������ ������� �������������� ��������� �������, ����������_���!�; ������� ����������� � �������.
		5. *�������� �����, ������� ���������� �������� �� ��� ����������. ������ 4-� ��� �������� ����������, ����� ������� 100-��, ��� ���� ������ 400-� � ����������. ��� �������� ������ ������� ���������� ������ ������ � �������
		    */
		// ������� 1
		int a = 10, b = 20, c = 30, d = 40;
		System.out.println();
		System.out.println(formula(a, b, d, c));
		System.out.println();

		//������� 2
		System.out.println(betwTenAndTwenty(a, b));
		System.out.println(betwTenAndTwenty(a, a));
		System.out.println();

		//������� 3
		a = 150;
		System.out.println("����� " + a + posOrNeg(a));
		b = -200;
		System.out.println("����� " + b + posOrNeg(b));
		System.out.println();

		//������� 4
		privetName("����");
		String imya = "Vova!";
		privetName(imya);

		//������� 5*
		System.out.println();
		leapYearMethod(1940);
		leapYearMethod(1984);
		leapYearMethod(2000);
		leapYearMethod(2010);
		leapYearMethod(2020);
		leapYearMethod(2021);
		  }
		

}
