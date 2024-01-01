import java.io.*;
import java.util.*;

public class Main {

    static int n;
    static int m;
    static int[][] arr;
    static int happySequenceCount;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n][n];

        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i=0; i<n; i++) {
            for (int j=0; j<=n-m; j++) {
                boolean isHappySequence = true;
                for (int k=j+1; k<j+m; k++) {
                    if (arr[i][j] != arr[i][k]) {
                        isHappySequence = false;
                    }
                }

                if (isHappySequence) {
                    happySequenceCount++;
                    break;
                }
            }
        }

        for (int j=0; j<n; j++) {
            for (int i=0; i<=n-m; i++) {
                boolean isHappySequence = true;
                for (int k=i+1; k<i+m; k++) {
                    if (arr[i][j] != arr[k][j]) {
                        isHappySequence = false;
                    }
                }

                if (isHappySequence) {
                    happySequenceCount++;
                    break;
                }
            }
        }

        sb.append(happySequenceCount);

        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}