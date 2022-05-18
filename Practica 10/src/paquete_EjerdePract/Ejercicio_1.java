package paquete_EjerdePract;

public class Ejercicio_1 {

	public static void main(String[] args) {
		Animal animal1 = new Animal("Animalito",1);
		Dog animal2 = new Dog("Scooby","Gran Danes",2);
		Cat animal3 = new Cat("Garfield","Persa",3);
		
		animal1.eat(); //Metodo clase secundaria
		animal1.sleep(); //Metodo clase principal
		System.out.println("");
		animal2.eat(); //Metodo clase secundaria
		animal2.sleep(); //Metodo clase principal
		System.out.println("");
		animal3.eat(); //Metodo clase secundaria
		animal3.sleep(); //Metodo clase principal
	}
}
