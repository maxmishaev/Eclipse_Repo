package JavaSchildt_Lessons;

public class FileSoftDemo {

	public static void main(String[] args) {
		
		//Демонстрация работы с отказоустойчивым массивом
		FailSoftArray fs = new FailSoftArray(5,-1);
		int x;
		
		//Демонстрация корректной обработки ошибок
		System.out.println("Обработка ошибок без вывода отчёта");
		for(int i=0; i<(fs.length*2); i++) {
			fs.put(i, i*10);			
		}
		for(int i=0; i<(fs.length*2); i++) {
			x = fs.get(i);
			if (x != -1) System.out.print(x + " ");
		}
		System.out.println();
		
		//Обработка ошибок
		System.out.println("\nОбработка ошибок с выводом отчёта");
		for(int i=0; i<(fs.length*2); i++) {
			if(!fs.put(i, i*10)) 
				System.out.println("Индекс " + i + " вне допустимого диапазона");
		}
		System.out.println("\n");
		for (int i = 0; i<(fs.length*2); i++) {
			x = fs.get(i);
			if(x != -1) System.out.print(x + " ");
			else System.out.print("\nИндекс " + i + " вне допустимого диапазона");
		}		

	}

}
