package paquete_EjerdePract;

public class Animal {
	String name;
	int age;
	boolean vaccinated;
	boolean bath;
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
		vaccinated = false;
		bath = false;
	}
	
	public String getName() {
		return name;
	}
	
	public void setVaccinated(boolean b) {
		this.vaccinated = b;
	}
	public boolean getVaccinated() {
		return vaccinated;
	}
	
	public void eat() {
		System.out.println(name+" is eating");
	}
	
	public void sleep() {
		System.out.println(name+" is sleeping");
	}

	public void setBath(boolean b) {
		this.bath = b;
	}
}
