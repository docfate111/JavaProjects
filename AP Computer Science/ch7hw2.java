
public class ch7hw2 {

	public static void main(String[] args) {
		System.out.println(XOR1(true, false));
		System.out.println(XOR1(true, false));
		System.out.println(XOR3(true, false));
		System.out.println(isGeometric(2, 4, 8));
		System.out.println(isLeapYear(2004));
		System.out.println(isLater(3, 2, 2001, 1, 4, 2000));
	}
	public static boolean XOR1(boolean a, boolean b) {
		int x=0;
		int y=0;
		if(a==true) {
			x=+1;
		}
		if(b==true) {
			y+=1;
		}
		if((x^y)==1) {
			return true;
		}
		return false;
	}
	public static boolean XOR2(boolean a, boolean b) {
		if(a==b) {
			return false;
		}
		return true;
	}
	public static boolean XOR3(boolean a, boolean b) {
		if(a!=b) {
			return true;
		}
	return false;
}
	public static boolean isGeometric(int a, int b, int c) {
		if((a!=0)&&(b!=0)&&(c!=0)) {
			if((a/b)==(b/c)) {
				return true;
		}
			return false;}
		return false;
	}
public static boolean isLeapYear(int yr) {
	if(yr%4==0) {
		if((yr%100!=0)||(yr%400==0)){
			return true;
		}
		return false;
	}
	return false;
	}
public static boolean isLater(int month1, int day1, int year1, int month2, int day2, int year2) {
	if(year1>year2) {
		return true;
	}else {
		if(month1>month2) {
			return true;}
		else {
			if(day1>day2) {
				return true;
			}
			return false;
			}
		}
	}
	
}