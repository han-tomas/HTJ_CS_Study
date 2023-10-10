import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 2 ; i <=N ; i++)
        {
            while (N % i == 0) {
				System.out.println(i);
				N /= i;
			}
        }
    }
}