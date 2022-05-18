package paquete_EjerdePract;

public class Dog extends Animal{
	public Dog(String name,String breed,int age) {
		super(name,age);
	}
	
	@Override
	public void eat() {
		System.out.println(name+" is eating Pedigree");
	}
	
	public void breed() {
		System.out.println(name+" is a great dane");
	}
	
	public void bark() {
		System.out.println(name+": Woof");
	}
}
