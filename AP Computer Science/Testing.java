package src;
public class Testing {
	public static void main(String[] args) {
		method1();
		method2();
		method3();
	}
	public static void method1() {
		int i=1;
		while(i<=10) {
			System.out.print(i);
			i+=2;
		}
	}
	public static void method2() {
		for(int i=0; i<5; i++) {
			System.out.print(2*i+1);
		}
	}
	public static void method3() {
		for(int i=0; i<10; i++) {
			i++;
			System.out.print(i);
		}
	}

}
