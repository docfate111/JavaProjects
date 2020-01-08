package src;
public class Ch10HW1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	//Write a method that returns true if a given string is not empty and ends with a star and false otherwise:
public boolean a(String str) {
		if((str!="")&&(str.charAt(str.length()-1)=='*')) {return true;}
		return false;
}
//write a method that returns true given a string has at least 2 characters and ends with two stars:
public boolean b(String str) {
	if((str.length()>=2)&&(str.substring(str.length()-2)=="**")){return true;}
	return false;
}
//Write a method that eliminates two dashes from a social security number in the format "ddd-dd-dddd" and returns a 9-character
//string of digits
public String removedashes(String str) {
	String ans="";
	for(int i=0; i<str.length(); i++) {
		if((str.charAt(i)=='0')||(str.charAt(i)=='1')||(str.charAt(i)=='2')||(str.charAt(i)=='3')||(str.charAt(i)=='4')||(str.charAt(i)=='5')||(str.charAt(i)=='6')||(str.charAt(i)=='7')||(str.charAt(i)=='8')||(str.charAt(i)=='9')) {
			ans+=str.charAt(i);
		}
	}
	return ans;
}
//A string dateStr represents a date in the format "mm/dd/yyyy" Write a method that changes dateStr to "dd-mm-yyyy"
public String dateChange(String dateStr) {
	return dateStr.substring(3, 5)+'-'+dateStr.substring(0, 2)+'-'+dateStr.substring(6);
}
//make the method more general so that it can handle dates written with or without leading zeros
public String dateChange2(String str) {
	if(str.length()==8) {
		return '0'+str.charAt(2)+"-0"+str.charAt(0)+'-'+str.substring(4);
	}
	return str.substring(3, 5)+'-'+str.substring(0, 2)+'-'+str.substring(6);
}
//method that returns last 4
public String last4(String str) {
	return str.substring(str.length()-4);
}
public String last5(String str) {
	return str.substring(str.length()-5);
}
public String scroll(String str) {
	return str.substring(1)+str.charAt(0);
}
}

