package catsAndPlates;

public class Plate {
	  private int full = 100;
	  
	  Plate(int f) {
	    full = (f >= 0)? f: full;   
	  }

	  void setPlateFull(int f) {
	    full = (f >= 0)? f: full;    
	  }

	  int getPlateFull() {
	    return full;
	  }

	  void increaseFood() {
	    full = 200;
	    System.out.println("����� ���������");
	    System.out.printf("� �����: %d ������ ���\n\n", full);
	  }

	}
