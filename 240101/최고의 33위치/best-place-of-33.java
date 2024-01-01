import java.io.*;
import java.util.*;

public class Main {

    static int N;
    static int[][] arr;
    static int maxCoin;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];

        for (int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i=0; i<=N-3; i++) {
            for (int j=0; j<=N-3; j++) {
                int count = 0;
                for (int k=i; k<i+3; k++) {
                    for (int l=j; l<j+3; l++) {
                        if (arr[k][l] == 1) {
                            count++;
                        }
                    }
                }

                maxCoin = Math.max(maxCoin, count);
            }
        }

        sb.append(maxCoin);

        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}