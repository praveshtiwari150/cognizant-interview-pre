import java.util.Scanner;

public class Pattern14 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(x + " x " +  i + " = " + x*i);
        }
    }
}