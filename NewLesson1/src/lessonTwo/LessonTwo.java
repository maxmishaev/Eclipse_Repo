package lessonTwo;

public class LessonTwo {
	
	public static int[] arrChange(int[] arr1) {
        //Метод получает массив из нулей и единиц.
        // и заменяет нули на единицы, а единицы на нули.
        for(int i=0; i<arr1.length;i++){
            arr1[i] = (arr1[i] == 1) ? 0: 1;
    /*if (arr1[i]==1) {
      arr1[i]=0;
    } else {
      arr1[i]=1;
    }
    */
        }
        return arr1;
    }

    public static int [] lessSixMultTwo(int arrX[]) {
        //Метод просматривает целочисленный массив и числа меньше 6 умножает на 2

        for (int i=0; i<arrX.length - 1; i++)    {
            if (arrX[i] < 6) {
                arrX[i]*=2;
            }

        }
        return arrX;
    }


    public static int arrMax(int[] arr) {
    	//Метод находит максимальный элемент в массиве
        int maxVal=0;
        int valPromezh;
        for(int i=0, j=arr.length-1; i<arr.length - 1; i++, j--) {

            valPromezh = (arr[i] > arr[j]) ? arr[i]: arr[j];

            if (maxVal < valPromezh) {
                maxVal = valPromezh;
            }

        }
        return maxVal;
    }

    public static int arrMin(int[] arr) {
    	//Метод находит минимальный элемент в массиве
        int minVal=0;
        int valPromezh = 0;
        for(int i=0, j=arr.length-1; i<arr.length - 1; i++, j--) {

            valPromezh = (arr[i] < arr[j]) ? arr[i]: arr[j];

            if (minVal > valPromezh) {
                minVal = valPromezh;
            }

        }
        return minVal;
    }


    public static int[][] oneInDiagonals(int[][] arrSquare) {
        //Метод получает двумерный квадратный массив, заполняет его диагонали единицами. и возвращает результат в двумерном массиве

        for(int i=0, j=arrSquare.length-1; i<arrSquare.length; i++,j--) {

            arrSquare[i][i] = 1;
            arrSquare[i][j] = 1;

        }
        return arrSquare;
    }


	public static boolean arrPartsEqual(int [] intChisl) {
		//Метод последовательно сравнивает суммы элементов левой и правой частей массива целых чисел. Если сумма элементов левой и правой частей равна, то возвращается true. Иначе - false.
		boolean bul = false;
		int sumLeft = 0;
		int sumRight = 0;
		for (int i=0; i<intChisl.length; i++) {
			for( int x=i; x>-1;x--) {
				sumLeft+=intChisl[x];      
			}
	    System.out.print("Сумма левая " + sumLeft);
	    
			for(int y=i+1; y<intChisl.length;y++) {
				sumRight+=intChisl[y];
	   	}
	    System.out.print(" Сумма правая " + sumRight);
			if(sumLeft == sumRight) {
	      System.out.println();
				bul = true;
				break;
			} 
	    System.out.println();
	    sumLeft = 0;
	    sumRight = 0;
	     }
	  return bul;
	  }

	  public static int[] cycleOffset(int[] arr, int n) {
		//Метод получает целочисленный массив и число n. Возвращает массив, элементы которого циклично смещены вправо (если n положительно) или влево (n отрицательно).
		//Случай отрицательного числа (смещение влево)
		int temporKeep;
		if (n<0) {
	  temporKeep = arr[0];  
		while(n < 0) {
				for(int i=1; i<arr.length; i++) {
				arr[i-1] = arr[i];
				}
			arr[arr.length-1] = temporKeep;
	    temporKeep = arr[0];
			n++;
			}
		} else {
		//n положительное
	  temporKeep = arr[arr.length - 1];
		while (n > 0){		
			for(int i=arr.length-1; i>=1; i--) {
				arr[i] = arr[i-1];
	    }
			arr[0] = temporKeep;
	    temporKeep = arr[arr.length- 1];
			n--;
			}    
	  } 
	  return arr; 
	 }
	  


	  public static void main(String[] args) {
		  
		//ЗАДАНИЕ 1. Задан массив из нулей и единиц. Заменить нули на единицы, а единицы на нули.
	        int[] arrFinal = {1,1,1,0,0,0,1,1,1};
	        arrFinal = arrChange(arrFinal);
	        for(int i=0; i<arrFinal.length; i++){
	            System.out.print(arrFinal[i] + ", ");
	        }

	        System.out.println();

	        //ЗАДАНИЕ 2. Заполнить массив из 8 элементов числами, увеличивающимися на 3.
	        System.out.print("[");
	        int[] arr8 = new int[8];
	        for(int i=0, j=0; i<8; i++,j+=3){
	            arr8[i] = j;
	            System.out.print(j + ",");
	        }
	        System.out.println("]");

	        //ЗАДАНИЕ 3. Есть целочисленный массив. Надо в нём числа меньше 6 умножить на 2
	        int [] givenArr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
	        givenArr = lessSixMultTwo(givenArr);

	        for(int i=0; i<givenArr.length - 1; i++) {
	            System.out.print(givenArr[i] + " ");
	        }

	        System.out.println();

	        //ЗАДАНИЕ 5**. Задан целочисленный массив. Найти максимальный и минимальный элементы массива.
	        int[] someArr = {-50, 415, 78, 5, 41, 60, 23, };

	        System.out.println("Максимальное: " + arrMax(someArr));
	        System.out.print("Минимальное: " + arrMin(someArr));

	        System.out.println();

	        //ЗАДАНИЕ 4. Задаётся квадратный целочисленный массив. Нужно заполнить его диагонали числами 1.
	        int [][] arrX = {{1,2,3,5,8},{2,5,6,9,5},{7,8,0,9,4}, {7,5,2,3,2}, {6,5,4,8,7}};
	        arrX = oneInDiagonals(arrX);

	        //arrRandSquare();

	        for(int i=0; i<arrX.length; i++) {
	            for(int j=0; j<arrX.length; j++) {
	                System.out.print(arrX[i][j] + " ");
	            }
	            System.out.println();
	        }

 
		  
	    /*
		  ЗАДАНИЕ 6. ** Написать метод, в который передается не пустой одномерный целочисленный массив. 
		  Метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны. 
		  Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true.
	   */
		  int[] arrInt = {1, 2, 3, 2, 2, 2};
	    System.out.print(arrPartsEqual(arrInt));
	    
	    System.out.println();
	    int[] arrInt1 = {2, 4, 6, 8, 10, 12};
	    System.out.print(arrPartsEqual(arrInt1));
	    System.out.println();
	    
	    /*
		ЗАДАНИЕ 7**** Написать метод, которому на вход подается одномерный массив и число n 
		(может быть положительным, или отрицательным), при этом метод должен сместить все элементы массива на n позиций. 
		Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами. 
		Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. 
		*/
	    System.out.println("Изначальный массив");
	    for(int i = 0; i<arrInt.length; i++) {
	      System.out.print(arrInt[i] + " ");
	    }
	    System.out.println();

	    System.out.println("Сдвиг влево");
	    cycleOffset(arrInt, -2);
	    for(int i=0;i<arrInt.length; i++){
	      System.out.print(arrInt[i] + " ");
	    }
	    System.out.println();

	    System.out.println("Сдвиг вправо");
	    cycleOffset(arrInt, 1);
	    for(int i=0;i<arrInt.length; i++){
	      System.out.print(arrInt[i] + " ");
	    }

	  } 

}
