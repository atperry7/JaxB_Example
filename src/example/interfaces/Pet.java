package example.interfaces;

public interface Pet {

	public String noise();
	
	default public void nap() {
		System.out.println("zzz...");
	}
}
