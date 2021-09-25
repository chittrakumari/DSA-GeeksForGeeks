## Practice Questions Geeks For Geeks:

## Topic - <b>Arrays</b>
### <B> Q.1  Move all zeroes to end of array </B>

Given an array arr[] of N positive integers. Push all the zero’s of the given array to the right end of the array while maitaining 
the order of non-zero elements.

Example 1:

Input:
N = 5
Arr[] = {3, 5, 0, 0, 4}
Output: 3 5 4 0 0
Explanation: The non-zero elements
preserve their order while the 0
elements are moved to the right.
Example 2:

Input:
N = 4
Arr[] = {0, 0, 0, 4}
Output: 4 0 0 0
Explanation: 4 is the only non-zero
element and it gets moved to the left.

Your Task:
You don't need to read input or print anything. Complete the function pushZerosToEnd() which takes the array arr[] and its size n 
as input parameters and modifies arr[] in-place such that all the zeroes are moved to the right.  


Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)



Q
Constraints:
1 ≤ N ≤ 105
0 ≤ arri ≤ 105

### <B> Q.2 Leaders in an array </B>

Given an array A of positive integers. Your task is to find the leaders in the array.
An element of array is leader if it is greater than or equal to all the elements to its right side.
The rightmost element is always a leader.



Example 1:

Input:
n = 6
A[] = {16,17,4,3,5,2}
Output: 17 5 2
Explanation: The first leader is 17
as it is greater than all the elements
to its right.  Similarly, the next
leader is 5. The right most element
is always a leader so it is also
included.


Example 2:

Input:
n = 5
A[] = {1,2,3,4,0}
Output: 4 0


Your Task:
You don't need to read input or print anything. The task is to complete the function leader()
which takes array A and n as input parameters and returns an array of leaders in order of their
appearance.

Expected Time Complexity: O(n)
Expected Auxiliary Space: O(n)


Constraints:
1 <= n <= 107
0 <= Ai <= 107

