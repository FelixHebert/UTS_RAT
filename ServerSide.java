import java.net.*;
import java.io.*;

public class ServerSide{
	public static void main(String[] args) throws IOException{
		ServerSocket ss = new ServerSocket(8080);
        Socket s = ss.accept();

        InputStreamReader in = new InputStreamReader(s.getInputStream());
		BufferedReader bf = new BufferedReader(in);

		String str = bf.readLine();
		System.out.println("client: "+str);

        PrintWriter pr = new PrintWriter(s.getOutputStream());
		pr.println("Diterima");
		pr.flush();
	}
}
