package sort;

public class CountingRadixSort {
	public static void countingRadixSort(String[] arry,int stringLen) {
		final int BUCKETS=256;
		int N=arry.length;
		String[] out=new String[N];
		String[] in=arry;
		for(int pos=stringLen-1;pos>=0;pos--) {
			int[] count=new int[BUCKETS+1];
			for(int i=0;i<N;i++) 
				count[in[i].charAt(pos)+1]++;
			for(int i=1;i<=BUCKETS;i++)
				count[i]+=count[i-1];
			for(int i=0;i<N;i++)
				out[count[in[i].charAt(pos)]++]=in[i];
			String[] tmp=in;
			in=out;
			out=tmp;
		}
	}

}
