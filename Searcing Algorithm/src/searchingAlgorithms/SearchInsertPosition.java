package searchingAlgorithms;

public class SearchInsertPosition {

	public static void main(String[] args) {
		int[] a = {10, 12, 15, 30, 35, 38, 40};
		
		int key = 39;
		
		int index = binarySearch(a, key);
		
		if(index >= 0)
			System.out.println(key+" is found at index: "+index);
		else
			System.out.println(key+" is not found and it can fit at index: "+(-(index+1)));	
	}
	
	public static int binarySearch(int[] a, int key) {
		int low = 0, high = a.length-1;
		
		while(low <= high) {
			int mid = low + (high - low)/2;
			
			if(a[mid] == key)
				return mid;
			else if(a[mid] > key) {
				high = mid - 1;
			}else {
				low = mid + 1;
			}
		}
		return -(low+1);
	}

}
