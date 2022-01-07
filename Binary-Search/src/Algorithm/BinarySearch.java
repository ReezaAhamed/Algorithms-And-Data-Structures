package Algorithm;

public class BinarySearch {
	 
	public static void main(String[] args) {
		
		int[] array = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
		int target = 22;
		int answer = binarySearch(array, target);
		System.out.println(answer);
	}


	static int binarySearch(int[] array, int target) {
	
		int start = 0;
		int end = array.length - 1;
		
		while(start <= end) {
			
			//finding the middle element
			// int mid = (start + end) / 2; // There's a possibility (start + end) might exceed the range of int in Java  
			int mid = start + (end - start) / 2;
			
			if(target < array[mid]) {
				end = mid - 1;
			} else if (target > array[mid]) {
				start = mid + 1;
			} else {
				// The answer
				return mid;
			}
			
		}
		
		return -1;
	}
	
}
