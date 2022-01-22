package ProblemsSolved;

public class Question6 {
	
	/*
	 * LeetCode : Mountain Array aka Bitonic Array
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
		
		int[] array = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,10,8,6,4,2,0};
		int[] array2 = {1,2,3,4,5,6,7,8,9,7,5,3}; 
		int[] array3 = {0,1,0};
		int[] array4 = {0,2,1,0};
		int[] array5 = {1,2,3,4,5,6,7,8,9,1,0};
		
		System.out.println(findIndexOfPeakInMountainArray(array));
		System.out.println(findIndexOfPeakInMountainArray(array2));
		System.out.println(findIndexOfPeakInMountainArray2(array3));
		System.out.println(findIndexOfPeakInMountainArray2(array4));
		System.out.println(findIndexOfPeakInMountainArray2(array5));
		
	}
	
	 public static int findIndexOfPeakInMountainArray(int array[]) {
		
		 int start = 0;
		 int end = array.length-1;
		 int indexOfPeak = 0;
		 
		 while(start <= end) {
			 
			int mid = start + (end-start)/2;
			
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
	 
	 public static int findIndexOfPeakInMountainArray2(int array[]) {
			
		 int start = 0;
		 int end = array.length-1;
		 
		 while(start < end) {
			 
			int mid = start + (end-start)/2;
			
			if(array[mid] > array[mid+1]) { // we are in decreasing part of the error. It may be the answer, but look at left
				end = mid;    // end != mid-1, cuz this (mid) may be an answer
			} else { // we are in ascending part of the array.
				start = mid+1 ; // mid+1, cuz, we know that mid+1 element b> mid element
			}

		 }
		 
		 //in the end, at start == end pointing to the largest element of the array
		 return start; // or return end
	 }


}
