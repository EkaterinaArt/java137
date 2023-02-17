package lesson4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int[]num = new int[3];

        System.out.println(" ¬ведите число");
        num[3] = sc.nextInt();
        int nums []={-450,44,-33,-55,8,6,330};

        double max = -1.0/ 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]%2!=0 && max<nums[i]);
            if (max<nums[i]){
               max = nums[i];
           }
        System.out.println(max);
        }

//
//        int sum = 0;
//        for (int i = 0; i < nums.length; i++) {
//            sum+=nums[i];
//
//        }
//        System.out.println((double) sum/ nums.length);
//        System.out.println(nums[5]);
//        System.out.println(nums.length);
//        for (int i = 0; i < nums.length; i++) {
//            nums[i]=i;
//            System.out.println(nums[i]);
    //}


    }

