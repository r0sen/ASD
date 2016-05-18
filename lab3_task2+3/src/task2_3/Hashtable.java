package task2_3;



public class Hashtable {
	private Entry [] table;
	private int size = 0;
	private final int defaultSize = 19;
	private int m = defaultSize;
	private Entry bufItem;
	
	public Hashtable(){
		this.table = new Entry[this.defaultSize];
	}
	
	public Hashtable(int userSize){
		this.table = new Entry [userSize];
		this.m = userSize;
	}
	
	public boolean isEmpty(){
		if (this.size != 0){
			return false;
		}
		return true;
	}
	
	public int size(){
		return size;
	}
	
	public boolean contains(int key){
		int i;
		for(i=0; i<m; i++){
			if(table[i]!= null && table[i].getKey()==key){
				return true;
			}
		}
		return false;
	}
	
	public Trapeze get(int key){;
		int i;
		for (i=0; i<m; i++){
			if (table[i]!= null && table[i].getKey()==key){
				return table[i].getValue();
			}
		}
		return null;
	}
	
	private int hash1(int key){
		return (int) (key % this.m);
	}

  public int hash2(int key) {
    return (int) (7 - key % 7);
  }

  	public boolean put(Trapeze value){
		int key = value.calculateArea();
		 return put(key, value);
		 
	}
	public boolean put(int key, Trapeze value)  {
    int hashKey = hash1(key); // hash the key
    int stepSize = hash2(key); // get step size
    // until empty cell or -1
    while (table[hashKey] != null && table[hashKey].getKey() != -1) {
    	hashKey += stepSize; // add the step
    	hashKey %= this.m; // for wraparound
    }
    table[hashKey] = new Entry(value); // insert item
    if(table[hashKey] != null)
    	return false;
    else return true;
  }

  public Trapeze remove(int key) {
    int hashKey = hash1(key); 
    int stepSize = hash2(key); // get step size

    while (table[hashKey] != null) {
      if (table[hashKey].getKey() == key) {
        Entry temp = table[hashKey]; // save item
        table[hashKey] = bufItem; // delete item
        return temp.getValue(); // return item
      }
      hashKey += stepSize; // add the step
      hashKey %= this.m; // for wraparound
    }
    return null; // can't find item
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
