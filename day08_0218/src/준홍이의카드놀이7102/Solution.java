package 준홍이의카드놀이7102;
//SWEA7102
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        int testCase = 1;
        while(testCase<=T) {
            String[] input = sc.nextLine().split(" ");
            int N = Integer.parseInt(input[0]);
            int M = Integer.parseInt(input[1]);
            int[] sums = new int[N*M];
            for(int i=1; i<=N; i++) {
                for(int j=1; j<=M; j++) {
                    sums[i+j]++;
                }
            }
            int[] sumsFreq = Arrays.copyOf(sums, sums.length);
            Arrays.sort(sumsFreq);

            StringBuilder sb = new StringBuilder();
            sb.append("#"+testCase);

            int maxFreq = sumsFreq[sumsFreq.length-1];
            for(int i=0; i<sums.length; i++) {
                if(sums[i]==maxFreq) {
                    sb.append(" ").append(i);
                }
            }
            System.out.println(sb);
        testCase++;
         }
    }
}
