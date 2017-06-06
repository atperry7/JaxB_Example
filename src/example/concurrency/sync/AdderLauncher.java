package example.concurrency.sync;

import java.util.concurrent.atomic.AtomicInteger;

public class AdderLauncher {

	public static void main(String[] args) throws InterruptedException {
		
		Messages msgs = new Messages();
		AtomicInteger counter = new AtomicInteger(0);
		
		Thread t = new Thread(new AddEm(msgs, counter));
		Thread tt = new Thread(new AddEm(msgs, counter));
		Thread ttt = new Thread(new AddEm(msgs, counter));
		Thread tttt = new Thread(new AddEm(msgs, counter));
		Thread ttttt = new Thread(new AddEm(msgs, counter));
		
		t.start();
		tt.start();
		ttt.start();
		tttt.start();
		ttttt.start();
		
		t.join();
		tt.join();
		ttt.join();
		tttt.join();
		ttttt.join();
		
		System.out.println("Total count is: " + counter.get());
		
		System.out.println("Total messages are : " + msgs.getMessages().size());

	}
	
}
