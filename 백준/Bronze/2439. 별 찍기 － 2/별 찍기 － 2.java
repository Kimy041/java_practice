import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter(System.out));
		
		
		int N = Integer.parseInt( br.readLine() );
		br.close();
		
		for( int i = 1 ; i<=N ; i++) {
			for( int j = 0 ; j<N-i ; j++) {
				bw.write(" ");
			}
			for( int s = 0 ; s<i ; s++) {
				bw.write("*");
			}
			
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
	}
}