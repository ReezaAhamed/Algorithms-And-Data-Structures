package ProblemsSolved;

public class Question5 {
	
	/*
	 * Amazon : Find position of an element in a sorted array of 'infinite' numbers
	 */
	
	public static void main(String[] args) {
		
		int array[] = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		int target = 7;
		
		System.out.println(findPositionInInfiniteArray(array, target));
		
	}
	
	public static int findPositionInInfiniteArray(int[] array, int target){
		
		// Find the range
		// start the box with size 2
		int start = 0;
		int end = 1;
		
		while(array[end] < target) { // condition for the target to ;ie in the range we are looking for
			
			int newStart = end + 1; // new start, because, in the next step we need start variable to calculate the box size
			// end = 2 * end; // in order to acheive log N time complexity, best approach is to double. (Chunk : Bottom to top 2 to N, remember BS, top to bottom)
			// double the box size i.e. end = previous end * box size*2
			end = end + (end - start + 1)*2; // +1, beacuse, size of the box is always difference of indices + 1
			
			start = newStart;
		}
		
		// Now we have the range whetre our target lies in, Apply binary search
		
		while(start <= end) {
			int mid = start + (end-start)/2;
			
			if(target < array [mid]) {
				end = mid - 1;
			} else if(target > array[mid]) {
				start = mid + 1;
			} else {
				return mid;
			}
		}
		
		return -1;
	}

}
