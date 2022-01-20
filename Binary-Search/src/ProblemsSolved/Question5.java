package ProblemsSolved;

public class Question5 {
	
	/*
	 * Amazon : Find position of an element in a sorted array of infinite numbers
	 */
	
	public static void main(String[] args) {
		
		int array[] = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		int target = 7;
		
		System.out.println(findPositionInInfiniteArray(array, target));
		
	}
	
	public static int findPositionInInfiniteArray(int[] array, int target){
		
		int start = 0;
		int end = 1;
		
		while(array[end] < target) {
			
			start = end;
			end = 2 * end;
		}
		
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
