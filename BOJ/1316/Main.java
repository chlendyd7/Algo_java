import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine()); // 테스트 케이스 수
        int result = 0;
        String inputs;
        for (int i = 0; i < t; i++) {
            inputs = br.readLine();
            if (isGroupWord(inputs)) result++;
        }
        System.out.print(result);
    }

    static boolean isGroupWord(String word) {
        boolean[] seen = new boolean[26];
        char prev = 0;

        for (int i=0; i< word.length(); i++) {
            char c = word.charAt(i);

            if(c != prev) {
                if (seen[c-'a']) {
                    return false;
            }
            seen[c-'a'] = true;
            prev = c;
            }
        }
        return true;
    }
}