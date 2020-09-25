package hello;

import java.util.Scanner;


public class exercice2 {

	public static void main(String[] args) {
		
		/* *Ecrire un programme qui retourne la majuscule d’une lettre en minuscule donnée*/
		
		String lettre;
		
	     Scanner clavier = new Scanner(System.in);
	     System.out.print("Saisir une lettre : ");	     
	     lettre = clavier.nextLine();
		
		System.out.println("La lettre "+lettre+" en mayuscule est " + lettre.toUpperCase());

	}

}
