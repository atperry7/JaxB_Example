package example.concurrency.sync;

import java.util.ArrayList;
import java.util.List;

public class Messages {

	private List<String> messages = new ArrayList<String>();
	
	synchronized public void addMessage(String s) {
		
		try {
			System.out.println("Waiting to add message : " + s);
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		messages.add(s);
	}
	
	synchronized public List<String> getMessages() {
		return messages;
	}
	
}
