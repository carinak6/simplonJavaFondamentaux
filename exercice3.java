package hello;

import java.util.Scanner;

public class exercice3 {

	public static void main(String[] args) {
		
		/*Ecrire un programme qui retourne la moyenne de 3 entiers donnés en entrée.*/
		
		int nombre1;
        int nombre2;
        int nombre3;
        float moyene;
        
        Scanner clavier = new Scanner(System.in);//je declare la ressource d'entre clavier
        
        System.out.print("Saisir le premier nombre : "); /*message afficher à l'utilisateur*/
        nombre1 = clavier.nextInt(); /* saisie de l'utilisateur affecté à la variable declaré avant */
 
        System.out.print("Saisir le deuxieme nombre : ");
        nombre2 = clavier.nextInt();
 
        System.out.print("Saisir le troisieme nombre : ");
        nombre3 = clavier.nextInt();
        
        moyene = (nombre1 + nombre2 + nombre3)/3; /*calcule de la moyenne de 3 numeros*/
 
        System.out.println("la moyene des 3 entiers est " + moyene); // affichage du resultat
 
        // fermer les ressources
        clavier.close();
        
	}

}
