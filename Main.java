package lesson3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums= {1,4,5,7,3};
        System.out.println(nums);
        int x = nums[0];
        nums[0] = nums[nums.length-1];
        nums[nums.length-1] = x;
        System.out.println(Arrays.toString(nums));
        int sum=nums[0]+nums[2];
        System.out.println(sum);
    }
}
