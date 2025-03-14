public class OddsuminSubArray {
    public static int numOfSubarrays(int[] arr) {
        final int MOD = 1000000007;
        int oddCount = 0, evenCount = 1; // evenCount = 1 for the empty prefix
        int prefixSum = 0, result = 0;

        for (int num : arr) {
            prefixSum += num;

            if (prefixSum % 2 == 0) { // Even prefix sum
                result = (result + oddCount) % MOD;
                evenCount++;
            } else { // Odd prefix sum
                result = (result + evenCount) % MOD;
                oddCount++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5};


        System.out.print(numOfSubarrays(arr1)); // Output: 4
         // Output: 16
      
    }
}
