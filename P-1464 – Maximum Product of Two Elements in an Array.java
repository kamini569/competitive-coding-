📝 Intuition

To get the maximum value of

(nums[i]−1)×(nums[j]−1),

we should choose the two largest numbers in the array.

Because:

Larger numbers give a larger product.

Instead of checking all pairs, just find the largest and second largest elements.

🧠 Approach

Initialize two variables:

max1 = largest number

max2 = second largest number

Traverse the array:

If current number > max1
→ update max2 = max1 and max1 = current

Else if current number > max2
→ update max2 = current

After finding the two largest numbers:

Return (max1 - 1) * (max2 - 1)

⚙️ Complexity

⏱️ Time Complexity
O(n) — Single pass through the array.

💾 Space Complexity
O(1) — Only two variables are used.

💻 Solution (Java)

class Solution {
    public int maxProduct(int[] nums) {
        int max1 = 0;
        int max2 = 0;

        for (int num : nums) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }
        }

        return (max1 - 1) * (max2 - 1);
    }
}
