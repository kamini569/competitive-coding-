📝 Intuition

We need to find two numbers whose sum equals the target.
Instead of checking all pairs (which is slow), we store numbers in a map and check if the required complement already exists.

If a + b = target, then while visiting a, we check if target - a is already seen.

🧠 Approach

Create a HashMap to store number and its index

Traverse the array:

For each element nums[i]

Calculate complement = target - nums[i]

If complement exists in the map → return indices

Otherwise, store current number and index in the map

Return the result

⚙️ Complexity
⏱️ Time Complexity

O(n) — Array is traversed once.

💾 Space Complexity

O(n) — Extra space for HashMap.

💻 Solution
import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{};
    }
}
