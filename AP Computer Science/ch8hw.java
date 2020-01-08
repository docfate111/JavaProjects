
public class ch8hw {

	public static void main(String[] args) {
		System.out.println(yearpop(2010, 1.13));
		System.out.println(isPerfectSquare(121.0));
		System.out.println(isPerfectSquare(34.0));
		System.out.println(sumDigits(43));
	}
	public static int yearpop(double yr, double growthrate) {
		double pop=111.2;
		while(pop<120) {
			pop*=1+growthrate/100;
			yr+=1;
		}
		return (int) yr;
	}
	public static boolean isPerfectSquare(double n) {
	double sum=0;
	double m=Math.sqrt(n);
	int i=1;
	while(i<2*m-1) {
		sum+=i;
		i+=2;
	}
	return sum+2*m-1==n;
	}
	public static int sumDigits(int n) {
		int d=0; int sum=0;
		while(n<0) {
			d=n%10;
			sum+=d;
			n/=10;
		}
		return sum;
	}
}

