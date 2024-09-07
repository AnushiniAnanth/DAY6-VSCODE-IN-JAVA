import java.util.Scanner;
public class BuyandSell {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("Enter the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int buyprice=arr[0];
        int max=0;
        for(int i=0;i<n;i++){
            if(buyprice > arr[i]){
                buyprice=arr[i];
            }
           max=Math.max(max,arr[i]-buyprice);

        }
        System.out.println("The max value is "+max);
    }

}
