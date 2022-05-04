import java.util.Arrays;
import java.util.Scanner;


//dailyCodingProblem 5
public class FirstAndLast {

    static class cons{
        int a;
        int b;
        public cons(int a, int b){
            this.a=a;
            this.b=b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("for car enter 1 else press anything");
        int input=sc.nextInt();
        int ans=-1;
        if(input==1){
            int a=sc.nextInt();
            int b=sc.nextInt();
             ans=car(new cons(a,b));
        }else{
            int a=sc.nextInt();
            int b=sc.nextInt();
             ans=cdr(new cons(a,b));
        }
        System.out.println(ans);

    }

    private static int car(cons cons) {

        return Math.min(cons.a, cons.b);
    }
    private static int cdr(cons cons) {

        return Math.min(cons.a, cons.b);
    }
}
