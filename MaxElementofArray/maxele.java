package demo1;
import java.util.*;
public class demo{
    public static void main(String args[]){
        System.out.println("hello this is demo");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        System.out.println("enter the elements");
        for(int i=0; i<n-1; i++){
            arr1[i]=sc.nextInt();
        }
        if(n==0){
            System.out.println("there are no elements are there to find max");
        }
        else{
            int max = arr1[0];
            for(int k=1;k<n-1;k++){
                if(max<arr1[k]){
                    max = arr1[k];
                }
            }
            System.out.println("the maximum element of an array is " + max);
        }
        sc.close();

    }
}