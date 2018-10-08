package swyoo;

import swyoo.Sort;

import java.io.FileReader;
import java.io.IOException;

import swyoo.MaxHeap;

public class hw {
	
	public static int n_sort = 4;
	public static int size1 = 10000;
	public static int size2 = 50000;
	
	public static void showexternalarray(int []a, int N){
		for(int i=0; i<N; i++){
			System.out.print(a[i]+ "  ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		int [][]data = new int[n_sort][];
		for (int i = 0; i < n_sort-2; i++)
			data[i] = new int[size1];
		for (int i = n_sort-2; i < n_sort; i++)
			data[i] = new int[size2];
		

		
		FileReader f = null;
		try {
			f = new FileReader("/home/swyoo/FileRead/HwData/10k_random.txt");
			int c;
			while((c= f.read()) != -1 ) {
			
			}
			f.close();
		}catch (IOException e) {
			System.out.println("I/O error ! ");
		}
		
		int a[] = {10,52,5,209,19,44};
		int n = a.length;
		showexternalarray(a, n);
		
		System.out.println("Selection sort: ");
		Selection Ss = new Selection(a, n);
		Ss.runSort();
		Ss.showarray();
		
		System.out.println("Merge sort: ");
		Merge Ms = new Merge(a, n);
		Ms.runSort();
		Ms.showarray();
		
		System.out.println("Randomized Qick sort: ");
		RQick RQs = new RQick(a, n);
		RQs.runSort();
		RQs.showarray();
		
		System.out.println("Deterministic Qick sort: ");
		DQick DQs = new DQick(a, n);
		DQs.runSort();
		DQs.showarray();
		
		System.out.println("Radix sort: ");
		Radix Rs = new Radix(a, n);
		Rs.runSort();
		Rs.showarray();
		
		System.out.println("Heap sort: ");
		MaxHeap Mh = new MaxHeap(a,n);
		Mh.runSort();
		Mh.showarray();
	}
	
}
