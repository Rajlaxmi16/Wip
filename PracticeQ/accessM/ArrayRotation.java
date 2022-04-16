package com.simpli.accessM;

class RotateArray { 
    public void rotate(int[] nums, int k) {
        if(k > nums.length) { // 3>7 
            k=k%nums.length;
        }
        int[] result = new int[nums.length];//result array of size 7
        for(int i=0; i < k; i++){
            result[i] = nums[nums.length-k+i];
        }
        int j=0;
        for(int i=k; i<nums.length; i++){
            result[i] = nums[j];
            j++;
        }
        System.arraycopy( result, 0, nums, 0, nums.length );
    }
} 
public class ArrayRotation
{
    public static void main(String[] args) {
        RotateArray r = new RotateArray();
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 }; 
        r.rotate(arr, 3); 
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}



