package paquete_EjerdePract;

public class Penguin extends Animal{
	public Penguin(String name,int age) {
		super(name,age);
	}
	
	@Override
	public void eat() {
		System.out.println(name+" is eating fish");
	}
}
