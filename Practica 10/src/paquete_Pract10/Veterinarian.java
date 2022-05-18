package paquete_Pract10;

import paquete_EjerdePract.Animal;

public class Veterinarian {
	String name;
	double salary;
	
	public Veterinarian(String name,double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public void vaccinated(Animal animal) {
		animal.setVaccinated(true);
		System.out.println(animal.getName()+" was vaccinated");
	}
	
	public void shower(Animal animal) {
		animal.setBath(true);
		System.out.println(animal.getName()+" has been bathed");
	}
	public void consulta() {
		System.out.println("El veterinario reviso al animal");
	}
}
