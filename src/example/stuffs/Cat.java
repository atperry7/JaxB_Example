package example.stuffs;

import example.interfaces.Pet;

public class Cat implements Pet {

	int age;

	public Cat(int age) {
		this.age = age;
	}

	@Override
	public String noise() {
		return "meow!";
	}
	
}
