import java.util.Scanner;
public class Circle {
		private double radius;
		public Circle(double r){
			radius=r;
		}
		public double getArea(){
			return Math.PI*Math.pow(radius, 2.0);
		}
		public double getCircumference() {
			return Math.PI*2.0*radius;
		}
		public static void main(String args[]){
	}
		
}