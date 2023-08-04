package main.java.LeetCode.Arrays.PascalsTriangle;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII {
    public List<List<Integer>> generate(int numRows) {



        List<List<Integer>> resultArray  = new ArrayList();

        if (numRows == 0) return resultArray;

       List<Integer> rowList, previousList = null;

        for (int i =0; i < numRows; i++) {
            rowList = new ArrayList<>();

            for (int  j = 0 ; j <= i; j ++) {
                if (j ==0 || j == i) {
                    rowList.add(1);
                } else {
                    rowList.add(previousList.get(j-1) + previousList.get(j));
                }
            }
            previousList = rowList;
            resultArray.add(rowList);
        }
    return resultArray;
    }
}
