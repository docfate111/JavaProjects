public class CarTest {
	public static void main(String[] args) {
		Car car1=new Car(5000.0, 5500.0, 25.0);
		Car car2=new Car(5000.0, 5500.0, 20.0);
		System.out.println(car1.calculateMPG());
		System.out.println(car2.calculateMPG());
	}

}
