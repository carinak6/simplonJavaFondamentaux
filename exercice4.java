package hello;

import java.util.Scanner;

public class exercice4 {

	public static void main(String[] args) {
		//Ecrire un programme qui retourne la somme et le quotient de 2 nombres donnés en entrée

		//declaration des variables
		int nombre1;
        int nombre2;        
        int somme;
        float quotient;
        
        /* Declaration des resources d'entrée et affectation de la saisie de l'utilisateur */
        Scanner clavier = new Scanner(System.in);
        System.out.print("Saisir le premier nombre : ");
        nombre1 = clavier.nextInt();
 
        System.out.print("Saisir le deuxieme nombre : ");
        nombre2 = clavier.nextInt();      
        
        /*calcule des operations demnadé*/
        somme = nombre1 + nombre2;
        quotient = nombre1 / nombre2;
        
        /*afffichage du resultat*/
        System.out.println("la somme des 2 nombre est " + somme);
        System.out.println("le quotient des 2 nombre est " + quotient);
 
        // fermer les ressources
        clavier.close();

	}

}
