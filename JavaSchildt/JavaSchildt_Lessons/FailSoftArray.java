package JavaSchildt_Lessons;

public class FailSoftArray {
	
	//Этот класс реализует отказоустойчивый массив, программно отслеживая выход за пределы массива
	private int a[]; //Ссылка на массив
	private int errval; //Это значение возвращается методу get в результате ошибки
	public int length; // Открытая переменная length
	
	//Конструктору класса передаются размер массива и значение, 
	//которое метод get передаёт в случае ошибки
	
	public FailSoftArray(int size, int errv) {
		a = new int[size];
		errval = errv;
		length = size;
	}
	
	//Возврат true, если индекс не выходит за пределы массива
	private boolean indexOK(int index) {
		if (index>=0 && index<length) return true;
		return false;
	}
	
	//Возврат значения элемента массива с заданным индексом
	public int get (int index) {
		if(indexOK(index)) return a[index];
		return errval; 
			
	}

	//Установка значения элемента с заданным индексом
	//Если ошибка, возвращается значение false
	
	public boolean put(int index, int val) {
		if(indexOK(index)) {
			a[index] = val;
			return true;
		}
		return false;
	}
	
}
