package array.leason.one;

import java.util.Arrays;

public class TestArray {
    public static void main(String[] args) {
        int[] ages = new int[0];//number negative pass compilation but not execute program, exception
        double height[] = new double[]{1.0,2.0,3.0};
        long []numbers = {1L,2l,3l};//its possible in unique line
        long[]length;

        //initialize
        int[] ages2 = new int[10];
        System.out.println(ages2[0]);

        ages2[2] = 10;

        System.out.println(ages2[2]);

        System.out.println(ages2.length);

        for (int i=0;i < ages2.length;i++){
            System.out.println(ages2[i]);
        }

        for (int age:ages2) {
            System.out.println(age);
        }


    }
}
