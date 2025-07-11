package searchingAlgorithms;

// O(time) = O(log n);

public class BinarySearch {
	public static void main(String[] args) {
		int[] a = {10, 12, 15, 30, 35, 38, 40};
		
		int key = 10;
		
		int index = binarySearch(a, key);
		
		if(index >= 0)
			System.out.println(key+" is found at index: "+index);
		else
			System.out.println(key+" is not found");	
	}
	
	public static int binarySearch(int[] a, int key) {
		int low = 0, high = a.length;
		
		while(low <= high) {
			int mid = low + (high - low)/2;
			
			if(a[mid] == key)
				return mid;
			else if(a[mid] > key)
				high = mid - 1;
			else
				low = mid + 1;
		}
		return -1;
	}
}
