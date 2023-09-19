package main.java.sep15;

// 0,1,1,2,3,5,8 ....
public class RandomClass {
    public static void main(String[] args) {
        int fibonacciNumber = 10;
        int number0 = 0;
        int number1 = 1;
        int i = 0;

        while (i < fibonacciNumber) {
            System.out.print(number0 + ", ");
            int temp = (number0 + number1);
            number0 = number1;
            number1 = temp;
            i++;
        }
    }
}
