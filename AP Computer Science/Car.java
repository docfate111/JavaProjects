public class Car {
	double startMiles; //stating odometer reading
	double endMiles; //ending odometer reading
	double gallons; //gallons of gas used between the readings
	public Car(double startOdo, double endingOdo, double gallons2) {
		startMiles=startOdo;
		endMiles=endingOdo;
		gallons=gallons2;
	}
	public double calculateMPG(){
		return (endMiles-startMiles)/gallons;
	}

}
