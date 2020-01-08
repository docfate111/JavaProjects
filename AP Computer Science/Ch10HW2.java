package src;
public class Ch10HW2 {
	public static String removeTag(String a) {
		if(a.charAt(0)=='<') {
			if(a.charAt(a.length()-4)=='<') {
				return a.substring(3, a.length()-4);
			}else {return a.substring(3);}
		}
		return a;}
	public static boolean isPalindrome(String word) {
		word=word.toLowerCase();
		int counter=0;
		for(int i=0; i<=(word.length()-1)/2; i++) {
			if(word.charAt(i)==word.charAt(word.length()-1-i)) {
				counter++;
			}
		}
		if(counter==(word.length()+1)/2) {
			return true;
		}return false;}
	public static boolean upgradedPalindrome(String word) {
		word=word.toLowerCase();
		String ans="";
		String alphabet="abcdefghijklmnopqrstuvwxyz";
		for(int i=0; i<word.length(); i++) {
		if(alphabet.indexOf(word.charAt(i))==-1) {
			continue;
		}else {
			ans+=word.charAt(i);
		}}
		return isPalindrome(ans);
	}
	public static void main(String[] args) {
		System.out.println(removeTag("<b>Strings are immutable</b>"));
		System.out.println("\nmadam is Palindrome: "+isPalindrome("madam"));
		System.out.println("string is Palindrome: "+isPalindrome("string"));
		System.out.println("Level is palindrome: "+upgradedPalindrome("Level"));
		System.out.println("\nMadam I'm Adam: "+upgradedPalindrome("Madam, I'm Adam"));
		System.out.println("Strings are immutable:"+isPalindrome("Strings are immutable"));
		System.out.println("Mr. Owl ate my metal worm: "+upgradedPalindrome("Mr. owl ate my metal worm"));
	}

}
