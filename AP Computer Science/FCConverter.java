
public class FCConverter {

	public static void main(String[] args) {
		FCConverter fc=new FCConverter();
		fc.setCelsius(20.0);
		
		System.out.print("The temperature in F is: "+fc.toC());
	}
	public static double temp;
	public static String degrees;
	public FCConverter() {
		temp=98.6;
	}
	public FCConverter(double temperature) {
		temp=temperature;
	}
	public void setCelsius(double temperature) {
		temp=temperature;
		degrees="Celsius";
	}
	public double toF(){
		return (temp*9.0/5.0)+32.0;
	}
	public double toC() {
		return (5.0/9.0)*(temp-32.0);
	}

}
