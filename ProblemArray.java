import java.util.*;
public class ProblemArray {
    public static void main(String args[]) {

        int[] a = new int[n];

        int sum=0;
        int sumOfNums= n*(n+1)/2;       //can't be change

        for (int i=0; i<n; i++) {
            a[i] = sc.nextInt();
            sum = sum+a[i];
        }

        System.out.println(sumOfNums-sum);

    }
}
