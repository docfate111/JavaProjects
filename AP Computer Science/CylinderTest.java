import java.util.Scanner;
public class CylinderTest extends Cylinder{
	public CylinderTest(double radius, double height) {
		super(radius, height);
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius: ");
		double r=sc.nextDouble();
		System.out.println("Enter the height: ");
		double h=sc.nextDouble();
		Cylinder cyl=new Cylinder(r, h);
		System.out.println("The volume is: "+cyl.getVolume());
		System.out.println("The surface area is: "+cyl.getSurfaceArea());
	}

}
