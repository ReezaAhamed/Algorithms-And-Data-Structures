package ProblemsSolved;

import java.util.Arrays;

public class Question4 {
	
	/*
	 * LeetCode : Find First and Last Position of Element in Sorted Array
	 * Given an array of integers 'nums' sorted in ascending order, find the starting and 
	 * ending position of a given 'target' value.
	 * 
	 * If 'target' is not found in the rray, return [-1, -1] 
	 * 
	 * You must write an algorithm with O(log n) complexity
	 */
	
	public static void main(String[] args) {
		
		int[] nums = {5,7,7,8,8,10}; 
		int target = 8;
		
		System.out.println(Arrays.toString(searchRange(nums, target)));
	
	}
	
	public static int[] searchRange(int[] nums, int target) {
		
		int[] position = {-1, -1}; // initiate as if nothing found
		
		int start = searchOneSide(nums, target, true);
		int end = searchOneSide(nums, target, false);

		position[0] = start;
		position[1] = end;
		
		return position;
		
	}
	
	public static int searchOneSide(int[] arr, int target, boolean findStartIndex) {
		
		// potential candidate
		int position = -1; 
		
		int start = 0;
		int end = arr.length -1;
		
		while(start <= end) {
			
			int mid = start + (end-start)/2;
			
			if(target < arr[mid]) {
				end = mid - 1;
			} else if(target > arr[mid]) {
				start = mid + 1;
			} else {
				position = mid; // A potential answer
				
				if(findStartIndex) { // the case of more potential answers for first element (lies on the left)
					end = mid - 1;
				} else { // the case of more potential answers for last element lies (on the right)
					start = mid + 1;
				}
			}
		}

		return position;
	}

}
