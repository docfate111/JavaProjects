import java.lang.Object;
import java.awt.Color; 
public class ch7hw {

	public static void main(String[] args) {
System.out.println("Q1: "+max(5, 23));
System.out.println("Q1: "+max(45, 23));
System.out.println("Q1: "+max(23, 23)+"\n");
System.out.println("Q2: "+totalWages(45, 12.5));
System.out.println("Q2: "+totalWages(35, 12.5)+"\n");
System.out.println("Q3: "+getOrderTotal(1, 0));
System.out.println("Q3: "+getOrderTotal(1, 1));
System.out.println("Q3: "+getOrderTotal(2,2));
System.out.println("Q3: "+getOrderTotal(7, 6)+"\n");
System.out.println("Q4: "+bestMatch(1, 2, 3));
System.out.println("Q4: "+bestMatch(2, 2, 1));
System.out.println("Q4: "+bestMatch(1, 1, 1));
	}
	public static int max(int x, int y) {
		if(x>y) {
			return x;
		}
		else {
			return y;
			}
		}
	public static double totalWages(double hours, double rate) {
		if(hours>40) {
			//overtime
			return 40*rate+(hours-40)*1.5*rate;
		}
		else {
			return rate*hours;
		}
	}
	public static double getOrderTotal(int bp, int nb) {
		if(bp==1&&nb==1) {
			return (double) 37.95;
		}else {
			if(((bp>1)&&(nb>1))&&(nb+bp<3)) {
				return 18.95*bp+nb*21.95;
			}
		if((bp+nb>=3)&&(bp+nb<12)) {
			return (double) 15.95*(bp+nb);
		}else {
				if(nb==0&&bp==1) {
					return 18.95;
				}
				return (double) (bp+nb)*14.00;
		}
	}
	}
	public static String bestMatch(int r, int g, int b) {
		if((r>g)&&(r>b)){
			return "Color.RED";
		}
		if((g>b)&&(g>r)) {
			return "Color.GREEN";}
		if((b>r)&&(b>g)) {
			return "Color.BLUE";
		}
		if((r>b)&&(r==g)){
			return "Color.YELLOW";
		}
		if((r>g)&&(r==b)) {
			return "Color.MAGENTA";
		}
		if((b>r)&&(b==g)){
			return "Color.CYAN";
		}
		if((r==b)&&(b==g)) {
			return "Color.GRAY";
		}
		else {
		return null;}
	}
}
