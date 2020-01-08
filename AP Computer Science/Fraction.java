public class Fraction {
	public static void main(String[] args) {
	Fraction f1=new Fraction();
	Fraction f2=new Fraction(7);
	Fraction f3=new Fraction(12, 20);
	Fraction f4=new Fraction(reduce(f3));
	Fraction f5=f3;
	System.out.println("f1="+f1);
	System.out.println("f2="+reduce(f2));
	System.out.println("f3="+reduce(f3));
	System.out.println("f4="+f4);
	System.out.println("f5="+f5);
	System.out.println(f1.add(f2));
	}
	private int num, denom;
	public String toString() {
		return num+"/"+denom;
	}
	public Fraction() {
		//default no args
		num=0;
		denom=1;
	}
	public Fraction(int n) {
		num=n;
		denom=1;
		n=8;
	}
	public Fraction(int n, int d) {
		if(d!=0) {
		num=n;
		denom=d;
		//Fraction f=new Fraction(num, denom);
		//reduce();
		}else {
			throw new IllegalArgumentException("Divsion by zero");
		}
	}
	public Fraction(Fraction other) {
		//other.num=4;
		//other.denom=7;
		num=other.num;
		num=other.denom;
		//other.num=4;
		//other.denom=7;
	}
	public Fraction add(Fraction other) {
		int newNum=num*other.denom+denom*other.num;
		int newDenom=denom*other.denom;
		Fraction f= new Fraction(newNum, newDenom);
		return reduce(f);
	}
	public Fraction subtract(Fraction other) {
		int newNum=num*other.denom-denom*other.num;
		int newDenom=denom*other.denom;
		Fraction f= new Fraction(newNum, newDenom);
		return reduce(f);
	}
	public Fraction multiply(Fraction other) {
	int newNum=num*other.num;
	int newDenom=denom*other.denom;
	Fraction f= new Fraction(newNum, newDenom);
	return reduce(f);}
	public Fraction divide(Fraction other) {
		int newNum=num*other.denom;
		int newDenom=denom*other.num;
		Fraction f= new Fraction(newNum, newDenom);
		return reduce(f);
	}
	public static int gcf(int n, int d) {
		if(n<=0||d<=0) {
			throw new IllegalArgumentException("gcf preconditon failed: "+n+","+d);
		}
		if(n%d==0) {
			return d;
		}
		else if(d%n==0) {
			return n;}
		else {
			return gcf(n%d, d%n);
		}
	}
	public static Fraction reduce(Fraction other) {
		int newDenom=other.denom;
		int newNum=other.num;
		if(other.denom<0) {
			newNum*=-1;
			newDenom*=-1;
		}
		int common=gcf(newNum, newDenom);
		return new Fraction(newNum/common, newDenom/common);
	}
public static double toDecimal(Fraction other) {
	return (double) other.num/((double) other.denom);
}
}
