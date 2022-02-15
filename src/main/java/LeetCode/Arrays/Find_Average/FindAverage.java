import java.util.Arrays;

public class FindAverage {

    public int findAverage(int []arr){

        Arrays.sort(arr);
        int count =0;
        int firstPosition = 0;
        int lastPosition = arr.length -1;
        int smallest = arr[firstPosition]; count++;
        int largest = arr[lastPosition]; count++;

        while(largest == arr[lastPosition-1]){
            largest += arr[lastPosition -1];
            count ++;
            lastPosition = lastPosition -1;
        }
        while(smallest == arr[firstPosition+1]){
            smallest += arr[firstPosition +1];
            count++;
            firstPosition = firstPosition +1;
        }

        int average = (smallest + largest) / count;
        return average;
    }

    public int findOccurences(int []array) {

        Arrays.sort(array);
        int n = array.length-1;
        int sumOfElements = 0;
        int count = 0;
        int countOfAverageElement = 0;
        int target = 0;

        for (int i = 0 ; i <n ; i ++){
            sumOfElements = sumOfElements + array[i];
            count ++;
        }

        target = sumOfElements / count;

       for (int i = 0 ; i < n ; i ++ ){
           if(array[i] == target){
               countOfAverageElement ++;
           }
       }

        return countOfAverageElement;

    }

    public static void main(String[] args) {
        FindAverage findAverage = new FindAverage();

        System.out.println( findAverage.findOccurences(new int[]{6,2,4,8,4,4,4}));
    }
}
