package paquete_EjerdePract;

public class Ejercicio_4 {

	public static void main(String[] args) {
		Animal [] animalArray = new Animal[3];
		animalArray[0] = new Animal("An animal",1); 
		animalArray[1] = new Dog("Chispitas","Chihuahua",4);
		animalArray[2] = new Cat("Miau","Persa",2);
		
		for(Animal a: animalArray) {
			a.eat();
			
			if(a instanceof Dog) {
				((Dog) a ).bark();
			}
		}
	}
}
