package src;

public class DiplomaWithHonors extends Diploma{
	public String name, major;
	DiplomaWithHonors(String n, String m) {
		super(n, m);
		name=n; major=m;
	}
	public static void main(String[] args) {
		Diploma diploma1=new Diploma("Murray Smith", "Gardening");
		System.out.println(diploma1);
		System.out.println();
		Diploma diploma2=new DiplomaWithHonors("Lisa Smith", "Evolutionary Psychology");
		System.out.println(diploma2);
		System.out.println();
	}
	public String toString() {
		return "This certifies that "+name+"\nhas completed a course in "+major+"\n"+"*** with honors ***";
	}
}
