package classesLessons;

public class RepCardMain {

	public static void main(String[] args) {
		
		//ReportCard repC = new ReportCard();
		
		char grade = ReportCard.convertGrades(85);
		System.out.println("������ ������: " + grade);
		
		grade = ReportCard.convertGrades(69);
		System.out.println("������ ������: " + grade);

	}

}
