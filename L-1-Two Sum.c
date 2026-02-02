Intuition

We need to find two different numbers in the array whose sum is equal to the target.
The simplest way is to check every possible pair and see if their sum matches the target.

Approach

Use two nested loops:

The first loop selects one element num[i]

The second loop selects the next element num[j] (j = i + 1)

For each pair, check:

If num[i] + num[j] == target

If the condition is true:

Store indices i and j in the result array

Return the result immediately

Memory for the result array is allocated using malloc as required by LeetCode

Complexity
Time Complexity

O(n²)
Because two loops are used to check all possible pairs.

Space Complexity

O(1)
Only a fixed-size array of 2 elements is used for the answer (extra space is constant).

Solution:
  int* twoSum(int* num, int numSize, int target, int* returnSize) {
    *returnSize = 2;  // LeetCode requirement: set result size to 2
    int* ans = (int*)malloc(2 * sizeof(int)); // memory for 2 indices
    int i, j;

    for(i = 0; i < numSize; i++) {
        for(j = i + 1; j < numSize; j++) {
            if(num[i] + num[j] == target) {
                ans[0] = i;
                ans[1] = j;
                return ans; // return indices
            }
        }
    }
    return NULL; // Will never reach here (as per problem condition)
}
