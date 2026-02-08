📝 Intuition

A power of two has only one bit set in its binary representation.
Examples:
1 → 0001
2 → 0010
4 → 0100
8 → 1000

If we subtract 1 from such a number, all bits after that position become 1.
So, performing n & (n - 1) will result in 0 only for powers of two.

🧠 Approach

If n <= 0, return false (zero and negative numbers are not powers of two)

Use bit operation:

Check if (n & (n - 1)) == 0

If true → n is a power of two

Otherwise → not a power of two

⚙️ Complexity
⏱️ Time Complexity

O(1) — Constant time operation.

💾 Space Complexity

O(1) — No extra space used.

💻 Solution
class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        return (n & (n - 1)) == 0;
    }
}
