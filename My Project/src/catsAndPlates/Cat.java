package catsAndPlates;

public class Cat {
	  private String name;
	  private boolean hungry = true;
	  private int eatFood;  

	  Cat(String name, int eatFood) {
	    this.name = name;
	    this.eatFood = eatFood;
	  } 
	  
	  void voice () {
	    System.out.println(" says: Meow!");  
	  }

	  String getCatName() {
	    return name;
	  }

	  void setCatName(String n) {
	    name = n;
	  }

	  int getCatEatFood() {
	    return eatFood;
	  }

	  void setCatEatFood(int e) {
	    eatFood = e;
	  }

	  boolean getCatHungry() {
	    return hungry;
	  }

	  void setCatHungry(boolean h) {
	    hungry = h;
	  }

	  
	  public void cat2Eat (Plate p) {
	    //��� ���. ���������� ��� � ����� �����������. 
	    //���� � ����� ��� ������, ��� ������ ����, �� �� ���.    
	    int ostatok = p.getPlateFull() - eatFood;    
	    
	    if ((ostatok > 0) && (p.getPlateFull() > eatFood)) {
	      p.setPlateFull(ostatok);      
	      hungry = false;      
	      System.out.println("��� " + name + " ������");
	    } else {       
	      hungry = true;
	      System.out.println("���� " + name + " �� ������� ���! �������� ��� � �����!");           
	    }    

	  } 
	 
	}
