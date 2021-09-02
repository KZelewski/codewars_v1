package com.Zelewski.StringReverse;

public class StringReverse {


    public static void main(String[] str2) {
        String str = "ABC";

        System.out.println("STRING REVERSE");
        String[] strTab = str.split("");
        String strRev = "";

        System.out.println("CHECK");
        for(int i = 0; i < str.length(); i++){
            strRev = strRev + strTab[str.length() - 1 -i];
        }
        System.out.println(strRev);

        //    return new StringBuilder(str).reverse().toString();
    }
}
