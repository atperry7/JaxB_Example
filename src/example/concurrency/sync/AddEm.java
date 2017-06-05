package example.concurrency.sync;

import java.util.concurrent.atomic.AtomicInteger;

public class AddEm implements Runnable {

	private Messages messages;
	private AtomicInteger atomInt;
	
	@Override
	public void run() {
		
		messages.addMessage("Hello from Thread " + atomInt.incrementAndGet());

	}

	public AddEm(Messages messages, AtomicInteger atomInt) {
		super();
		this.messages = messages;
		this.atomInt = atomInt;
	}

}
