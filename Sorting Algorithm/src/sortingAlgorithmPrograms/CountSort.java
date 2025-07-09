package sortingAlgorithmPrograms;

public class CountSort {
	public static void main(String[] args) {
		int [] a = {10, 40, 55, 30, 0, 25, 35, 40, 1, 10, 5};
		
		System.out.print("Original array: ");
		for(int o : a)
			System.out.print(o + " ");
		
		getCountSort(a);
		System.out.print("\nSorted array: ");
		for(int n : a)
			System.out.print(n+ " ");
	}
	
	public static void getCountSort(int [] a) {
		int min = a[0], max = a[0];
		
		for(int x:a) {
			if(x>max)
				max = x;
			else if (x<min)
				min = x;
		}
		
		int [] freq = new int[max - min + 1];

		for(int x : a) {
			freq[x - min]++;
		}
		
		for(int i = 0, j = 0 ; i<freq.length ; i++) {
			while(freq[i] != 0) {
				a[j++] = i + min;
				freq[i]--;
			}
		}
	}
}
