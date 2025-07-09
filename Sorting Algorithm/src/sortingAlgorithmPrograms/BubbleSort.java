package sortingAlgorithmPrograms;

public class BubbleSort {
	public static void main(String[] args) {
		int [] a = {40, 55, 20, 30, 0, 2, 24, 5, 60};
		
		System.out.print("Original array: ");
		for(int o : a)
			System.out.print(o + " ");
		
		System.out.println();
		
		getBubbleSort(a);
		System.out.print("\nSorted array: ");
		for(int n : a)
			System.out.print(n+ " ");
		
	}
	public static void getBubbleSort(int[] a) {
		int len = a.length;
		for(int i = 0 ; i < len-1 ; i++)
		{
			int count = 0;
			for(int j = 0 ; j < len-i-1 ; j++) {
				if(a[j] > a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					count++;
				}
			}
			if(count == 0)
				break;
		}
	}
}
