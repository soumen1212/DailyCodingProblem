import java.util.Scanner;

public class productOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int ans[]=product(arr);
        System.out.println(ans.toString());
    }

    private static int[] product(int[] arr) {

        int ans[]= new int[arr.length];
        for(int i=0;i<arr.length;i++){

            //leftside
            int currIndex=i;
            int tempans=1;
            for(int j=currIndex-1;i>=0;i--){
                tempans=tempans*arr[j];
            }

            //rightside

            for(int j=currIndex+1;j<arr.length;j++){
                tempans=tempans*arr[j];
            }
            ans[i]=tempans;



        }
        return ans;
    }

}
