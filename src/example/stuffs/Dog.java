package example.stuffs;

import example.interfaces.Pet;

public class Dog implements Pet {
	
	private int age;
	private int dogNaps;
	
	public Dog(int age) {
		this.age = age;
	}

	//GETTERS & SETTERS
	
	public int getDogNaps() {
		return dogNaps;
	}

	public void setDogNaps(int dogNaps) {
		this.dogNaps = dogNaps;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age > 20)
			throw new RuntimeException("dude what");
		this.age = age;
	}

	
	
	public void nap() {
		dogNaps++;
		System.out.println("zzzzz...");
	}
	
	
	public static void staticBap() {
		//dogNaps++;
		System.out.println("BLAW!");
	}


	public void jump() {
		System.out.println("boing!");
	}
	
	@Override
	public String noise() {
		return "woof!";
	}

		
}
