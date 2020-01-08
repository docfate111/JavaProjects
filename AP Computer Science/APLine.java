
public class APLine {
	private double a;
	private double b;
	private double c;
public APLine(double one, double two, double three) {
	a=one;
	b=two;
	c=three;
}
public double getSlope() {
	return -a/b;
}
public boolean isOnLine(double one, double two) {
	if((one*a+two*b+c)==0) {
		return true;
	}
		return false;
}
	public static void main(String[] args) {
		APLine line1=new APLine(5, 4, -17);
		double slope1=line1.getSlope();
		boolean onLine1=line1.isOnLine(5, -2);
		APLine line2=new APLine(-25, 40, 30);
		double slope2=line2.getSlope();
		boolean OnLine2=line2.isOnLine(5, -2);
		System.out.println(slope1);
		System.out.println(onLine1);
		System.out.println(slope2);
		System.out.println(OnLine2);
	}

}
