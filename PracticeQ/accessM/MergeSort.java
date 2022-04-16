package com.simpli.accessM;


public class MergeSort {
    static int count=0;;
    void merge(int arr[], int first, int mid, int rear)
    {
        int n1 = mid - first + 1;//0-0+1=1
        int n2 = rear - mid;//5-0=5
        /* Create temp arrays */
        int L[] = new int [n1];//1
        int R[] = new int [n2];//5
        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i)
            L[i] = arr[first + i];//arr[0+0]=arr[0]=12
        for (int j=0; j<n2; ++j)
            R[j] = arr[mid + 1+ j];
        //arr[0+1+0]=11
        //arr[0+1+1]=13
        //arr[0+1+2]=5
        //arr[0+1+3]=6
        //arr[0+1+4]=7
        System.out.println("inside merge");
        int i = 0, j = 0;
        int k = first;//0
        while (i < n1 && j < n2)//(0<1 && 0<5)--(0<1 && 1<5)
        {
            if (L[i] <= R[j])
                //L[i] < R[j] ==L[0]<R[0] ---> 12<11
                //L[i] < R[j] ==L[0]<R[1] ---> 12<13
            {
                
                System.out.println(L[i]);//12
                System.out.println(R[j]);//13
                arr[k] = L[i];//arr[1]=12
                i++;//1
            }
            else
            {
                arr[k] = R[j];//arr[0]=11
                j++;//j=1
            }
            k++;//1
        }

        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }

    }
    void sort(int arr[], int l, int r)
    {
        
        if (l < r)
        {
            int m = (l+r)/2;//2,1,0
            sort(arr, l, m);
            System.out.println(count);
            count++;
            sort(arr , m+1, r);
            System.out.println(m);
            System.out.println("Passing for merging");
            merge(arr, l, m, r);
        }
    }
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

public static void main(String args[])
    {
        int arr[] = {12, 11, 13, 5, 6, 7};
        System.out.println("Given Array");
        printArray(arr);
        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length-1);
        System.out.println("\nSorted array");
        printArray(arr);
    }
}


