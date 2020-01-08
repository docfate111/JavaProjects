package src;
public class Sound {
	public static void main(String[] args) {
		int[] soundSample= {40, 2532, 17, -2300, -17, -4000, 2000, 1048, -420, 33, 15, -32, 2030, 3223};
		int l=2000;
		Sound s=new Sound(soundSample);
		int c=s.limitAmplitude(l);
		s.getSamples();
		int[] newSoundSample= {0, 0, 0, 0, 0, 40, 2532, 17, -2300, -17, -4000, 2000, 1048, -420, 33, 15, -32, 2030, 3223, 0, 0, 0};
		Sound ns=new Sound(newSoundSample);
		ns.trimSilenceFromBeginning();
	}
	private int[] samples;
	public Sound(int[] a) {
		samples=new int[a.length];
		samples=a;
	}
	public void getSamples() {
		for(int i=0; i<samples.length-1; i++) {
			System.out.print(samples[i]+", ");
		}
		System.out.println(samples[samples.length-1]);
	}
	public int limitAmplitude(int limit) {
		int chgs=0;
		for(int i=0; i<samples.length; i++) {
		if(Math.abs(samples[i])>limit) {
			samples[i]=samples[i]<0?-limit:limit;
			chgs++;
		}
		}
		return chgs;
	}
	public void trimSilenceFromBeginning() {
		int count=0, index=0, i=0;
		while(samples[i++]==0) {
			count++;
		}
		i=0;
		int[] temp=new int[samples.length-count];
		for(int j=0; j<samples.length; j++) {
			if(samples[j]!=0) {
				temp[i++]=samples[j];
			}
		}
		Sound ans=new Sound(temp);
		ans.getSamples();
	}
}
