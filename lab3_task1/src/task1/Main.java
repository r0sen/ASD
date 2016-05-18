package task1;

public class Main {

	public static void main(String[] args) {
		System.out.printf("Test 1:\n");
		Trapeze myrec1 = new Trapeze(0, 0, 10, 15,5,4);
		Trapeze myrec2 = new Trapeze(0, 0, 10, 40,5,4);
		Trapeze myrec3 = new Trapeze(0, 0, 10, 30,5,4);
		Trapeze myrec4 = new Trapeze(0, 0, 15, 15,5,4);
		Trapeze myrec5 = new Trapeze(0, 0, 27, 40,5,4);
		Trapeze myrec6 = new Trapeze(0, 0, 45, 30,5,4);
		HashtableOpen hsop = new HashtableOpen(41);
		hsop.put(myrec1);
		hsop.put(myrec2);
		hsop.put(myrec3);
		hsop.put(myrec4);		
		hsop.put(myrec5);
		hsop.put(myrec6);

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