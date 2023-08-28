package main.java.LeetCode.Stack.BaseballGame;

import java.util.ArrayList;
import java.util.List;

public class BaseballGame {
    public int calPoints(String[] operations) {
        int result = 0;
        int pointer =-1;
        List<Integer> resultArray = new ArrayList<>();
        for (String s: operations) {
            if (isNumeric(s)) {
                resultArray.add(Integer.parseInt(s));
                pointer++;
                System.out.println("Added Integer : " +Integer.parseInt(s)  + " Pointer value is  : " +  pointer);
            }
            switch (s) {
                case "+" : {
                    int val1 = resultArray.get(pointer);
                    int val2 = resultArray.get(pointer - 1);
                    System.out.println("Value 1 :  " + val1 + " and Value 2 :  " +  val2);
                    resultArray.add(val1+ val2);
                    pointer++;
                    System.out.println(resultArray);
                    break;
                }
                case "C" : {
                    int removal = resultArray.get(pointer);
                    resultArray.remove(pointer);
                    System.out.println("Removed element : " + removal + " pointer is now  : " + pointer);
                    pointer--;
                    break;
                }
                case "D" : {
                    System.out.println("Pointer value : " + pointer);
                    int doubleValue =  resultArray.get(pointer) * 2;
                    resultArray.add(doubleValue);
                    pointer++;
                    break;
                }
            }
            System.out.println(resultArray);
        }
        for (Integer i:resultArray) {
            result+=i;
        }

        return result;
    }

    public boolean isNumeric(String string) {
        boolean numeric = true;
        try {
            Double num = Double.parseDouble(string);
        } catch (NumberFormatException e) {
            numeric = false;
        }

        if(numeric)
            System.out.println(string + " is a number");
        else
            System.out.println(string + " is not a number");

        return numeric;
    }
    }


