package src;
public class Haiku extends Poem{
	public int lines;
	public int syllables[];
	public Haiku(int l, int s[]) {
	syllables=s; lines=l;
	}
	@Override
	public int numLines() {
		return lines;
	}
	@Override
	public int getSyllables(int k) { //returns syllables in kth line
		return syllables[k];
	}
	public void printRhythm() {
		for(int a=0; a<lines; a++) {
		for(int i=0; i<syllables[a]; i++) {
		System.out.print("ta-");
		}
		System.out.println();
	}}
}
