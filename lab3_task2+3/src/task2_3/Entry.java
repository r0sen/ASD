package task2_3;

public class Entry {
	private int key;
	private Trapeze value;

	public Entry(Trapeze rec){
		this.key = rec.calculateArea();
		this.value = rec;
	}
	
	public Entry(){
		this.key = -1; // defunct value of area
		this.value = null;
	}
	
	public int getKey(){
		return key;
	}
	
	public Trapeze getValue(){
		return value;
	}
	
	public void setValue(Trapeze rec){
		this.value = rec;
	}
	
	public void setKey(int k){
		this.key = k;
	}
}