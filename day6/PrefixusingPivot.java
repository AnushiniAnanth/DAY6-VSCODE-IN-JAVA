import java.util.Scanner;

public class PrefixusingPivot {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("Enter the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       int total=0;
       int pre=0;
       int suf=0;
       //for(int num:arr)
       for(int i=0;i<n;i++){
        total+=arr[i];
       }
       //for(int num:arr)
       for(int i=0;i<n;i++){
        suf=total-pre-arr[i];
        if(pre==suf){
            int pivot=i;
            System.out.println(pivot);
        }
        pre+=arr[i];

       }


System.out.println("-1");
    
    }

}
