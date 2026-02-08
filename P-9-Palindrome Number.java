📝 Intuition

If a number is palindrome, its first half and second half should be the same when reversed.
Instead of reversing the whole number, we reverse only half of the digits and compare both halves.

This reduces operations and makes the solution faster.

🧠 Approach

If the number is negative → return false

If the number ends with 0 (but not 0 itself) → return false

Reverse digits one by one and store them in reversedHalf

Stop when reversedHalf becomes greater than or equal to the remaining number

For even digits: compare x == reversedHalf

For odd digits: compare x == reversedHalf / 10

⚙️ Complexity
⏱️ Time Complexity

O(d / 2)
Only half of the digits are processed.

💾 Space Complexity

O(1)
No extra space is used.

💻 Solution 
class Solution 
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) 
            return false;

        int reversedHalf = 0;

        while (x > reversedHalf) {
            reversedHalf = reversedHalf * 10 + x % 10;
            x = x / 10;
        }

        return x == reversedHalf || x == reversedHalf / 10;
    }
}
