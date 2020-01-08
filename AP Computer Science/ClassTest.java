import java.util.Scanner;
public class ClassTest{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("What are the start miles?");
		double s=sc.nextDouble();
		System.out.println("What is the end miles?");
		double e=sc.nextDouble();
		System.out.println("The number of gallons used: ");
		double g=sc.nextDouble();
		Car a=new Car(s, e, g);
		System.out.println("The miles per gallon for the car is: "+a.calculateMPG());
	}
}
