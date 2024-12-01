
### **Explanation of the Method:**

* Check nulls and empty arrays
* **Sliding Window Approach**:
  * Iterate through the first array which is mainArray and at each index i 
  * Compare each value of sub Array with index j with main Array index i
  * If no match, make found variable false and breaks the sub Array loop then increment main Array index i
  * If matches, iterate through sub Array and compare the rest of the sub Array with the main Array.
  * If all values match by completing the sub array loop then found variable would true hence return the main Array index
* **If No Match is Found**: If the loop completes without finding a match, we return -1.

Performance:

**Time Complexity:** O(n*m), where n is the length of the main array and m is the length of the sub-array

**Note:**

* For very large arrays, better to consider pattern search algorithms like KMP or Rabin-Karp
* This approach only works for primitive int arrays