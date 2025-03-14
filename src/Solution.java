class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0; // Edge case: If array is empty, return 0

        int k = 1; // Pointer for unique elements (starts at index 1)

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k - 1]) { // Compare with the last unique element
                nums[k] = nums[i]; // Move the unique element forward
                k++; // Increase the count of unique elements
            }
        }
        return k; // Number of unique elements
    }

    public static void main(String[] args) {
        Solution solution = new Solution(); // Create an object to call the method

        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4}; // Input array
        int k = solution.removeDuplicates(nums); // Call the function

        // Print the output
        System.out.println("Output: " + k);
        System.out.print("Modified array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println(); // New line
    }
}

