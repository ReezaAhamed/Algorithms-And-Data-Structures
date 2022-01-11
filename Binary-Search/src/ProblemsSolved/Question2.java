package ProblemsSolved;

public class Question2 {
	
	/* The Question 
	 * Floor of a number
	 * i.e. Find the biggest element in array which is less than or equal to the target number
	*/

	public static void main(String[] args) {
		int[] array = {-15, -12, -3, 0, 1, 3, 7, 15, 17, 21, 35, 55, 99};
		int[] array2 = {99, 55, 35, 21, 17, 15, 7, 3, 1, 0, -3, -12, -15};
		int target = 20;
		int answer = floorOfANumber(array, target);
		int answer2 = floorOfANumber(array2, target);
		System.out.println(answer);
		System.out.println(answer2);
	}
	
	static int floorOfANumber(int[] array, int target) {
		
		int start = 0;
		int end = array.length - 1;
		
		boolean isAscending = array[end] > array[0];
		
		// check whether target is greater then the max value of array
		if(isAscending) {
			if(target < array[0])
				return -1;
		} else {
			if(target < array[end])
				return -1;
		}		
		
		while(start <= end) {
			 
			int mid = start + (end - start) / 2;
			
			if(target == array[mid]) {
				return mid;
			}
			
			if(isAscending) {
				if(target > array[mid]) {
					start = mid + 1;
				} else {
					end =  mid - 1;
				}			
			} else {
				if(target < array[mid]) {
					start = mid + 1;
				} else {
					end = mid - 1;
				}				
			}			
		}
		
		if(!isAscending) { // if it's in descending order, return start
			return start;
		}
		return end;
	}

}
