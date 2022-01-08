package Algorithm;

public class OrderAgnosticBinarySearch {
	
	public static void main(String[] args) {
			
			int[] array = {-15, -12, -3, 0, 1, 3, 7, 15, 17, 21, 35, 55, 99};
			int[] array2 = {99, 55, 35, 21, 17, 15, 7, 3, 1, 0, -3, -12, -15};
			int target = 21;
			int answer = binarySearch(array, target);
			int answer2 = binarySearch(array2, target);
			System.out.println(answer);
			System.out.println(answer2);
	}


	static int binarySearch(int[] array, int target) {
	
		int start = 0;
		int end = array.length - 1;
		
		// Find out whether the array is sorted in ascending order or descending order
		boolean isAscending = array[start] < array[end];
		
		while(start <= end) {
			
			//finding the middle element
			// int mid = (start + end) / 2; // There's a possibility (start + end) might exceed the range of int in Java  
			int mid = start + (end - start) / 2;
			
			if(target == array[mid]) {
				return mid;
			} 
			
			if(isAscending) {
				
				if (target > array[mid]) {
					start = mid + 1;
				} else { // if (target < array[mid]) {
					end = mid - 1;
				}
				
			} else {
				
				if (target < array[mid]) {
					start = mid + 1;
				} else { // if (target > array[mid]) {
					end = mid - 1;
				}
			}
			
		}
		
		return -1;
	}

}
