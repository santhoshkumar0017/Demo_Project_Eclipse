package oops;

abstract class Animales{
	abstract void sound();
	void eat() {
		System.out.println("This animal is eating.");
	}
}
class Dogs extends Animales{
	void sound() {
		System.out.println("Woof!");
	}
}
public class DemoAbstract {

	public static void main(String[] args) {
	//	Animal animal=new Animal(); cannot inheritance abstract class
		Dogs dog=new Dogs();
		dog.sound();
		dog.eat();
	}
}
