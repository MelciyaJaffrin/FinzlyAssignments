package InheritanceAndPolymorphism;

public class Zoo {
	public static void main(String args[]) {
		Animal a=new Animal();
		a.makeSound();
		Lion l = new Lion();
		l.setName("Lion");
		System.out.println("Animal name is: "+l.getName());
		l.setAge(30);
		System.out.println("Animal age is: "+l.getAge());
		l.makeSound();
		Elephant e=new Elephant();
		e.setName("Elephant");
		System.out.println("Animal name is: "+e.getName());
		e.setAge(90);
		System.out.println("Animal age is: "+e.getAge());
		e.makeSound();
		Giraffe g=new Giraffe();
		g.setName("Giraffe");
		System.out.println("Animal name is: "+g.getName());
		g.setAge(50);
		System.out.println("Animal age is: "+g.getAge());
		g.makeSound();
	}

}
