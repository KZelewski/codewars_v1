package com.Zelewski.ArrayDiff;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayDiff {

    public static void main(String[] args) {
        // https://codecouple.pl/2017/12/15/2-java-performance-tablica-vs-lista/
        int[] a = {1,2,3,4,5,6,6};
        int[] b = {1,6,6};
        System.out.println("Before diff");
        System.out.println(Arrays.toString(a));

        List<Integer> listA = Arrays.stream(a).boxed().collect(Collectors.toList());
        List<Integer> listB = Arrays.stream(b).boxed().collect(Collectors.toList());
        System.out.println("List A" + listA);
        System.out.println("List B" + listB);

        listA.removeAll(listB);

        a = listA.stream().mapToInt(y -> y).toArray();

        System.out.println("After diff");
        System.out.println(Arrays.toString(a));


    }

}