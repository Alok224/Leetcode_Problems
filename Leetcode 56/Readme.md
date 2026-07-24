Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.

#### Approach

1. Firstly, intervals array ko sort krdo and intervals array m loop lga diya.

2. vha se hr k interval m start point and end point ko dekha and result name ki list se check kiya.

3. result list int[] array ko store krti hai.

4. agr meri result list empty hai toh usme interval ko result list mai add krdunga.

5. Agr result list empty nhi hai toh list ka last interval ko lunga and uska end integer lunga and uski interval k start point and end point se compare krunga.

6. Agr start point result list k end point se smaller hai and result list ka end point interval k end point se smaller hai toh result list k end point ko interval ka end point bna dunga.

7. Agr result list ka end point greater hua interval k end point se toh uss interval ko add nhi krunga.

8. Agr yeh sb nhi hota hai toh saaf baat hai ki voh interval uss phle vale interval k andar aa hi nhi rha toh usko result list mai add krdunga.

9. Ese krte krte pura interval ko traverse kr dunga.

10. lastly, return result, but isko array mai bhi convert krdunga.

11. Time Comeplexity :- O(n) + O(nlogn)
Space Complexity:- O(n)