import java.util.*;
public class TwoSum {
    public static boolean haspairEqualToTarget(int []arr,int k){
    int left=0;
    int right=arr.length-1;
    while(left<right){
        int sum=arr[left]+arr[right];
        if(sum==k){
            return true;

        }
        else if(sum<k){
            left++;

        }
        else{
            right--;
        }


    }
    return false;


        
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
            boolean flag=haspairEqualToTarget(arr,k);
            System.out.println(flag);
    }

}
