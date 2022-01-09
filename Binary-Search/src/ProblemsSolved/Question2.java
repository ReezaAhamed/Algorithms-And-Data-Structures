package ProblemsSolved;

public class Question2 {
	
	/* The Question 
	 * Floor of a number
	 * i.e. Find the smallest element in array which is less than or equal to the target number
	*/

	public static void main(String[] args) {
		int[] array = {-15, -12, -3, 0, 1, 3, 7, 15, 17, 21, 35, 55, 99};
		int[] array2 = {99, 55, 35, 21, 17, 15, 7, 3, 1, 0, -3, -12, -15};
		int target = 20;
		int answer = ceilingOfANumber(array, target);
		int answer2 = ceilingOfANumber(array2, target);
		System.out.println(answer);
		System.out.println(answer2);
	}
	
	static int ceilingOfANumber(int[] array, int target) {
		
		int start = 0;
		int end = array.length - 1;
		
		boolean isAscending = array[end] > array[0];
		
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
		return end;
	}

}
