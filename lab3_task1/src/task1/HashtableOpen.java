package task1;

public class HashtableOpen {
	private Entry[] table;
	private int size = 0;
	private final int defaultSize = 19;
	// private final double A = Math.sqrt(5) - 2;
	private int m = defaultSize;

	public HashtableOpen() {
		this.table = new Entry[this.defaultSize];

		int i;
		for (i = 0; i < defaultSize; i++) {
			table[i] = new Entry();
		}
	}

	public HashtableOpen(int userSize) {
		this.table = new Entry[userSize];
		this.m = userSize;
		int i;
		for (i = 0; i < userSize; i++) {
			table[i] = new Entry();
		}
	}

	public boolean isEmpty() {
		return (this.size == 0);
	}

	public int size() {
		return size;
	}

	public boolean contains(int key) {
		int i;
		int hashKey = hash(key);
		if (table[hashKey].getKey() == key)
			return true;

		return false;
	}

	public Trapeze get(int key) {
		int i;
		int hashKey = hash(key);

		if (table[hashKey].getKey() == key) {
			return table[hashKey].getValue();

		}
		return null;
	}

	private int hash(int key) {
		return (int) (key % this.m);
	}

	public Trapeze put(Trapeze value) {
		int key = value.calculateArea();
		return put(key, value);
	}

	public Trapeze put(int key, Trapeze value) {
		if (value.calculateArea() != key) {
			System.err.println(key + " - bad key of rectangle!\n");
			System.exit(1);
		}
		int hashKey = hash(key);

		if (table[hashKey].getValue() != null) {

			Trapeze toReturn = table[hashKey].getValue();

			return toReturn;
		} else {

			table[hashKey] = new Entry(value);
			this.size++;
			return null;
		}

	}

	public Trapeze remove(int key) {
		int i;
		int hashKey = hash(key);

		if (table[hashKey] != null) {
			Trapeze toDelete = new Trapeze(0, 0, 0, 0, 0, 0);
			toDelete = table[hashKey].getValue();
			table[hashKey].setKey(-1);
			this.size--;
			return toDelete;
		}

		return null;
	}

	public void output(){
		//System.out.println("Size of non-void elements is "+this.size);
		int i, j=1;
		for(i=0; i<this.m; i++){
			if (table[i] != null){
				System.out.println(j+". Area: "+table[i].getValue().calculateArea() + "; HashKey: "+i+";");
				table[i].getValue().view();
				j++;
			}
			else 				
				{
				System.out.println(j+". Area: ^^^^^^^^^^^^^^^^^^^^^^");
				j++;
				}

		}
	}
}
