package com.Zelewski;

import java.util.Arrays;

public class Mains {


    public static void main(String[] arr) {
        System.out.println("My first task at Codewars");

        int[] myArray = new int[]{1, 2, 3, 4, -5, -4, 0};
        int sum = 0;
        for (int i : myArray) {
            if (i > 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);


        System.out.println("SECOND TASK:");
        String myString = "aawwwwaabbccquu";
        System.out.println(myString);

        int myStringSumVovels = 0;

        for (int j = 0; j < myString.length(); j++) {
            if (myString.charAt(j) == 'a' ||
                    myString.charAt(j) == 'e' ||
                    myString.charAt(j) == 'i' ||
                    myString.charAt(j) == 'o' ||
                    myString.charAt(j) == 'u') {
                myStringSumVovels += 1;
            }
        }

        System.out.println(myStringSumVovels);

        System.out.println("THIRD TASK");

/*        int myVal = 123456;

        if(myVal >= 1) {
            System.out.print(myVal % 10);
            myVal=myVal/10;
            if(myVal >= 1){
                System.out.print(" + " + myVal%10 + "0" );
                myVal=myVal/10;
                if(myVal >= 1){
                    System.out.print(" + " + myVal%10 + "00" );
                    myVal=myVal/10;
                    if(myVal >= 1){
                        System.out.print(" + " + myVal%10 + "000" );
                        myVal=myVal/10;
                        if(myVal >= 1){
                            System.out.print(" + " + myVal%10 + "0000" );
                            myVal=myVal/10;
                            if(myVal >= 1){
                                System.out.print(" + " + myVal%10 + "00000" );
                            }
                        }
                    }
                }
            }
        }*/

        int num = 1034567;
        String[] str = Integer.toString(num).split("");
        String result = "";

        for (int i = 0; i < str.length - 1; i++) {
            if (Integer.valueOf(str[i]) > 0) {
                for (int j = i; j < str.length - 1; j++) {
                    str[i] += '0';
                }
            }
        }
        result = Arrays.toString(str);
        result = result.substring(1, result.length()-1).replace(", 0","").replace(",", " +");
        System.out.println(result);





    }

}