import java.util.*;
import java.util.Scanner;

public class twoPointerExample2 {
    public static int[] twoSum(int[] arr,int tar){
        
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==tar){
                    return new int[]{i,j};
                }
            }
        }
      return new int[]{};

    }
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            System.out.println("Enter the size");
            int n=sc.nextInt();
            int[]arr=new int[n];
            System.out.println("The Array is :");
            for(int i=0;i<n;i++){
                
                arr[i]=sc.nextInt();
            }
            System.out.println("Enter the target:");
            int k=sc.nextInt();
            int[] ind=twoSum(arr,k);
            for(int i=0;i<n;i++){
            System.out.println(ind[i]);
            }

}
}
