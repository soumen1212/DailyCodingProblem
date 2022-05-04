import java.util.Arrays;
import java.util.Scanner;
//dailyCodingProblem 4
public class MissingInteger {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);
        int minElem=arr[0];
        int ans=getans(arr,minElem);
        System.out.println(ans);
    }

    private static int getans(int[] arr, int minElem) {


        int ans=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=minElem){
                ans=minElem;
                return ans;
            }
            minElem++;
        }
        return ans;
    }
}
