📝 Intuition

After drinking a bottle, it becomes an empty bottle.
We can exchange a fixed number of empty bottles for one full bottle.
So, keep drinking and exchanging until we don’t have enough empty bottles to exchange.

🧠 Approach

Start with:

totalDrinks = numBottles

empty = numBottles

While empty >= numExchange:

Exchange empty bottles to get new full bottles
newBottles = empty / numExchange

Add them to total drinks

Update empty bottles:
empty = (empty % numExchange) + newBottles

Return total drinks

⚙️ Complexity
⏱️ Time Complexity

O(log n) — Number of exchanges reduces each time.

💾 Space Complexity

O(1) — Only variables are used.

💻 Solution
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int totalDrinks = numBottles;
        int empty = numBottles;

        while (empty >= numExchange) {
            int newBottles = empty / numExchange;
            totalDrinks += newBottles;
            empty = (empty % numExchange) + newBottles;
        }

        return totalDrinks;
    }
}
