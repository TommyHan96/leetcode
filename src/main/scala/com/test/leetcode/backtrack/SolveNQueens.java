package com.test.leetcode.backtrack;

import java.util.LinkedList;
import java.util.List;

public class SolveNQueens {
    public List<List<String>> solveNQueens(int n) {
        int[] result = new int[n];
        List<List<String>> resultList = new LinkedList<>();
        backtrack(resultList, result, 0, n);
        return resultList;
    }

    void backtrack(List<List<String>> resultList, int[] result, int row, int n) {
        if (row == n) {
            List<String> list = new LinkedList<>();
            for (int x = 0; x < n; ++x) {
                StringBuilder sb = new StringBuilder();
                for (int y = 0; y < n; ++y) {
                    sb.append(result[x] == y ? "Q" : ".");
                }
                list.add(sb.toString());
            }
            resultList.add(list);
            return;
        }
        for (int column = 0; column < n; ++column){
            boolean isValid = true;
            result[row] = column;

            for (int i = row - 1; i >= 0; --i){
                if (result[i] == column || row - i == Math.abs(result[i] - column)){
                    isValid = false;
                    break;
                }
            }
            if (isValid) backtrack(resultList, result, row + 1, n);
        }
    }
}
