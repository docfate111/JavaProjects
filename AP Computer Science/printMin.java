package src;
public class printMin {
	public static void main(String[] args) {
		int n=10;
		int arr[];
		arr=new int[n];
		arr[0]=2; arr[1]=4; arr[2]=-5; arr[3]=1; arr[4]=8;
		for(int i=0; i<5; i++) {
			System.out.println(arr[i]);
		}
		System.out.println(findMin(arr));
		System.out.println(computeScore("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
		System.out.println(computeScore("AP Computer Science"));
	}
	public static int findMin(int a[]) {
		int min=10;
		for(int i=0; i<5; i++) {
			if(min>a[i]) {
				min=a[i];
			}
		}
		return min;
	}
	public static int computeScore(String input) {
		input=input.toUpperCase();
		int count=0;
		String[]letters= {"AEILNRSTU", "DG", "BCMOP", "FHVWY", "K", "!", "!", "JX", "!", "QZ"};
		for(int i=0; i<input.length(); i++) {
			for(int k=0; k<10; k++) {
				for(int j=0; j<letters[k].length(); j++) {
					String temp=letters[k];
			if(temp.charAt(j)==input.charAt(i)) {
				count+=k+1;
			}
		}}}
		return count;
	}

}
