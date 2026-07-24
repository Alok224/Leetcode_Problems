Given two strings str1 and str2, return the shortest string that has both str1 and str2 as subsequences. If there are multiple valid strings, return any of them.

A string s is a subsequence of string t if deleting some number of characters from t (possibly 0) results in the string s.

<!-- Approach -->

1. Ek concept toh yeh tha ki dono string ko ad krke and LCS ko nikal ke unke sum m se subract krdu but voh java m possible nhi tha.

2. Second concept yeh h ki dp table bnake usme LCS ko nikalke then usme stringbuilder ka use krke dp me se string ko access kr lena.

3. But baad m reverse krna pdega kyuki humne i and j ko dono string ki length mana h toh string revrse fetch hogi toh usko baad m reverse krna pdega.

4. LCS string ko string builder m append krdenge jiski wajah se common string append ho jayengi.

5. Phir remaining string ko bhi stringbulder m append kr denge.