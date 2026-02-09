LeetCode P-268 – Missing Number

📝 Intuition

The array contains all numbers from 0 to n except one missing number.
If we know the sum of numbers from 0 to n, we can subtract the sum of the array to get the missing number.

🧠 Approach

Calculate total sum of numbers from 0 to n: total = n * (n + 1) / 2

Calculate sum of all elements in the array: sumNums

Missing number = total - sumNums

⚙️ Complexity

⏱️ Time Complexity
O(n) — Loop once to sum array elements.

💾 Space Complexity
O(1) — Only a few variables are used.

💻 Solution

class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int total = n * (n + 1) / 2;
        int sumNums = 0;

        for (int num : nums) {
            sumNums += num;
        }

        return total - sumNums;
    }
}
