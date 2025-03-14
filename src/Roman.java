
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Roman {
    public int romanToInt(String s) {
        // Step 1: Create a map to store Roman numeral values
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        // Step 2: Iterate through the string from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            int currValue = romanMap.get(s.charAt(i));

            // Step 3: If the current value is smaller than the previous, subtract it (for cases like IV, IX, etc.)
            if (currValue < prevValue) {
                result -= currValue;
            } else {
                result += currValue;
            }

            // Update previous value for next iteration
            prevValue = currValue;
        }

        return result;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the roman number:");  // Moved this line before input
            
        String str=sc.nextLine();
        str=str.toUpperCase();

        Roman solution = new Roman();
        int res = solution.romanToInt(str);
        

        
        System.out.println("Integer value: " + res);
        
        sc.close();  // Close Scanner to prevent resource leak
    }
}
