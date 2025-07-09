package sortingAlgorithmPrograms;

public class HeapSort {
	public static void main(String[] args) {
		int[] arr = {12, 18, 15, 16, 20, 19, 10, 23, 17, 24, 22};
		
		System.out.print("Original Array: ");
		for(int x : arr) {
			System.out.print(x+" ");
		}
			
		heapSort(arr);
		
		System.out.print("\nSorted array: ");
		for(int n : arr) {
			System.out.print(n+" ");
		}
	}
	
	public static void heapSort(int[] a) {
		int n = a.length;
		for(int i = n/2-1 ; i>=0 ; i--)
			heapify(a, n, i);
		for(int i = n-1 ; i>=0 ; i--) {
			swap(a, i, 0);
			heapify(a, i, 0);
		}
	}
	
	public static void heapify(int[] a, int n, int i) {
		int largest = i;
		int left = 2*i+1, right = 2*i+2;
		if(left < n && a[left] > a[largest])
			largest = left;
		if(right < n && a[right] > a[largest])
			largest = right;
		if(i != largest) {
			swap(a, i, largest);
			heapify(a, n, largest);
		}
	}
	
	public static void swap(int [] a ,int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
