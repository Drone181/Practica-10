package paquete_Pract10;

import java.util.ArrayList;
import java.util.Scanner;
import paquete_EjerdePract.Animal;
import paquete_EjerdePract.Cat;
import paquete_EjerdePract.Dog;
import paquete_EjerdePract.Lion;
import paquete_EjerdePract.Penguin;
import paquete_EjerdePract.Tiger;

public class Zoo {
	ArrayList<Animal> animales;
	
	public Zoo(ArrayList<Animal> animales) {
		this.animales = animales;
	}
	
	public void mostrar() {
		int i = 1;
		
		for(Animal a: animales) {
			System.out.println(i+":");
			if(a instanceof Dog) {
				a.eat();
				((Dog) a ).bark();
			}
			else if(a instanceof Lion) {
				((Lion)a).sleep();
			}
			else {
				a.eat();
			}
			
			System.out.println();
			i++;
		}
	}
	
	public void eliminar() {
		Scanner tl = new Scanner(System.in);
		int o=0,t=(int)animales.size();
		boolean s=false;
		System.out.println();
		mostrar();
		do {
			System.out.println("\nIngrese el numero del animal que desea eliminar");
			o = tl.nextInt();
			if(o<1==true||o>t==true) {
				System.out.println("\nAnimal no encontrado");
			}
			else {
				animales.remove(o-1);
				System.out.println("\nAnimal eliminado\n");
				s = true;
			}
		}while(s==false);
	}
	
	public void agregar() {
		Scanner tl = new Scanner(System.in);
		String s1 = new String();
		String s2 = new String();
		int o=0,a=0;
		
		do {
			System.out.println("Que tipo de animal desea agregar?\n\n1.Dog\n2.Cat"
					+ "\n3.Lion\n4.Penguin\n5.Tiger");
			o = tl.nextInt();
			
			switch(o) {
			case 1: System.out.println("Ingrese el nombre: ");
					tl.nextLine();
					s1 = tl.nextLine();
					System.out.println("Ingrese la raza: ");
					s2 = tl.nextLine();
					System.out.println("Ingrese la edad: ");
					a = tl.nextInt();
					Animal Dog = new Dog(s1,s2,a);
					animales.add(Dog);
				break;
			case 2:
				System.out.println("Ingrese el nombre: ");
				tl.nextLine();
				s1 = tl.nextLine();
				System.out.println("Ingrese la raza: ");
				s2 = tl.nextLine();
				System.out.println("Ingrese la edad: ");
				a = tl.nextInt();
				Animal Cat = new Cat(s1,s2,a);
				animales.add(Cat);
				break;
			case 3:
				System.out.println("Ingrese el nombre: ");
				tl.nextLine();
				s1 = tl.nextLine();
				System.out.println("Ingrese la edad: ");
				a = tl.nextInt();
				Animal Lion = new Lion(s1,a);
				animales.add(Lion);
				break;
			case 4:
				System.out.println("Ingrese el nombre: ");
				tl.nextLine();
				s1 = tl.nextLine();
				System.out.println("Ingrese la edad: ");
				a = tl.nextInt();
				Animal Penguin = new Penguin(s1,a);
				animales.add(Penguin);
				break;
			case 5:
				System.out.println("Ingrese el nombre: ");
				tl.nextLine();
				s1 = tl.nextLine();
				System.out.println("Ingrese la edad: ");
				a = tl.nextInt();
				Animal Tiger = new Tiger(s1,a);
				animales.add(Tiger);
				break;
			default:
				System.out.println("**********Ingrese una opcion valida**********\n");
				break;
			}
		}while(o<1||o>5);
		System.out.println("\n-----Animal agregado-----\n");
	}
	
	public void vacunar(ArrayList<Animal> animales) {
		Veterinarian v = new Veterinarian("Jeff",10000);
		
		System.out.println("");
		
		for(int i=0;i<animales.size();i++) {
			v.vaccinated(animales.get(i));
		}
		System.out.println("");
	}
}
