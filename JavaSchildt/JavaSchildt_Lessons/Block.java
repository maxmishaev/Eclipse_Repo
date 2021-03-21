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
	
	//true, если параметр ob определяет тот же параллелепипед (по длинам сторон)
	
	boolean sameBlock(Block ob) {
		if ((ob.a == a) && (ob.b == b) && (ob.c == c)) return true;
		else return false;
	}
	
	//true, если параллелепипед ob того же объёма
	boolean sameVolume(Block ob) {
		if (ob.volume == volume) return true;
		else return false;		
	}	

}
