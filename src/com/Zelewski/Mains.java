package com.Zelewski;

public class Mains {


    public static void main(String[] arr) {
        System.out.println("My first task at Codewars");

        int[] myArray = new int[]{1,2,3,4,-5,-4,0};
        int sum = 0;
        for(int i: myArray){
            if(i>0){
                sum = sum + i;
            }
        }
        System.out.println(sum);

    }
}
