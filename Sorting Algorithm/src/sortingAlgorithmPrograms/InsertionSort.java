package sortingAlgorithmPrograms;

public class InsertionSort {
	public static void main(String[] args) {
		int [] a = {10, 40, 55, 30, 25, 35, 40, 10, 5};
		
		System.out.print("Original array: ");
		for(int o : a)
			System.out.print(o + " ");
		
		getInsertionSort(a);
		System.out.print("\nSorted array: ");
		for(int n : a)
			System.out.print(n+ " ");
	}
	
	public static void getInsertionSort(int [] a) {
		for(int i = 1 ; i < a.length ; i++) {
			int key = a[i], j = i-1;
			while(j >= 0 && a[j] > key) {
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = key;
		}
	}
}
