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


        System.out.println("SECOND TASK:");
        String myString = "aawwwwaabbccquu";
        System.out.println(myString);

        int myStringSumVovels = 0;

        for(int j=0; j<myString.length(); j++){
            if(myString.charAt(j) == 'a'||
                    myString.charAt(j) == 'e' ||
                    myString.charAt(j) == 'i' ||
                    myString.charAt(j) == 'o' ||
                    myString.charAt(j) == 'u'){
                myStringSumVovels += 1;
            }
        }

        System.out.println(myStringSumVovels);




    }
}
