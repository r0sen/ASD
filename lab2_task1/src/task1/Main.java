package task1;

public class Main {

	public static void main(String[] args) {
		Student[] students = new Student[5];

		students[0] = new Student("Ivanov", 10, 5);
		students[1] = new Student("Fedotow", 10, 3);
		students[2] = new Student("Babyyy", 10, 4);
		students[3] = new Student("Rosell", 10, 1);
		students[4] = new Student("Bellz", 10, 2);

		printStudents(students);
		insertionSort(students);
		System.out.println("\n\n\n");
		printStudents(students);
	}

	public static void insertionSort(Student[] students) {
		for (int i = 1; i < students.length; i++) {

			int j = i - 1;

			Student key = students[i];

			while ((Student.equality(students[i]) >= Student.equality(students[j])) && (j >= 0)) {
				students[j + 1] = students[j];
				j--;
			}
			students[j + 1] = key;
		}

	}

	public static void printStudents(Student[] students) {
		for (int k = 0; k < students.length; k++) {
			System.out.println(students[k].surname + "  " + students[k].allLessons + "  " + students[k].missedLessons);
		}
	}
}
