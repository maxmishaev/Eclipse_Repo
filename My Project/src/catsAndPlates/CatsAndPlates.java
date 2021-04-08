package catsAndPlates;

public class CatsAndPlates {

	  public static void main(String[] args) {
	    
	    Plate plate1 = new Plate(40);     //Создаём экземпляр миски
	    
	    Cat cats[] = {                //Создаём экземпляры котов
	      new Cat("Мурзик", 30),
	      new Cat("Рыжик", 40),
	      new Cat("Грустик", 45),
	      new Cat("Толстяк", 90),
	      new Cat("Пахан", 80),
	    };
	    //Состояние котов перед кормёжкой
	    catStatus(cats, "СОСТОЯНИЕ КОТОВ ПЕРЕД КОРМЁЖКОЙ");

	    //Кормление котов 
	    System.out.println("КОРМИМ КОТОВ"); 

	    boolean sytost;
	    boolean catsHungry = true;
	    
	    while(catsHungry) {
	      for (int i = 0; i < cats.length; i++) { 
	        if(cats[i].getCatHungry() == true) {
	          System.out.printf("\nЕды в миске: %d\n", plate1.getPlateFull());
	          System.out.printf("Кот %s ест %d единиц еды\n", cats[i].getCatName(),cats[i].getCatEatFood());
	                
	          cats[i].cat2Eat(plate1); //Кот ест
	        } 
	          sytost = false;           
	          for(Cat catNum: cats) {                         
	            sytost = sytost || catNum.getCatHungry(); //Проверяем, голодны ли коты.Если хотя бы у одного кота будет true, значит, хотя бы один из котов голоден.
	          }
	          catsHungry = sytost;
	          
	        System.out.printf("Кот %s голоден? %s\nОстальные коты голодны?  %s\n", cats[i].getCatName(), cats[i].getCatHungry(), catsHungry);
	        System.out.print("\n");
	      }
	      if(catsHungry == true) { 
	        plate1.increaseFood();         
	      }
	    }      
	    //Состояние котов после кормёжки
	    catStatus(cats, "СОСТОЯНИЕ КОТОВ ПОСЛЕ КОРМЁЖКИ");
	  }

	  public static void catStatus(Cat catArr[], String status) {
	  //Показывает имена котов, и кто из них голоден
	      System.out.println(status);
	      String x = "";
	      for(int i = 0; i<catArr.length; i++) {
	        x = (catArr[i].getCatHungry())? "голоден": "сыт";
	        System.out.printf("%s - %s\n",catArr[i].getCatName(),x);
	      }
	      System.out.println();
	  }
	}
	
	