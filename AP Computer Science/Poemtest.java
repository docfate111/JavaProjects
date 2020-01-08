package src; 
public class Poemtest {
	public static void main(String[] args) {
	System.out.println("Haiku syllables: ");
	int input1[]= {5, 7, 5};
	Haiku haiku=new Haiku(3, input1);
	haiku.printRhythm();
	System.out.println("\nLimerick syllables: ");
	int input2[]={9, 9, 6, 6, 9};
	Limerick limerick=new Limerick(5, input2);
	limerick.printRhythm();
	}
}
