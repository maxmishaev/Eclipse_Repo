package catsAndPlates;

public class CatsAndPlates {

	  public static void main(String[] args) {
	    
	    Plate plate1 = new Plate(40);     //������ ��������� �����
	    
	    Cat cats[] = {                //������ ���������� �����
	      new Cat("������", 30),
	      new Cat("�����", 40),
	      new Cat("�������", 45),
	      new Cat("�������", 90),
	      new Cat("�����", 80),
	    };
	    //��������� ����� ����� ��������
	    catStatus(cats, "��������� ����� ����� ���̨����");

	    //��������� ����� 
	    System.out.println("������ �����"); 

	    boolean sytost;
	    boolean catsHungry = true;
	    
	    while(catsHungry) {
	      for (int i = 0; i < cats.length; i++) { 
	        if(cats[i].getCatHungry() == true) {
	          System.out.printf("\n��� � �����: %d\n", plate1.getPlateFull());
	          System.out.printf("��� %s ��� %d ������ ���\n", cats[i].getCatName(),cats[i].getCatEatFood());
	                
	          cats[i].cat2Eat(plate1); //��� ���
	        } 
	          sytost = false;           
	          for(Cat catNum: cats) {                         
	            sytost = sytost || catNum.getCatHungry(); //���������, ������� �� ����.���� ���� �� � ������ ���� ����� true, ������, ���� �� ���� �� ����� �������.
	          }
	          catsHungry = sytost;
	          
	        System.out.printf("��� %s �������? %s\n��������� ���� �������?  %s\n", cats[i].getCatName(), cats[i].getCatHungry(), catsHungry);
	        System.out.print("\n");
	      }
	      if(catsHungry == true) { 
	        plate1.increaseFood();         
	      }
	    }      
	    //��������� ����� ����� �������
	    catStatus(cats, "��������� ����� ����� ���̨���");
	  }

	  public static void catStatus(Cat catArr[], String status) {
	  //���������� ����� �����, � ��� �� ��� �������
	      System.out.println(status);
	      String x = "";
	      for(int i = 0; i<catArr.length; i++) {
	        x = (catArr[i].getCatHungry())? "�������": "���";
	        System.out.printf("%s - %s\n",catArr[i].getCatName(),x);
	      }
	      System.out.println();
	  }
	}
	
	