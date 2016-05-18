package task2_3;



public class Main {

	public static void main(String[] args) {
		System.out.printf("\nTests 2-3:\n");
		Trapeze myrec1 = new Trapeze(0, 0, 10, 10,10,0);
		Trapeze myrec2 = new Trapeze(0, 0, 10, 40,5,4);
		Trapeze myrec3 = new Trapeze(0, 0, 10, 30,5,4);
		Trapeze myrec4 = new Trapeze(0, 0, 5, 35,5,4);

		
		//Hashtable hsop = new Hashtable(41);
		Hashtable hsop = new Hashtable();
		hsop.put(myrec1);
		hsop.put(myrec2);
		hsop.put(90, myrec3);
		//hsop.put(90000, myrec3);
		hsop.put(myrec4); // it will replace myrec1
		hsop.output();
		
		int mykey1 = myrec1.calculateArea();
		int mykey2 = 45;
		
		if(hsop.contains(mykey1)){
			System.out.printf("\n  > "+mykey1+" key contains!\n");
		}
		if(hsop.contains(mykey2)){
			System.out.printf("  > "+mykey2+" key contains!\n");
		}
		
		if(hsop.get(mykey1).calculateArea()==mykey1){
			System.out.printf("  > "+mykey1+" key return to main!\n\n");
		}
		if(hsop.get(mykey1).calculateArea()==mykey2){
			System.out.printf("  > "+mykey2+" key return to main!\n\n");
		}
		
		hsop.remove(mykey1);
		hsop.output();
	}
	
}