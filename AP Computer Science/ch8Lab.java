
public class ch8Lab {
	public static void main(String[] args) {
		kevin();
		cents(40);
		print1();
		print2();
		print3();
		multiplicationTable();
		print4();
	}
	public static double kevin() {
		double knowledge=.10, months=0;
		while(knowledge<=.95) {
		knowledge*=.1;
		months+=1;
		}
		return months;
	}
	public static void cents(double amount) {
		double pennies=.01, nickels=.05, dimes=.1, quarters=.25;
		int counter=1;
		for(int i=0; i<100; i++) {
			for(int j=0; j<20; j++) {
	for(int k=0; k<10; k++) {
		for(int l=0; l<4; l++) {
			if(i*pennies+j*nickels+k*dimes+l*quarters==amount) {
				System.out.println("Possibility: #"+counter);
				counter++;
				System.out.println("The number of pennies: "+i);
				System.out.println("The number of nickels: "+j);
				System.out.println("The number of dimes: "+k);
				System.out.println("The number of quarters: "+l);
			}
		}
	}
			}
		}
	}
	public static void print1() {
		for(int i=1; i<7; i++) {
			for(int j=0; j<i; j++) {
			System.out.print(i);
		}
			for(int k=0; k<6-i; k++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}
	public static void print2() {
		System.out.print("+");
		for(int i=0; i<=7; i++) {
			System.out.print("/\\");
		}
		System.out.print("+");
		System.out.println();
		for(int j=0; j<=5; j++) {
			System.out.println("|              |");
		}
		System.out.print("+");
		for(int i=0; i<=7; i++) {
			System.out.print("/\\");
		}
		System.out.print("+");
	}
	public static void print3() {
		for(int i=1; i<7; i++) {
			for(int j=0; j<i; j++) {
			System.out.print(i);
		}
			for(int k=0; k<6-i; k++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		for(int i=5; i>0; i--) {
			for(int j=i; j>0; j--) {
				System.out.print(i);
			}
			System.out.println();
		}
}
	public static void multiplicationTable() {
		for(int i=1; i<10; i++) {
			System.out.print(i+": ");
			for(int j=1; j<10; j++) {
			System.out.print(i*j+" ");
			}
			System.out.println();
			
		}
	}
	public static void print4() {
		for(int i=1; i<=17; i++) {
			for(int j=9-i; j>=0 ; j--) {
				System.out.print(" ");
			}
			for(int k=i; k>1; k--) {
			System.out.print(k);
			}
			System.out.print("1");
			for(int l=2; l<1; l++) {
				System.out.print(l);
				}
			for(int m=9-i; m>=0; m--) {
				System.out.print(" ");
			}
			System.out.println();
		}}
	}
