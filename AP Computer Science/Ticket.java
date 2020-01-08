package src;
public abstract class Ticket {
private int serialNumber;
public Ticket() {
	serialNumber=getNextSerialNumber();
}
public abstract double getPrice();
public String toString() {
	return "Number: "+serialNumber+"\nPrice: "+getPrice();
}
private int getNextSerialNumber() {
	int serialNum=(int)(10000*Math.random())+1;
	return serialNum;
}
}
