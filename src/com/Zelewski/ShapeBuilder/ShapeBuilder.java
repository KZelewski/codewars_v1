package com.Zelewski.ShapeBuilder;

public class ShapeBuilder {
    public static void main(String[] args) {
        int n = 3;

        System.out.println(" ============ 1 ============ ");
        String[][] tab = new String[n][n];
        for(int j = 0 ; j < n ; j++) {
            for (int i = 0; i < n; i++) {
                System.out.print("x");
            }
            System.out.println("");
        }

        System.out.println(" ============ 2 ============ ");

        String result =  "";
        for(int k = 0 ; k < n ; k++) {
            for (int l = 0; l < n; l++) {
                result +="x";
            }
            if(k < n-1){
                result +="\n";
            }
        }
        System.out.println(result);

        System.out.println(" ============ 3 ============ ");
        StringBuilder sb = new StringBuilder();
        for (int m=0; m < n; m++) {
            for (int r = 0; r < n; r++) {
                sb.append("+");
            }
            sb.append("\n");
        }
        System.out.println(sb.toString().trim());

    }

}
