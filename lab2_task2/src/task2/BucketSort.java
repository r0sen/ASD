package task2;

public class BucketSort {
	private Student arr[];

	// int nBuckets = arr.length;
	public BucketSort(Student arr[]) {
		this.arr = arr;
	}

	public void printArray() {
		int i;
		for (i = 0; i < arr.length; i++) {
			if ((double) arr[i].missedLessons / (double) arr[i].allLessons < 0) {
				System.err.println("Index '" + i + "' of array has negative value!");
				System.exit(1);
			}
			if (arr[i].missedLessons > arr[i].allLessons) {
				System.err.println("Index '" + i + "' of array has more missed lessons than all");
				System.exit(1);
			}
		}
		for (i = 0; i < arr.length; i++) {
			System.out.print(" " + (i + 1) + ". " + arr[i].surname + ": Missed lessons: " + arr[i].missedLessons
					+ "; All lessons: " + arr[i].allLessons + " (" + (double) arr[i].missedLessons / arr[i].allLessons
					+ ")\n");
		}
	}

	public void sorting() {
		if (arr.length == 0) {
			return;
		}
		double k = ((double) arr[0].missedLessons / (double) arr[0].allLessons);
		int maxCount = (int) (k * 100);
		int i, j = 0;
		for (i = 0; i < arr.length; i++) {
			k = ((double) arr[i].missedLessons / (double) arr[i].allLessons);
			if ((k) * 100 > (double) maxCount) {
				maxCount = (int) ((k) * 100);
			}
			if ((k) * 100 < 0) {
				System.exit(1);
			}
			if (arr[i].missedLessons > arr[i].allLessons) {
				System.exit(1);
			}
		}
		System.out.println("2 maxCount = " + maxCount);
		int nBuckets = (int) (maxCount * 100 + 1);
		int emp = nBuckets/2 - 1;
		System.out.println(nBuckets);
		MyList buckets[] = new MyList[nBuckets];

		for (i = 0; i < buckets.length; i++) {
			buckets[i] = new MyList();
		}
		for (i = 0; i < this.arr.length; i++) {
			int b = (int) ((double)((double) arr[i].missedLessons / (double) arr[i].allLessons) *emp);
			buckets[b].addLast(arr[i]);
			System.out.println("b = " + b);
		}
		for (i = 0; i < buckets.length; i++) {
			buckets[i].insertionSort();
		}
		for (i = 0; i < buckets.length; i++) {
			while (!buckets[i].isEmpty()) {
				arr[j++] = buckets[i].deleteFirst();
			}
		}
	}
}