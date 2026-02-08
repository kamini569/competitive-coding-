📝 Intuition

We need to add integer k to the number represented by the array.

Instead of converting the array to a number (which may overflow), we simulate manual addition from the last digit, just like pen-and-paper addition.

🧠 Approach

Start from the last index of num

Add k digit by digit

Store (sum % 10) in result

Update carry using k = sum / 10

Continue until:

all digits are processed and

carry becomes 0

Reverse the result at the end

This avoids costly operations and gives best performance.

⚙️ Complexity

⏱️ Time Complexity: O(n)
💾 Space Complexity: O(n)

💻 Solution (High Performance – Beats ~100%)

import java.util.*;

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result = new ArrayList<>();
        int i = num.length - 1;

        while (i >= 0 || k > 0) {
            if (i >= 0) {
                k += num[i];
                i--;
            }

            result.add(k % 10);
            k /= 10;
        }

        Collections.reverse(result);
        return result;
    }
}
