package JavaSchildt_Lessons;
//Демонстрирует передачу объектов в метод.
public class Err {
	String msg;	  // Сообщение об ошибке
	int severity; //Серьёзность ошибки

	Err (String m, int s) {
		msg = m;
		severity = s;
	}
}

class ErrorInfo {
	String msgs[] = {
			"Ошибка вывода",
			"Ошибка ввода",
			"Отсутствует место на диске",
			"Выход индекса за границы диапазона"
	};
	int howbad[] = {3,3,2,4};
	Err getErrorInfo(int i) { //Возвращает объект типа Err
		if(i>=0 & i<msgs.length) return new Err(msgs[i], howbad[i]);
		else 
			return new Err("Несуществующий код ошибки", 0);
	}
}
