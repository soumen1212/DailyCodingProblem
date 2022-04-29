import java.util.Arrays;
import java.util.Scanner;

public class SumReturn {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        boolean ans=getans(arr,k);
        System.out.println(ans);
    }

    private static boolean getans(int[] arr, int k) {

        Arrays.sort(arr);
        int i=0;
        int j= arr.length-1;
        while(i<j){
            if(arr[i]+arr[j]==k){
                return true;
            }else if(arr[i]+arr[j]<k){
                i++;
            }else{
                j--;
            }
        }
        return false;
    }
}
