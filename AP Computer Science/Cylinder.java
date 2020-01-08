
public class Cylinder {
	double r;
	double h;
	public Cylinder(double radius, double height) {
		r=radius;
		h=height;
	}
	public double getVolume(){
		return Math.PI*Math.pow(r, 2.0)*h;
	}
	public double getSurfaceArea() {
		return 2.0*Math.PI*Math.pow(r, 2)+2.0*Math.PI*r*h;
	}
}
