package 준홍이의카드놀이7102;
import java.util.*;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        int testCase = 1;
        while(testCase<=T) {
            String[] input = sc.nextLine().split(" ");
            int N = Integer.parseInt(input[0]);
            int M = Integer.parseInt(input[1]);

            System.out.print("#"+testCase);
            for(int i=Math.min(N+1,M+1); i<=Math.max(N+1, M+1); i++) {
                System.out.print(" "+i);
            }
            System.out.println();
            testCase++;
        }
    }
}
