package src;
public class AndChecker implements Checker{
	Checker a, b;
	AndChecker(Checker s, Checker sc){
		a=s;
		b=sc;
	}
	public boolean accept(String text){
		return a.accept(text)&&b.accept(text);
	}
}
