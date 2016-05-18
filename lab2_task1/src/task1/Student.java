package task1;

public class Student {

	public String surname;
	public int allLessons;
	public int missedLessons;

	public Student(String surname, int allLessons, int missedLessons) {
		this.surname = surname;
		this.allLessons = allLessons;
		this.missedLessons = missedLessons;
	}

	public static double equality(Student student) {
		return (double) student.missedLessons / student.allLessons;
	}

}
