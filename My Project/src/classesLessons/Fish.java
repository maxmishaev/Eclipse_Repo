package classesLessons;

public class Fish extends Pet {
	int currentDepth = 0;
	
	public int dive(int howDeep) {
		currentDepth+=howDeep;
		System.out.println("����� �� ������� " + howDeep + " ������");
		
		if(currentDepth>100) {
			System.out.println("� ��������� ����� � �� ���� ������� ������ 100 ������!");
			currentDepth-=howDeep;
			System.out.println("����������� �� ���������� ������� - " + currentDepth + " �����");
			System.out.println();
		} else {
		System.out.println("� �� ������� " + currentDepth + " �����");
		}
		
		return currentDepth;		
	}
	
	public String say(String someThing) {
		return "�� ����� �� ������, ��� ���� �� �������?!!!";
	}

}
