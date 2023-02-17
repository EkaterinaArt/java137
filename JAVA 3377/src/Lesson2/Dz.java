package Lesson2;

import javax.swing.*;

public class Dz {
    public static void main(String[] args) {
        int[] nums = {2345,299,507,561,455,666,333};

       int max = nums[0];//integer.MIN_VALUE самое маленькое число в инт -бесконечность

        for (int i = 0; i < nums.length; i++) {

            if( (nums[i]%2)!=0 && max < nums[i]) {
                max = nums[i];
            }
        }
        System.out.println(max);


    }
}
