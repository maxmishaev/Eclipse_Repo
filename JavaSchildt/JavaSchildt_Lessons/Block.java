package JavaSchildt_Lessons;

public class Block {
	int a, b, c;
	int volume;
	
	Block (int i, int j, int k) {
		a = i;
		b = j;
		c = k;
		volume = a*b*c;		
	}
	
	//true, ���� �������� ob ���������� ��� �� �������������� (�� ������ ������)
	
	boolean sameBlock(Block ob) {
		if ((ob.a == a) && (ob.b == b) && (ob.c == c)) return true;
		else return false;
	}
	
	//true, ���� �������������� ob ���� �� ������
	boolean sameVolume(Block ob) {
		if (ob.volume == volume) return true;
		else return false;		
	}	

}
