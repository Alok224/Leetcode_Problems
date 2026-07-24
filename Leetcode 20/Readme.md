Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 

<!-- Approach -->

1. Ek simple si approach rkhi. Stack data structure ka use kiya and loop lga diya.

2. Loop ka use krke ek ek chacketer ko check kiya ki voh open parenthesis h ki nhi. 

3. Agr voh open parenthesis hua toh stack m close parenthesis push kr denge.

4. Agr close parenthesis milta hai toh stack m character ko pop krke check krlenge ki voh same h ki nhi. Agr voh same hua toh voh iss baat ka proof hoga ki phle khi open bracket exist krta tha.

5. Then usko stack se pop() kr denge.

6. pop se phle check krna hoga ki stack empty h ki nhi. kyuki stack agr empty hua and element pop hua toh runtime error aa jayega.

7. Agr pop hua element yani close parenthesis stack m exist nhi krta toh return false krdena h.

8. lastly, return stack.isEmpty().