package com.Zelewski.CreatePhoneNumber;

public class CreatePhoneNumber {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println(" ================ 1 ================");
        String result = "("
                + Integer.toString(numbers[0])
                + Integer.toString(numbers[1])
                + Integer.toString(numbers[2]) + ") "
                + Integer.toString(numbers[3])
                + Integer.toString(numbers[4])
                + Integer.toString(numbers[5]) + "-"
                + Integer.toString(numbers[6])
                + Integer.toString(numbers[7])
                + Integer.toString(numbers[8])
                + Integer.toString(numbers[9]);
        System.out.println(result);

        System.out.println(" ================ 2 ================");
        String result2 = "(xxx) xxx-xxxx";
        for(int i: numbers){
            result2 = result2.replaceFirst("x",Integer.toString(i));
        }
        System.out.println(result2);
    }
}
