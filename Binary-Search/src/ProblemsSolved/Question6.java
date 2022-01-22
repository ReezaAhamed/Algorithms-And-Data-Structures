package ProblemsSolved;

public class Question6 {
	
	/*
	 * LeetCode : Mountain Array
	 * Let's call an array 'arr' a mountain if the following properties hold.
	 * array.lenght >= 3
	 * There exists some i with 0 < i < arr.length-1 such that
	 * arr[0] < arr[1] < .....arr[i-1] < arr[i]
	 * arr[i] > arr[i+1] > .....> arr[arr.length-1]
	 * 
	 * Given an integer array 'arr' that is guaranteed to be a mountain, 
	 * return any i such that arr[0] < arr[i] < ....arr[i-1] < arr[i] > arr[i+1] > ...>arr[arr.lenght-1] 
	 * 
	 * Input: arr = [0,1,0], Output: 1
	 * Input: arr = [0,2,1,0], Output: 1
	 */

	public static void main(String[] args) {
		
		int array[] = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,10,8,6,4,2,0};
		int array2[] = {1,2,3,4,5,6,7,8,9,7,5,3};
		
		System.out.println(findIndexOfPeakInMountainArray(array2));
		
	}
	
	 public static int findIndexOfPeakInMountainArray(int array[]) {
		
		 int start = 0;
		 int end = array.length-1;
		 int indexOfPeak = 0;
		 
		 while(start <= end) {
			 
			int mid = start + (end-start)/2;
			System.out.println(mid);
			
			if(array[mid+1] > array[mid]) {
				start = mid+1;
			} else if (array[mid-1] > array[mid]) {
				end = mid-1 ;
			} else {
				indexOfPeak = mid;
				break;
			}
		 }
		 
		 return indexOfPeak;
	 }

}
