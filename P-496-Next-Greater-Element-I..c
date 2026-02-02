Intuition

For each element in nums1, we need to find the first greater element to its right in nums2.
If no such element exists, the answer is -1.

Approach

For each element in nums1:

Find its position in nums2

From that position, scan the right side of nums2

The first element greater than the current value is the next greater element

If no greater element is found, store -1

Store the result for each element in the answer array

Complexity
Time Complexity

O(n × m)
For each element of nums1, we may scan nums2 and its remaining part.

Space Complexity

O(1)
Only a fixed-size result array is used (excluding output array).

Solution
#include <stdlib.h>

int* nextGreaterElement(int* nums1, int nums1Size, int* nums2, int nums2Size, int* returnSize) {
    *returnSize = nums1Size;
    int* ans = (int*)malloc(nums1Size * sizeof(int));

    for (int i = 0; i < nums1Size; i++) {
        int next = -1;

        // find nums1[i] in nums2
        for (int j = 0; j < nums2Size; j++) {
            if (nums2[j] == nums1[i]) {
                // find next greater
                for (int k = j + 1; k < nums2Size; k++) {
                    if (nums2[k] > nums1[i]) {
                        next = nums2[k];
                        break;
                    }
                }
                break;
            }
        }
        ans[i] = next;
    }

    return ans;
}
