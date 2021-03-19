import java.net.*;
import java.io.*;
import java.util.*;

public class ClientSide{
	public static void main(String[] args) throws IOException{
		Socket s = new Socket("localhost", 8080);
		
		PrintWriter pr = new PrintWriter(s.getOutputStream());
		pr.println("Hello");
		pr.flush();

		InputStreamReader in = new InputStreamReader(s.getInputStream());
		BufferedReader bf = new BufferedReader(in);

		String str = bf.readLine();
		System.out.println("server: "+str);
	}
}