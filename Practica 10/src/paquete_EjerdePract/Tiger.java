package paquete_EjerdePract;

public class Tiger extends Animal{
	public Tiger(String name,int age) {
		super(name,age);
	}
	
	@Override
	public void eat() {
		System.out.println(name+" is eating pork");
	}
}
