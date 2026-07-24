Given a string containing just the characters '(' and ')', return the length of the longest valid (well-formed) parentheses substring.

 
<!-- Approach -->

1. Valid parenthesis kb ho skta tha? jb mujhe () yeh mile ya phir mujhe (()) mile.

2. Toh 2 cases possible hai. Ist case ko consider krte hai.

3. loop lagaya, Agr mujhe s.charAt(i) == ')' yeh milta and s.charAt(i-1) == '(' yeh milta hai toh valid parenthesis hai. then dp[i] = dp[i-2] + 2 ho jayega.

4. dp[i-2] kyu? Agr yha p dp[i] likha toh voh toh unknown hai hi. dp[i-1] likhne pr calculations wrong ho rhi hai means testcases fail ho rhe hai.

5. dp[i-2] ka mtlb yeh ho jata hai ki jb mujhe valid parenthesis mila tb uss valid parenthesis () se phle dp[given index] pr end hone vale previous valid parenthesis ki length kya hai.

6. Ab case 2 yani second pattern ko consider krte hai.

7. Agr mujhe s.charAt(i) == ')' yeh milta hai and s.charAt(i-1) == ')' bhi yeh milte hai toh uss vale case mai mujhe check krna pdega ki iss phle koi yeh vali string hai kya --> '(' open bracket.

8. Isko check krne k liye mane i - dp[i-1] -1 >= 0 and s.charAt(i-dp[i-1] -1) == '(' yeh condition laga di.

9. Agr yeh condition fulfil hoti hai toh dp[i] = dp[i-1] + 2;

10. But abhi previous vale valid parenthesis add nhi kiye hai toh unke liye ek aur condition lagani padegi.

11. Agr i - dp[i-1] -1 >= 0 hua toh dp[i] = dp[i] + dp[i-dp[i-1] -2] yeh ho jayega.

12. Then last step mai maxlen nikal lenge.
