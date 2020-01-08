package src;

public class SubstringChecker implements Checker{
	String input;
	SubstringChecker(String i){
		input=i;
	}
	public boolean accept(String text){
		return text.contains(input);
	}
}
