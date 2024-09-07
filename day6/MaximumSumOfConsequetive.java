import java.util.Scanner;
public class MaximumSumOfConsequetive {
    public static int max(int[] arr,int k,int n){
        if(n<k){
            return -1;

        }
        int maxSum=0;
        for(int i=0;i<k;i++){
            maxSum+=arr[i];

        }
        int windowSum=maxSum;
        for(int i=k;i<n;i++){
            windowSum+=arr[i]-arr[i-k];
            maxSum=Math.max(maxSum,windowSum);
        }
        return maxSum;

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
            System.out.println("Enter the element:");
            int k=sc.nextInt();
           int maxSum=max(arr,k,n);
           System.out.println("The naximum sum is "+maxSum);

         
    }

}
