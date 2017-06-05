package example.stuffs;

public class DataTester {
	
	public static void main(String[] args) {
		
		//Using String
		Box<String> box = new Box<String>();
		
		box.setData("generic!");
		
		System.out.println(box.getData());
		
		
		//Using Cat
		Box<Cat> catBox = new Box<Cat>();
		
		//catBox.setData("hello");
		
		System.out.println(catBox.getData());
		
	}
	
}
