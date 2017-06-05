package example.stuffs;

import example.interfaces.Pet;

public class Launcher {

	public static void main(String[] args) {
		
		Pet[] petz = new Pet[4];
		Dog myDawg = new Dog(5);
		
		myDawg.setAge(12);
		
		petz[0] = new Cat(1043);
		petz[1] = new Cat(1);
		petz[2] = myDawg;
		petz[3] = new Dog(5);
		
		Dog.staticBap();
		
		for(Pet p : petz) {
			p.nap();
		}
		
		System.out.println(myDawg.getDogNaps());
		
	}
	
}
