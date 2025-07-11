package searchingAlgorithms;

public class BinarySearchUsingRecursion {
	public static void main(String[] args) {
		int[] a = {10, 12, 15, 30, 35, 38, 40};
		
		int key = 38;
		int low = 0, high = a.length-1;
		
		int index = binarySearchUsingRecursion(a, key, low, high);
		
		if(index >= 0)
			System.out.println(key+" is found at index: "+index);
		else
			System.out.println(key+" is not found");	
	}
	
	public static int binarySearchUsingRecursion(int[] a, int key, int low, int high) {
		
		if(low <= high) {
			int mid = low + (high - low)/2;
			
			if(a[mid] == key)
				return mid;
			else if(a[mid] > key)
				return binarySearchUsingRecursion(a, key, low, mid-1);
			else
				return binarySearchUsingRecursion(a, key, mid+1, high);
		}
		return -1;
	}
}
