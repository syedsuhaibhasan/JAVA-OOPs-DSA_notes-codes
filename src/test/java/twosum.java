/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author humai
 */
public class twosum {
    public int[] twoSum(int[] nums,int target) {
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = 0; j < nums.length-1; j++) {
                if (nums[i]>nums[i+1]) {
                    int temp = nums[i];
                    nums[i]=nums[i+1];
                    nums[i+1]=temp;
                }
            }
        }
        int[] temp = null;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]+nums[i+1]==target) {
                for (int j = i; j < i+1; j++) {
                    int count=0;
                    temp[i]=nums[j];
                    break;
                }
            }
        }
        return temp;
    }
    public static void main(String[] args) {
        twosum obj = new twosum();
        int[] nums = {7,2,9,8};
        int[] sorted = obj.twoSum(nums,10);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
