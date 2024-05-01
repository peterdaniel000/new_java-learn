package com.learn.java;
public class dan {
    public static void main(String[] args) {
        int index = 0;
        String[] fruits = {"mango", "orange", "apple","pearl"};
        int lengths = fruits.length;
        while (lengths > index) {
            System.out.println("value of the arrays are: "+ fruits[index]);
            index++;
        }

        int[][] numbers = {{1,2,3,4}, {5,6,7,8}};
        System.out.println(numbers[0][1]);

        for (index = 0; lengths > index; index++) {
            System.out.println("value of the arrays are: "+ fruits[index]);
        }
    }
}