package com.evil.inc.leetcode;

/*
*
You want to delete the columns that are not sorted lexicographically. In the above example (0-indexed), columns 0 ('a', 'b', 'c') and 2 ('c', 'e', 'e') are sorted while column 1 ('b', 'c', 'a') is not, so you would delete column 1.

Return the number of columns that you will delete.



Example 1:

Input: strs = ["cba","daf","ghi"]
Output: 1
Explanation: The grid looks as follows:
  cba
  daf
  ghi
Columns 0 and 2 are sorted, but column 1 is not, so you only need to delete 1 column.
Example 2:

Input: strs = ["a","b"]
Output: 0
Explanation: The grid looks as follows:
  a
  b
Column 0 is the only column and is sorted, so you will not delete any columns.
Example 3:

Input: strs = ["zyx","wvu","tsr"]
Output: 3
Explanation: The grid looks as follows:
  zyx
  wvu
  tsr
All 3 columns are not sorted, so you will delete all 3.


* */
public class DeleteColumns {
    public int solve(String[] strs) {
        int columnsToBeDeleted = 0;
        boolean[] columnsMarkedForDeletion = new boolean[strs[0].length()];
        for (int k = 0; k < strs.length; k++) {
            for (int i = 0; i < strs[k].length(); i++) {
                for (int j = k + 1; j < strs.length; j++) {
                    if(strs[k].charAt(i) > strs[j].charAt(i) && !columnsMarkedForDeletion[i]){
                        columnsToBeDeleted++;
                        columnsMarkedForDeletion[i] = true;
                        break;
                    }
                }
            }
        }

        return columnsToBeDeleted;
    }

    public int solve2(String[] strs) {
        int columnsToBeDeleted = 0;
        for (int col = 0; col < strs[0].length(); col++) {
            for (int row = 1; row < strs.length; row++) {
                if (strs[row].charAt(col) < strs[row - 1].charAt(col)) {
                    columnsToBeDeleted++;
                    break;
                }
            }
        }

        return columnsToBeDeleted;
    }
}
