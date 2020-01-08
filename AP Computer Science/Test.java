package src;

public class Test {

	public static void main(String[] args) {
		Vehicle vehicle=new Vehicle(20000.000, 2500.00, 0.10);
		System.out.println("List price: "+vehicle.getListPrice());
		System.out.println("Purchase price: "+vehicle.purchasePrice());
		double markup=2500.00;
		Vehicle vehicle1=new Vehicle(20000.00, markup, 0.10);
		System.out.println("List price: "+vehicle1.getListPrice());
		System.out.println("Purchase price: "+vehicle1.purchasePrice());
		markup=1000.00;
		Vehicle vehicle2=new Vehicle(20000.00, markup, 0.10);
		System.out.println("List price: "+vehicle2.getListPrice());
		System.out.println("Purchase price: "+vehicle2.purchasePrice());
		
	}

}
