package src;
public class Advance extends Ticket{
private int days;
public Advance(int d) {
	days=d;
}
public double getPrice() {
	if(days>=10) {
		return 30.0;
	}
	return 40.0;
}
}
