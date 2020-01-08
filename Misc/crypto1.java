package crypto;

public class crypto1 {

public static void main(String[] args) {
		//System.out.println(shiftDecrypt(shiftEncrypt("secretmessage", 25),25));
		//System.out.println(vigenereDecrypt(vigenereEncrypt("secretmessage", "word"), "word"));
		//System.out.println(bruteforceshiftDecrypt(shiftEncrypt("secretmessage", 20)));
	//System.out.println(nullCipher("HelloMaryJaneAreYouAlright"));
	}
public static String shiftEncrypt(String input, int key) {
		String alphabet= "abcdefghijklmnopqrstuvwxyz";
		String newAlphabet= alphabet.substring(26-key, 26)+alphabet.substring(0, 25-key);
		char[] ch=new char[input.length()];
		for(int i=0; i<=input.length()-1; i++){
			for(int j=0; j<=alphabet.length()-1; j++) { 
			if(input.charAt(i)==alphabet.charAt(j)) {
				ch[i]=newAlphabet.charAt(j);
			}
			}
		}
		String str=String.valueOf(ch);
		return str;
	}
public static String shiftDecrypt(String input, int key){
	String newAlphabet="abcdefghijklmnopqrstuvwxyz";
	String alphabet=newAlphabet.substring(26-key, 26)+newAlphabet.substring(0, 25-key);
	char[] ch=new char[input.length()];
	for(int i=0; i<=input.length()-1; i++){
		for(int j=0; j<=alphabet.length()-1; j++) { 
		if(input.charAt(i)==alphabet.charAt(j)) {
			ch[i]=newAlphabet.charAt(j);
		}
		}
	}
	String str=String.valueOf(ch);
	return str;
		}
public static String vigenereEncrypt(String input, String key) {
	String alphabet="abcdefghijklmnopqrstuvwxyz";
	String newKey=key;
	String str="";
	char[] ch=new char[input.length()];
	for(int i=0; i<(input.length()/key.length())-1; i++) {
		newKey=newKey+key;
	}
	newKey=newKey+key.substring(0,(input.length()%key.length()));
	for(int k=0; k<input.length(); k++) {
		int i=alphabet.indexOf(input.charAt(k));
		int j=alphabet.indexOf(newKey.charAt(k));
		ch[k]=alphabet.charAt((i+j)%26);
	str+=String.valueOf(ch);
	}
	return str;
}
public static String vigenereDecrypt(String input, String key){
	String alphabet="abcdefghijklmnopqrstuvwxyz";
	String newKey=key;
	char[] ch=new char[input.length()];
	for(int i=0; i<(input.length()/key.length())-1; i++) {
		newKey=newKey+key;
	}
	newKey=newKey+key.substring(0,(input.length()%key.length()));
	for(int k=0; k<input.length(); k++) {
		int i=alphabet.indexOf(input.charAt(k));
		int j=alphabet.indexOf(newKey.charAt(k));
		if(i-j==0) {
			ch[k]=alphabet.charAt(alphabet.indexOf("a"));
		}
		else {
		if(i-j<=1) {
		ch[k]=alphabet.charAt((i-j+25)%25+1);
		}
		else {
		ch[k]=alphabet.charAt(i-j);
		}
	}
	}
	String str=String.valueOf(ch);
	return str;
}
public static String bruteforceshiftDecrypt(String input) {
	StringBuilder sb=new StringBuilder("");
	String b;
	for(int i=1; i<=25; i++) {
		b=shiftDecrypt(input, i);
		sb.append(b);
		}
	return sb.toString();
}
public static String nullCipher(String input, int trickyPattern) {
	StringBuilder sb= new StringBuilder("");
	String capsAlphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	/*if the input is a sentence each word needs to start with a capital letter*/
	char[] ch=new char[input.length()];
	for(int i=0; i<=input.length()-1; i++){
		for(int j=0; j<=input.length()-1; j++) {
			//for(int k=0; k<=trickyPattern; k++) {
			//	int wordlength=input.indexOf(ch[i])-input.indexOf(ch[t]));
		if(input.charAt(i)==capsAlphabet.charAt(j)) {
		ch[i]=capsAlphabet.charAt(j);
		}
	}
	}
	sb.append(String.valueOf(ch));
	return sb.toString();
}
}
