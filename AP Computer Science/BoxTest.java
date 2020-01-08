public class BoxTest {
	public static void main(String[] args) {
	Box prism=new Box(2.5, 3.0, 5.0);
	System.out.println("The box's surface area is: "+prism.getSurfaceArea());
	System.out.println("The box's volume is: "+prism.getVolume());
	Box cube=new Box(3.5);
	System.out.println("The box's surface area is: "+cube.getSurfaceArea());
	System.out.println("The box's volume is: "+cube.getVolume());
	Box test=new Box(3.5, 4.5, 5.5);
	System.out.println("The box's area is: "+test.getSurfaceArea());
	System.out.println("The box's volume is: "+test.getVolume());
	}

}
