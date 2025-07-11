package searchingAlgorithms;

// O(time) = O(n) 

public class LinearSearch {
	public static void main(String[] args) {
		int[] a = {10, 8, 20, 15, 28, 30, 31};
		
		int key = 28;
		
		int index = linearSearch(a, key);
		
		if(index >= 0)
			System.out.println(key+" is found at index: "+index);
		else
			System.out.println(key+" is not found");
	}
	
	public static int linearSearch(int[] a, int key) {
		for(int i = 0; i<a.length ; i++) {
			if(a[i] == key)
				return i;
		}
		return 1;
	}
}
