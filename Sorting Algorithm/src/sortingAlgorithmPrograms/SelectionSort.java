package sortingAlgorithmPrograms;

public class SelectionSort {
	public static void main(String[] args) {
		int [] a = {10, 40, 60, 30, 80, 35, 40, 5};
		
		System.out.print("Original array: ");
		for(int o : a)
			System.out.print(o + " ");
		
		getSelectionSort(a);
		System.out.print("\nSorted array: ");
		for(int n : a)
			System.out.print(n+ " ");
		

	}
	
	public static void getSelectionSort(int[] a) {
		int len = a.length;
		
		for(int i = 0 ; i < len-1 ; i++) {
			int min = i;
			for(int j = i+1 ; j < len ; j++) {
				if(a[j] < a[min])
					min = j;
			}
			int temp = a[min];
			a[min] = a[i];
			a[i] = temp;
		}
	}
}