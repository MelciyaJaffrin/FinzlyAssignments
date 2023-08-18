package InheritanceAndPolymorphism;

public class Animal {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	void makeSound() {
		System.out.println("Animal Sound");
	}

}

class Lion extends Animal{
	
	void makeSound() {
		System.out.println("Lion Sound");
	}
}

class Elephant extends Animal{

	public void makeSound() {
		System.out.println("Elephant Sound");
	}
}

class Giraffe extends Animal{

	public void makeSound() {
		System.out.println("Giraffe Sound");
	}
}

