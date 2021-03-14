package classesLessons;

public class ReportCard {
	
	public static char convertGrades(int yourGrade) {
		char grades = 'D';
		if(yourGrade>=90 && yourGrade<=100) {
			grades = 'A';
		} else if(yourGrade>=80 && yourGrade<=90) {
			grades = 'B';
		} else if(yourGrade>=70 && yourGrade<=80) {
			grades = 'C';
		} 		
		return grades;
	}
}
