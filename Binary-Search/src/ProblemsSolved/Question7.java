package ProblemsSolved;

public class Question7 {
	
	/*
	 * LeetCode : Find Peak Element
	 * A peak element is an element that is strictly greater than its neighbors.
	 * 
	 * Given an integer array nums, find a peak element, and return its index. If the array contains multiple peaks, 
	 * return the index to 'any of the peaks'
	 * 
	 * You may imagine that nums[-1] = nums [n] = -infinity // property of mountain array yeah!
	 * 
	 * You must write an algorithm that runs in O(log n) time.
	 *
	 * Input: arr = [1,2,3,1], Output: 2
	 */

	public static void main(String[] args) {
		
		int[] nums = {1,2,3,1};
		
		System.out.println(findPeakElement(nums));
		
	}

	private static int findPeakElement(int[] nums) {
		
		int start = 0;
		int end = nums.length - 1;

		while(start < end) {
			
			int mid = start + (end-start)/2;
			
			if(nums[mid] > nums[mid+1]) { // we are in descending part of the array. 
				end = mid; // mid e;lement may be a possible solution, but check in left for more
			} else { // we are in ascending part of the array
				start = mid+1; // we know mid element is smaller than mid+1 element. So we don't need to consider mid element
			}
		}
		
		return start; // or return end // because, in the end start and end will point to the peak element
	}
	
}
