package lessonOne;

public class LessonOne {

		  public static double formula(int a, int b, int c, int d) {
		    //Метод вычисляет выражение a * (b + (c / d)) и возвращает результат с плавающей точкой.
		    double x = (double) c/d;
		    return a * (b + x);
		  }

		  public static boolean betwTenAndTwenty(int a, int b) {
		    //Метод принимает на вход два целых числа и проверяет, что их сумма лежит в пределах от 10 до 20(включительно)
		    int x = a + b;
		    return (x>=10 && x<=20) ? true: false;
		  }

		  public static String posOrNeg(int a) {
		    //Метод получает целое число и должен проверить положительное ли или отрицательное это число.
		    return (a<0)? " отрицательное": " положительное";
		  }

		  public static void privetName(String name) {
		    System.out.println("Привет, " + name);
		  }


		 public static void leapYearMethod (int year) {
			
		if(year%4!=0) {
				System.out.println("Не високосный");
				} else {
			
			if (year%100 != 0 || (year%100 == 0 && year%400 == 0))   {
				
				System.out.println("Високосный");
				 	
		     }
		    }
		 }

		  public static void main(String[] args) {
		    
		    /*
		1.Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат с плавающей точкой, где a, b, c, d – целочисленные входные параметры этого метода;
		2. Написать метод, принимающий на вход два целых числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
		3. Написать метод, которому в качестве параметра передается целое число, метод должен проверить положительное ли число передали, или отрицательное. Замечание: ноль считаем положительным числом. Результат работы метода вывести в консоль
		4. Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вернуть приветственное сообщение «Привет, переданное_имя!»; Вывести приветствие в консоль.
		5. *Написать метод, который определяет является ли год високосным. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный. Для проверки работы вывести результаты работы метода в консоль
		    */
		// ЗАДАНИЕ 1
		int a = 10, b = 20, c = 30, d = 40;
		System.out.println();
		System.out.println(formula(a, b, d, c));
		System.out.println();

		//ЗАДАНИЕ 2
		System.out.println(betwTenAndTwenty(a, b));
		System.out.println(betwTenAndTwenty(a, a));
		System.out.println();

		//ЗАДАНИЕ 3
		a = 150;
		System.out.println("Число " + a + posOrNeg(a));
		b = -200;
		System.out.println("Число " + b + posOrNeg(b));
		System.out.println();

		//ЗАДАНИЕ 4
		privetName("Друг");
		String imya = "Vova!";
		privetName(imya);

		//ЗАДАНИЕ 5*
		System.out.println();
		leapYearMethod(1940);
		leapYearMethod(1984);
		leapYearMethod(2000);
		leapYearMethod(2010);
		leapYearMethod(2020);
		leapYearMethod(2021);
		  }
		

}
