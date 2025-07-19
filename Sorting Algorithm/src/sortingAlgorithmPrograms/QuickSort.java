package sortingAlgorithmPrograms;

public class QuickSort {
	public static void main(String[] args) {
		int[] arr = {30, 20, 48, 32, 16, 38, 42, 20};
		System.out.print("Original array: ");
		for(int x: arr)
			System.out.print(x+" ");
		
		quickSort(arr, 0, arr.length-1);
		
		System.out.print("\nSorted array: ");
		for(int x : arr)
			System.out.print(x+" ");
	}
	
	public static void quickSort(int[] a, int low, int high) {
		if(low<high) {
			int partitionPoint = partition(a, low, high);
			quickSort(a, low, partitionPoint-1);
			quickSort(a, partitionPoint+1, high);
		}
	}
	
	public static int partition(int[] a, int low, int high) {
		int mid = low+(high-low)/2;
		int pivot = a[mid];
		swap(a, mid, high);
		
		int i = low;
		for(int j = low ; j<high ; j++) {
			if(a[j] < pivot) {
				swap(a, i++, j);
			}
		}
		swap(a, i, high);
		return i;
	}
	
	public static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
