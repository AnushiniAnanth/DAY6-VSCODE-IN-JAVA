import java.util.Scanner;
import java.util.Arrays;

public class RunningSumOfAnArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int n=sc.nextInt();
        int[]arr=new int[n];
        System.out.println("The Array is :");
        for(int i=0;i<n;i++){
            
            arr[i]=sc.nextInt();
        }
     
        
        int []prefix=new int[n];
    
        for(int i=0;i<n;i++){
            if(i==0){
                prefix[i]=arr[i];
            }
            else{
                prefix[i]=prefix[i-1]+arr[i];
            }
            
        }
        System.out.println("the running sum of index is "+  Arrays.toString(prefix));
        
    }

}
