package mishaev.Lesson8;

public class Man implements RunAndJump {
	//����
	private String name;
	private int maxDist;
	private int maxHeight;
	private boolean sposobnost = true;
	
	//����������� ������
	Man(String name, int maxDist, int maxHeight) {
		this.name = name;
		this.maxDist = maxDist;
		this.maxHeight = maxHeight;
	}	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getMaxDist() {
		return maxDist;
	}
	
	public void setMaxDist(int maxDist) {
		this.maxDist = maxDist;
	}
	
	public int getMaxHeight() {
		return maxHeight;
	}
	
	public void setMaxHeight(int maxHeight) {
		this.maxHeight = maxHeight;
	}
	
	public boolean getSposobnost() {
		return sposobnost;
	}
	
	public void setSposobnost(boolean sposobnost) {
		this.sposobnost = sposobnost;
	}
	
	public void jump(Wall height) {
		if(sposobnost) {
			int h = height.getWallHeight();
			String t = height.getType();
			System.out.printf("� �������. ���� ����� %s. � ������ ���� �� %s ������� %d\n", name, t, h);
			System.out.printf("� ���������� � ���� �� ������ %d\n", maxHeight);
			if (h <= maxHeight) {
				System.out.println("�����������!!!\n");			
			} else {
				System.out.println("����! �� ���� ����������! ����� � ���������.\n");
				setSposobnost(false);
		}
		} else {
			System.out.printf("������� %s ����� � ���������\n\n", name);
		}
	}

	@Override
	public void run(RunRoad distance) {
		if(sposobnost) {
			int h = distance.getRoadDist();
			String t = distance.getType();
			System.out.printf("� �������. ���� ����� %s. � ������ ���� �� %s ������ %d\n", name, t, h);
			System.out.printf("� ��������� � ���� %d\n", maxDist);
			if (h <= maxDist) {
				System.out.println("�����������!!!\n");			
			} else {
				System.out.println("����! �� ���� ����������! ����� � ���������.\n");
				setSposobnost(false);
		}
		} else {
			System.out.printf("������� %s ����� � ���������\n\n", name);
		}	
		
	}
	
	
}

