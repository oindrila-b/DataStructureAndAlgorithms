package main.java.LeetCode.Arrays.Concatenation;

public class Concatenation {
        public int[] getConcatenation(int[] nums) {
            int[] ans = new int[2*nums.length];
            int k = 0;
                  for(int i = 0; i < 2; i++) {
                      for (int j :nums) {
                          ans[k++] = j;
                      }
                  }
            for (int i: ans) {
                System.out.print(i);
            }
                  return ans;
        }
}
