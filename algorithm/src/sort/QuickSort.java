package sort;

public class QuickSort<T extends Comparable<? super T>> {
	public static<T extends Comparable<? super T>> void quicksort(T[] a) {
	quicksort(a,0,a.length-1);
	}
	
	public static<T extends Comparable<? super T>> T media3(T[] a,int left,int right) {
		int center=(left+right)/2;
		if(a[center].compareTo(a[left])<0)
			swapReferences(a, center, left);
		if(a[right].compareTo(a[left])<0)
			swapReferences(a, left, right);
		if(a[right].compareTo(a[center])<0)
			swapReferences(a, center, right);
		swapReferences(a, center, right-1);
		return a[right-1];
	}
	public static<T extends Comparable<? super T>> void quicksort(T[] a,int left,int right) {
		T pivot=media3(a,left,right);
		int i=left;int j= right-1;
		for(;;) {
			while(a[++i].compareTo(pivot)<0) {}
			while(a[--j].compareTo(pivot)<0) {}
			if(i<j)
				swapReferences(a, i, j);
			else break;
		}
		swapReferences(a, i, right-1);
		quicksort(a, left, i-1);
		quicksort(a,i+1,right);
	}
	public static<T extends Comparable<? super T>> void swapReferences(T[] a,int left,int right) {
		T tmp=a[left];
		a[left]=a[right];
		a[right]=tmp;
	}

}
