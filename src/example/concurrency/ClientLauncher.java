package example.concurrency;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientLauncher {

	public static void main(String[] args) throws UnknownHostException, IOException, InterruptedException {
		
		try(Socket s = new Socket("10.1.1.127", 4554)) {
			
			DataInputStream in = new DataInputStream(s.getInputStream());
			System.out.println("Server said : " + in.readUTF());
			
			Thread.sleep(5000);
			
			DataOutputStream out = new DataOutputStream(s.getOutputStream());
			out.writeUTF("Mice to Neet U!");
			
		}
		
	}
	
}
