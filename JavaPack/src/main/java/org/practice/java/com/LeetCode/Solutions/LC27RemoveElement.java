package org.practice.java.com.LeetCode.Solutions;

public class LC27RemoveElement {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        int i = 0;
        while(nums[i] != -1 && i < nums.length) {
            if(nums[i] != val){
                count++;
                i++;
            } else {
                nums[i] = -1;
                shuffle(nums, i);
            }
        }
        return count;
    }

    void shuffle(int[] nums, int i){
        if(i == nums.length - 1) return;
        boolean flag = true;
        int k = nums.length-1;
        while(flag){
            if(k <= i) return;
            if(nums[k] != -1){
                swap(nums, i, k);
                flag = false;
            } else {
                k--;
            }
        }
    }

    void swap(int[] nums, int i, int k){
        int temp;
        temp = nums[i];
        nums[i] = nums[k];
        nums[k] = temp;
    }
}
