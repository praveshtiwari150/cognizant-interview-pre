import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int[] a1 = new int[n1];
        
        for (int i = 0; i < n1; i++) {
            a1[i] = scn.nextInt();
        }

        int n2 = scn.nextInt();
        int[] a2 = new int[n2];

        for (int i = 0; i < n2; i++) {
            a2[i] = scn.nextInt();
        }

        int[] sum = new int[n1 > n2 ? n1 : n2];
        int c = 0;

        int i = a1.length - 1;
        int j = a2.length - 1;
        int k = sum.length - 1;

        while (k >= 0) {
            int d = c;

            if (i >= 0) {
                d += a1[i];
            }

            if (j >= 0) {
                d += a2[j];
            }

            c = d / 10;
            d = d % 10;

            sum[k] = d;

            i--;
            j--;
            k--;
        }

        if (c != 0) {
            System.out.print(c + "\t");
        }

        for (int val : sum) {
            System.out.print(val + "\t");
        }
    }
}
