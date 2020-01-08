package src;
public class CheckTester {
	public static void main(String[] args) {
		Checker broccoliChecker=new SubstringChecker("broccoli");
		System.out.println("1 "+broccoliChecker.accept("broccoli"));
		System.out.println("2 "+broccoliChecker.accept("I like broccoli"));
		System.out.println("3 "+broccoliChecker.accept("carrots are great"));
		System.out.println("4 "+broccoliChecker.accept("Broccoli Bonanza"));
		Checker bcker=new SubstringChecker("beets");
		Checker ccker=new SubstringChecker("carrots");
		Checker bothcker=new AndChecker(bcker, ccker);
		Checker acker=new SubstringChecker("artichokes");
		Checker veggies=new AndChecker(bothcker, acker);
		System.out.println("5 "+bothcker.accept("I love beets and carrots"));
		System.out.println("6 "+bothcker.accept("beets are great"));
		System.out.println("7 "+veggies.accept("artichokes, beets, and carrots"));
		Checker kcher=new SubstringChecker("kale");
		Checker yummycker=new AndChecker(new NotChecker(acker), new NotChecker(kcher));
		System.out.println("8 "+yummycker.accept("chocolate fruffles"));
		System.out.println("9 "+yummycker.accept("kale is great"));
		System.out.println("10 "+yummycker.accept("Yuck: artichokes & kale"));
	}
}
