
public class Box {
	//private fields
	double width;
	double length;
	double height;
	//constructors
	public Box(double a) {
		width=a;
		length=a;
		height=a;
		//one parameter
	}
	public Box(double l, double w, double h) {
		length=l;
		width=w;
		height=h;
	}
	double getVolume() {
		return (width*length)*height;
	}
	double getSurfaceArea() {
		return 2.0*length*width+2.0*height*width+2.0*length*height;
	}
}
