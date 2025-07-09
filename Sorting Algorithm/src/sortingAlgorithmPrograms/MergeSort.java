// Time Complexity of Merge Sort - O(Time) - O(nlogn)
// Space Complexity of Merge Sort - O(Space) - O(n)

package sortingAlgorithmPrograms;

public class MergeSort {
	public static void main(String[] args) {
		int[] arr = {20, 12, 30, 25, 18, 10, 17, 32, 0};
		
		System.out.print("Original Array: ");
		for(int x : arr)
			System.out.print(x+" ");
		
		divide(arr, 0, arr.length-1);
		
		System.out.print("\nSorted Array: ");
		for(int x : arr)
			System.out.print(x+" ");
	}
	
	public static void divide(int[] a, int low, int high) {
		if(low < high) {
			int mid = low + (high - low)/2;
			divide(a, low, mid);
			divide(a, mid + 1, high);
			merge(a, mid, low, high);
		}
	}
	
	public static void merge(int[] a, int mid, int low, int high) {
		int [] merged = new int[high - low + 1];
		int index1 = low, index2 = mid+1, x = 0;
		
		while(index1 <= mid && index2 <= high) {
			if(a[index1] > a[index2])
				merged[x++] = a[index2++];
			else
				merged[x++] = a[index1++];
		}
		
		while(index1 <= mid)
			merged[x++] = a[index1++];
		
		while(index2 <= high)
			merged[x++] = a[index2++];
		
		for(int i = low, j = 0 ; j < merged.length ; i++, j++) {
			a[i] = merged[j];
		}
	}
}
