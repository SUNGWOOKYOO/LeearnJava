package swyoo;

import swyoo.Sort;
import java.util.*;

public class hw {
	public static void showexternalarray(int []a, int N){
		for(int i=0; i<N; i++){
			System.out.print(a[i]+ "  ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int a[] = {10,52,5,209,19,44};
		int n = a.length;
		
		System.out.println("Selection sort: ");
		Sort Ss = new Sort(a, n);
		Ss.showarray();
		Ss.selection_sort();
		Ss.showarray();
		showexternalarray(a,n);
		
		System.out.println("Insertion sort: ");
		Sort Is = new Sort(a, n);
		Is.showarray();
		Is.insertion_sort();
		Is.showarray();
		showexternalarray(a,n);
		
		System.out.println("Merge sort: ");
		Sort Ms = new Sort(a, n);
		Ms.showarray();
		Ms.merge_sort(0, n-1);
		Ms.showarray();
		showexternalarray(a,n);
		
		System.out.println("Qick sort: ");
		Sort Qs = new Sort(a, n);
		Qs.showarray();
		Qs.quick_sort(0, n-1);
		Qs.showarray();
		showexternalarray(a,n);
		
		System.out.println("Randomized Qick sort: ");
		Sort RQs = new Sort(a, n);
		RQs.showarray();
		RQs.randomized_quicksort(0, n-1);
		RQs.showarray();
		showexternalarray(a,n);
		
		System.out.println("Deterministic Qick sort: ");
		Sort DQs = new Sort(a, n);
		DQs.showarray();
		DQs.deterministic_quicksort(0, n-1);
		DQs.showarray();
		showexternalarray(a,n);
		
		System.out.println("Counting sort: ");
		Sort Cs = new Sort(a, n);
		Cs.showarray();
		int B[] = new int[a.length];
		int k = Arrays.stream(a).max().getAsInt();
		showexternalarray(Cs.counting_sort(a, B, k),n);
		showexternalarray(a,n);
		
		System.out.println("Radix sort: ");
		Sort Rs = new Sort(a, n);
		int B2[] = new int[a.length];
		int D=0;
		while(Boolean.TRUE){
			k = k/10;
			D++;
			if(k == 0) break;
		}
	
		Rs.showarray();
		Rs.radix_sort(D);
		Rs.showarray();
		showexternalarray(a,n);
		
	}
	
}
