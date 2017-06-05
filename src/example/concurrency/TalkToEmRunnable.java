package example.concurrency;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedList;
import java.util.List;

public class TalkToEmRunnable implements Runnable {

	private Socket clientConnection;
	private List<String> messages;
	
	public TalkToEmRunnable(Socket clientConnection, List<String> whatDidTheySay) {
		super();
		this.clientConnection = clientConnection;
		this.messages = whatDidTheySay;
	}

	@Override
	public void run() {

		System.out.println("Client Connected! We got one boss!");

		try {

			DataOutputStream out = new DataOutputStream(clientConnection.getOutputStream());

			out.writeUTF("Hello!");

			DataInputStream in = new DataInputStream(clientConnection.getInputStream());

			String clientSaid = in.readUTF();
			System.out.println("Client says: " + clientSaid);
			
			messages.add(clientSaid);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
