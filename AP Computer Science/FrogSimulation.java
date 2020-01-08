public class FrogSimulation {
private static int goalDistance;
private static int maxHops;
private static int counts=-1;
private static int track=0;
public static void main(String args[]) {
	FrogSimulation example1=new FrogSimulation(24, 5);
	FrogSimulation example2=new FrogSimulation(18, 5);
	FrogSimulation example3=new FrogSimulation(-2, 3);
	FrogSimulation example4=new FrogSimulation(31, 3);
	FrogSimulation example5=new FrogSimulation(25, 4);
	System.out.println(!example1.simulate());
	System.out.println(example2.simulate());
	System.out.println(example3.simulate());
	System.out.println(example4.simulate());
	System.out.println(example5.simulate());
	System.out.println(runSimulation(10)+.6);
	
}
//constructor
public FrogSimulation(int dist, int numHops) {
	goalDistance=dist;
	maxHops=numHops; 
}
//inches moved during frog hops
private static int hopDistance() {
	int x=gotDistance();
	return x;
}
private static int gotDistance() {
	int[] s1= {5, 7, -2, 8, 6};
	int[] s2= {6, 7, 6, 6};
	int[] s3= {6, -6, 31};
	int[] s4= {4, 2, 8};
	int[] s5= {5, 4, 2, 4, 3};
	if(track==0) {
		if(counts<s1.length-1) {counts++; return s1[counts];}
		else {counts=-1;track++;return 0;}
		}
	else if(track==1) {
			if(counts<s2.length-1) {counts++; return s2[counts];}
			else {counts=-1; track++; return 0;}
			}
	else if(track==2) {
				if(counts<s3.length-1) {counts++; return s3[counts];}
				else {counts-=1; track++; return 0;}
			}
	else if(track==3) {
		if(counts<s4.length-1) {counts++; return s4[counts];}
		else {counts-=1; track++; return 0;}
	}
	else if(track==4) {
		if(counts<s5.length-1) {counts++; return s5[counts];}
		else {counts-=1; track++; return 0;}
	}
	return 0;
}
public static boolean simulate(){ 
	   int pos = 0; 
	   for (int count=0; count<=maxHops; count++){
	      pos += hopDistance(); 
	      if (pos >= goalDistance) {return true; }
	      else if (pos < 0) {return false; }
	   }
	   return false; }
public static double runSimulation(int num){
int countYes=0;
for(int count=0; count<num; count++) {
	if(simulate()) {
	countYes++;}
}
return (double) countYes/num;
}
}

