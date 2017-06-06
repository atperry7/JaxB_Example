package example.concurrency;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.SocketTimeoutException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ConcurrentLauncher {

	public static void main(String[] args) throws IOException {

		List<String> whatDidTheySay = Collections.synchronizedList(new LinkedList<String>());
		
		
		
		try (ServerSocket server = new ServerSocket(4554)) {

			while (true) {
				System.out.println("Waiting...");
				server.setSoTimeout(10000);
				Runnable client = new TalkToEmRunnable(server.accept(), whatDidTheySay);

				new Thread(client).start();
			}
		} catch(SocketTimeoutException ex) {
			System.out.println("Nobody connected :(");
			
			System.out.println("My messages are :");
			for(String message : whatDidTheySay) {
				System.out.println("\t" + message);
			}
		}
	}

}
