package paquete_Pract10;

import java.util.ArrayList;
import java.util.Scanner;
import paquete_EjerdePract.Animal;
import paquete_EjerdePract.Cat;
import paquete_EjerdePract.Dog;
import paquete_EjerdePract.Lion;
import paquete_EjerdePract.Penguin;
import paquete_EjerdePract.Tiger;

public class Main {

	public static void main(String[] args) {
		Scanner tl = new Scanner(System.in);
		int o=0;
		boolean s=false;
		ArrayList <Animal> animales = new ArrayList<Animal>(10);
		llenarArrayList(animales);
		Zoo z1 = new Zoo(animales);
		
		do {
			System.out.println("+++++++++Menu+++++++++\n\n1.Mostrar animales"
					+ "\n2.Agregar animal\n3.Eliminar animal\n4.Vacunar animales\n5.Salir");
			o = tl.nextInt();
			
			switch(o){
			case 1:
				System.out.println("");
				z1.mostrar();
				break;
			case 2:
				z1.agregar();
				break;
			case 3:
				z1.eliminar();
				break;
			case 4:
				z1.vacunar(animales);
				break;
			case 5:
				System.out.println("\nHasta Pronto!!!");
				s=true;
				break;
			default:
				System.out.println("\n#########Ingrese una opcion valida#########\n");
				break;
			}
		}while(s==false);
	}
	
	public static void llenarArrayList(ArrayList<Animal> animales) {
		Animal Dog1 = new Dog("Scooby","Gran Danes",2);
		animales.add(Dog1);
		Animal Cat1 = new Cat("Michi","Persa",4);
		animales.add(Cat1);
		Animal Lion1 = new Lion("Simba",6);
		animales.add(Lion1);
		Animal Penguin1 = new Penguin("Happy Feet",3);
		animales.add(Penguin1);
		Animal Lion2 = new Lion("Scar",10);
		animales.add(Lion2);
		Animal Penguin2 = new Penguin("Ramon",5);
		animales.add(Penguin2);
		Animal Cat2 = new Cat("Luna","Europeo",1);
		animales.add(Cat2);
		Animal Dog2 = new Dog("Chispitas","Chihuahua",5);
		animales.add(Dog2);
		Animal Tiger1 = new Tiger("Tiger",4);
		animales.add(Tiger1);
		Animal Tiger2 = new Tiger("Linda",3);
		animales.add(Tiger2);
	}
}
