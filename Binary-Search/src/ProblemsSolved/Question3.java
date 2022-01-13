package ProblemsSolved;

public class Question3 {
	
	/*
	 * Leetcode
	 * Given a characters array 'letters' that is sorted in non-decreasing order and a character 'target', 
	 * return the smallest character in the array that is larger than target  
	 * Note that the letters wraps around, e.g. target == 'z' and letters == ['a','b'], the answer is 'a'
	 */
	
	public static void main(String[] args) {
		
		char [] letters = {'a', 'b', 'm','x','y'};
		char target = 'y';
		
		System.out.println(nextGreatestLetter(letters, target));
	}
	
	public static char nextGreatestLetter(char[] letters, char target){
		
		int start = 0;
		int end = letters.length - 1;
		
		while (start <= end) { // loop breaks when start = end+1
			
			int mid = start + (end-start)/2;
			
			if(target < letters[mid]) {
				end = mid - 1;
			} else {         // equals condition need not to bes tested as the question is asking the greater value
				start = mid + 1;
			}
		}
			
		return letters[start % (letters.length)];
		
	}

}
