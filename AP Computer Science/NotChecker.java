package src;

public class NotChecker implements Checker{
	Checker a;
	NotChecker(Checker s){
		a=s;
	}
	public boolean accept(String text){
		return !a.accept(text);
	}
}