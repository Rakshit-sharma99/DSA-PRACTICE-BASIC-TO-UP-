package SORTING;
import java.util.Scanner;
public class selection {


    public static void selectionSort(int[]arr){
        int n =arr.length;
        for(int i =0; i<n; i++){
            int min  = i;
            for(int j =i+1; j<n; j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp = arr[min];
            arr[min]= arr[i];
            arr[i]= temp;
        }
        for(int num: arr){
            System.out.println(num +" ");
        }
    }
    public static void main(String[] args) {
                int[] arr = {13, 46, 24, 52, 20, 9};
              System.out.println("Before selection sort:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Call selection sort
        selectionSort(arr);
    }
}
