You are given an integer array coins representing coins of different denominations and an integer amount representing a total amount of money.

Return the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.

You may assume that you have an infinite number of each kind of coin.


<!-- Approach -->

1. Simple si baat puchi h isme ki minimum number of coins nikalo to reach the amount.

2. Zara socho ki agr mere pass coins hi na ho toh given amount tk toh pahuch hi nhi skte. Toh vha pr infinity aayega yani ek bhut bda amount assume kr skte h and table m store kra denge.

3. Age mere pass amount hi zero h toh coins bhut saare h toh mere pass minimum no. of coins 0 hi honge kyuki m coins ko lunga hi nhi.

4. bss yeh check kr lena jb return kro toh ki dp[n][amount] khi bhut bda amount na hi it means ki amount bnana possible na ho. age esa hua toh return -1 krdena vrna value ko hi return kra denge.