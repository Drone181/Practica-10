package paquete_EjerdePract;

public class Ejercicio_2 {

	public static void main(String[] args) {
		Animal animal;
		animal = new Dog("Scooby","Gran Danes",3);
		
		/*animal.breed();*/ //Provoca un error, pues se requiere que exista este metodo de igual manera en la clase padre
		animal.eat(); // Este metodo se sobreescrito por el metodo de la clase hija
		animal.sleep(); // muestra en pantalla lo que esta escrito en el metodo de la clase Animal
	}
}
