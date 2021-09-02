package com.Zelewski.SnailCrawlsUp;

public class SnailCrawlsUp {
    public static void main(String[] args) {
        int column = 10;
        int day = 3;
        int night = 1;

        int columnBySnail = 0;
        int dayBySnail = 0;

        System.out.println("RESULT");
        do{
            columnBySnail += day;
            dayBySnail ++;
            if(columnBySnail < column){
                columnBySnail -= night;
            }
        } while ( columnBySnail < column);

        System.out.println(dayBySnail);



    }
}
