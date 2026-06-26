public class Solution { // class for solution
    public int[] twoSum(int[] nums, int target) { // takes an array of numbers and a target, returns the two indexes that add up to it
        int[][] A = new int[nums.length][2]; // create a 2D array to store each number
        for (int i = 0; i < nums.length; i++) { // go through every number in the array
            A[i][0] = nums[i]; // store numberi in first column
            A[i][1] = i; // after sorting, store it in the second column 
        }

        Arrays.sort(A, Comparator.comparingInt(a -> a[0])); // sort by the number column

        int i = 0, j = nums.length - 1; // one at the start and one at the end
        while (i < j) { //  two number havent crossed
            int cur = A[i][0] + A[j][0]; // add the two numbers
            if (cur == target) { // if add up to the target = answer
                return new int[]{Math.min(A[i][1], A[j][1]), // return the indexes in ascending order
                                 Math.max(A[i][1], A[j][1])};
            } else if (cur < target) { // move the right pointer left to get a smaller number if the sum is too big
                i++;
            } else {
                j--;
            }
        }
        return new int[0]; // if no pair is found return an empty array
    }
}