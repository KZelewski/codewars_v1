package com.Zelewski.HighestAndLowest;

public class HighestAndLowest {
    public static void main(String[] args) {
        String numbers = "8 3 -5 42 -1 0 0 -9 4 7 4 -4";
        String[] str2 = numbers.split(" ");

        int lowest = Integer.valueOf(str2[0]);
        int highest = Integer.valueOf(str2[0]);

        for(int i = 0; i < str2.length; i++){
            System.out.println(str2[i]);

        if(Integer.valueOf(str2[i]) < lowest){
            lowest = Integer.valueOf(str2[i]);
            }

        if(Integer.valueOf(str2[i]) > highest){
            highest = Integer.valueOf(str2[i]);
            }
        }

        System.out.println(highest + " " + lowest);
    }
}
