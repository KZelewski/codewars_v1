package com.Zelewski.DisemvovelTrolls;

public class DisemvovelTrolls {

    public static void main(String[] args) {

        System.out.println(" ================ 1 ================");
        String str = "This website is for losers LOL";
        int strLen = str.length();
        String result = "";
        for(int i = 0; i< strLen ; i++) {

            if (!(str.charAt(i) == 'A' || str.charAt(i) == 'a' ||
                    str.charAt(i) == 'E' || str.charAt(i) == 'e' ||
                    str.charAt(i) == 'I' || str.charAt(i) == 'i' ||
                    str.charAt(i) == 'O' || str.charAt(i) == 'o' ||
                    str.charAt(i) == 'U' || str.charAt(i) == 'u')) {
                //str = str.substring(i + 1);
                System.out.println("Element " + i +" is vovel");
                result = result + str.charAt(i);
                System.out.println(result);
            } else {
                System.out.println("Element " + i + " is not vovel");

            }
        }
        System.out.println(" ================ 2 ================");

        String result2 = str.replaceAll("[aeiouAEIOU]","");
        System.out.println(result2);

    }
}
