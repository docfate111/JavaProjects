package src;

public class Diploma {
	public String name, major;
	Diploma(String n, String m) {
		name=n;
		major=m;
	}
	public String toString() {
		return "This certifies that "+name+"\nhas completed a course in "+major;
	}

}
