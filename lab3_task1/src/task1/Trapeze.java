package task1;

public class Trapeze {
	
	int xcoord0;
	int ycoord0;
	int xcoord1;
	int xcoord2;
	int ycoord2;
	int xcoord3;


	public Trapeze(int xcoord0, int ycoord0, int xcoord1, int xcoord2, int ycoord2, int xcoord3){
		this.xcoord0 = xcoord0;
		this.ycoord0 = ycoord0;
		this.xcoord1 = xcoord1;
		this.xcoord2 = xcoord2;
		this.xcoord3 = xcoord3;
		this.ycoord2 = ycoord2;

	}
	
	public int calculateArea(){
		return Math.abs((ycoord2-ycoord0) * (Math.abs(xcoord1-xcoord0)+ Math.abs(xcoord2 - xcoord3))/2);
	}
	
	public int calculatePerimeter(){
		return (Math.abs(xcoord2 - xcoord3) + Math.abs(xcoord1 - xcoord0) +((xcoord1 - xcoord2)^2 +(ycoord2 - ycoord0)^2)^(1/2) + ((xcoord3)^2 +(ycoord2 - ycoord0)^2)^(1/2));
	}
	
	public void view(){
		System.out.println("   Upper left vertex: X" + xcoord0 + " Y"+ ycoord0 + ";\n"
				+ "   Upper right vertex: X" + xcoord1 + " Y" + ycoord0 + ";\n"
						+ "   Lower left vertex: X" + xcoord3 + " Y" + ycoord2 + ";\n"
								+ "   Lower right vertex: X" + xcoord2 + " Y" + ycoord2 + ";\n");
	}
}