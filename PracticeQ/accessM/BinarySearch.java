package com.simpli.accessM;

public class BinarySearch {
    public static  void main(String[] args){
        int[] arr = {3,6,9,12,15};
        int key = 9;
        int arrlength = arr.length-1;
        binarySearch(arr,0,key,arrlength);
    }
    public static void binarySearch(int[] arr, int start, int key, int length){
        int midValue = (start+length)/2;
        while(start<=length){
            int m = arr[midValue];
            System.out.println(m);
            if(m<key){
                start = midValue + 1;
            } else if(arr[midValue]==key){
                System.out.println("Element is found at index :"+midValue);
                break;
            }else {
                length=midValue-1;
            }
            midValue = (start+length)/2;
        }
        if(start>length){
            System.out.println("Element is not found");
        }
    }
}


