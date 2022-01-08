package Algorithm;

public class BinarySearch {
	 
	public static void main(String[] args) {
		
		int[] array = {-15, -12, -3, 0, 1, 3, 7, 15, 17, 21, 35, 55, 99};
		int target = 21;
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
