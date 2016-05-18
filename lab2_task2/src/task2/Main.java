package task2;

public class Main {

	public static void main(String[] args) {
		Student arr[] = new Student[]{
				new Student("Babenko", 1, 10),
				new Student("Petuhov", 6, 13),
				new Student("Saenko", 6, 10),
				new Student("Derdushello", 8, 10),
				new Student("Behvandi", 1, 10),
			
				new Student("Daddy", 7, 10),
				new Student("Fihtengolts", 9, 10),
				new Student("Medvedskyi", 1, 10),
				new Student("Hadynak", 11, 11),
			};
		
		BucketSort cl = new BucketSort(arr);
		System.out.println("Unsorted array is:");
		cl.printArray();
		cl.sorting();
		System.out.println("\nSorted array is:");
		cl.printArray();
	}
}