import java.util.Arrays;

class ArrayOfOperations
{
    public int[] applyOperations(int[] nums) {
       
        for (int i = 0; i < nums.length - 1; i++) { 
            if (nums[i] == nums[i + 1]) {
                nums[i] *= 2;
                nums[i + 1] = 0;
            }
        }
        int[] result = new int[nums.length];
        int index = 0;

        for (int num : nums) {
            if (num != 0) {
                result[index++] = num;
            }
        }
        
        return result;
    }

    public static void main(String args[]) {
        ArrayOfOperations s = new ArrayOfOperations();
        int arr[] = {1, 2, 2, 1, 1, 0};
        int res[] = s.applyOperations(arr);
        System.out.println(Arrays.toString(res)); 
    }
}
