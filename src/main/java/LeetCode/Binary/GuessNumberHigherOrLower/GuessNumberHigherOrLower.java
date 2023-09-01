package main.java.LeetCode.Binary.GuessNumberHigherOrLower;

public class GuessNumberHigherOrLower {
    public int guessNumber(int n) {
        int start=0,end=n;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            int x= guess(mid);
            if(x==0)
            {
                return mid;
            }
            else if(x==-1)
            {
                end=mid-1;
            }
            else
            {
                start = mid+1;
            }
        }
        return -1;
    }

    private int guess(int num){
        int pickedNum  = 6;

        if (num == pickedNum) return 0;
        if (num < pickedNum) return 1;
        return  -1;
    }

}
