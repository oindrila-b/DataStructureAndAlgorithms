package main.java.LeetCode.Arrays.PascalsTriangle;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> resultList  = new ArrayList<>();

        List<Integer> rowList, previousList = null;

        for (int i=0; i < numRows; i++) {
            rowList = new ArrayList<>();

            // number of columns is = row number
            for(int j = 0 ; j <=i; j++) {
                if (j == 0 || j == i) {
                    rowList.add(1);
                }else {
                    rowList.add(previousList.get(j-1) + previousList.get(j));
                }
            }
            previousList = rowList;
            resultList.add(rowList);

        }

        return resultList;

    }


}
