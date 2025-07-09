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
			System.out.println("\npartitionPoint: "+partitionPoint);
			quickSort(a, low, partitionPoint-1);
			quickSort(a, partitionPoint+1, high);
		}
	}
	
	public static int partition(int[] a, int low, int high) {
		int mid = low+(high-low)/2;
		System.out.println();
		System.out.println("Mid: "+mid);
		int pivot = a[mid];
		System.out.println("Pivot: "+pivot);
		swap(a, mid, high);
		
		System.out.print("After swapping mid and high: ");
		for(int x : a)
			System.out.print(x+ " ");
		System.out.println();
		
		int i = low;
		for(int j = low ; j<high ; j++) {
			System.out.println("\nj after j++: "+ j);
			if(a[j] < pivot) {
//				System.out.println("a[j]: "+a[j]);
				swap(a, i++, j);
				System.out.print("After swapping i and j: ");
				for(int x : a)
					System.out.print(x+ " ");
				System.out.println("\ni after i++: "+ i);
				System.out.println();
			}
		}
		swap(a, i, high);
		System.out.println();
		for(int x : a)
			System.out.print(x+ " ");
		return i;
	}
	
	public static void swap(int[] a, int i, int j) {
		System.out.println("Swap i: "+i);
		System.out.println("Swap j: "+j);
		System.out.println("a[i]: "+a[i]);
		System.out.println("a[j]: "+a[j]);
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
