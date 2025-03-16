public class Polymorphism {
	public static void main(String[] args) {
		Animal d = new Dog();
		d.speak();
		// d.bark(); 		error as bark is not a method in Animal class 
		((Dog)d).bark();	// downcasting to use method of subclass not available in parent class 
	}

}

class Animal {
	public void speak() {
		System.out.println("Animal speaks");
	}
}

class Dog extends Animal {
	public void speak() {
		System.out.println("Dog speaks");

	}

	public void bark(){
		System.out.println("The dog barks");
	}
}