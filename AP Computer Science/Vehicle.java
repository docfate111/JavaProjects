package src;

public class Vehicle extends TaxableItem{
	public double dealerCost;
	public double dealerMarkup;
	public double taxRate;
	public double getListPrice(){
		return dealerCost+dealerMarkup;
	}
public Vehicle(double c,double m, double t) {
	super(t);
	taxRate=t;
	dealerCost=c;
	dealerMarkup=m;
}
public double purchasePrice() {
	return super.purchasePrice();
}
public void changeMarkup(double m) {
	dealerMarkup=m;
}
}

