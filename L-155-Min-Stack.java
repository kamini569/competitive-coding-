Intuition

To get the minimum element in constant time, we store the minimum value at each step.
Along with the main stack, we keep another stack that remembers the minimum till the current element.

Approach

Use two stacks:

stk to store all pushed elements

minstk to store the minimum element at each level

While pushing:

Push the value into stk

Push the smaller value between the current element and the previous minimum into minstk

While popping:

Pop elements from both stacks

top() returns the top of stk

getMin() returns the top of minstk

Complexity
Time Complexity

push() → O(1)
pop() → O(1)
top() → O(1)
getMin() → O(1)

Space Complexity
O(n)
Two stacks are used, each storing up to n elements.  

Solution:
public class MinStack{
ArrayDeque<Integer> stk;
ArrayDeque<Integer> minstk;

public MinStack() {
    stk = new ArrayDeque<>();
    minstk = new ArrayDeque<>();
}

public void push(int val) {
    stk.addLast(val);
    if(minstk.size() == 0) {
        minstk.addLast(val);}
        else {
            minstk.addLast(Math.min(val, minstk.peekLast()));
            // int a = val;
            // int b= minstk.peekLast();
            // int min = Math.min(a, b);
            //minstk.addLast(min);
            }
}

public void pop() {
    stk.removeLast();
    minstk.removeLast();
}
    
    public int top() {
        return stk.peekLast();
    }
    
    public int getMin() {
      return minstk.peekLast(); 
    }
}
