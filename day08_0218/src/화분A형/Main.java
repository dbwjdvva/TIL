package 화분A형;
import java.util.*;

public class Main {

    public static int maxNum (int curr, int right, int below, int P) {
        return Math.max(curr+right-P, curr+below);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        int testCase = 1;

        while(testCase<=T) {
            String[] np = sc.nextLine().split(" ");
            int N = Integer.parseInt(np[0]);
            int P = Integer.parseInt(np[1]);

            int[][] plants = new int[2][N];
            for(int i=0; i<2; i++) {
                String[] input = sc.nextLine().split(" ");
                for(int j=0; j<N; j++) {
                    plants[i][j] = Integer.parseInt(input[j]);
                }
            }

            for(int j=N-2; j>=0; j--) {
                plants[0][j] = maxNum(plants[0][j], plants[0][j+1], plants[1][j+1], P);
                plants[1][j] = maxNum(plants[1][j], plants[1][j+1], plants[0][j+1], P);
            }

            int max = Math.max(plants[0][0], plants[1][0]);
            System.out.println("#"+testCase+" "+max);
            testCase++;
        }

    }
}
