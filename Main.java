package groupe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;







public class Main {

	public static void main(String[] args) {
		
	
	   
	
		  List<String> eleve = new ArrayList<String>(
				    Arrays.asList("alexandre","Lucas","Mathieu","Maxime","Gabrielle","Lo�c","Tju","Fethi",
				    		"Mauranne", "Mohamed", "Fabien", "Laura", "Harmann", "Adel", "Rachid")
				);
		 
		 
		  List<String> groupe = new ArrayList<String>(
				    Arrays.asList("crocodile","mouton","sardine","Les pourris g�t�s","Dragon Work","Forever united","Office's kings","Pokemon",
				    		"Les reines du succ�s", "Les irr�ductibles", "Les bras cass�s", "Les fayots", "Les d�glingos", "les idiots du village", "La f�te du slip",
				    		"Les knackis","Une baguette s'il vous plait","Jamais 2 sans 3","Les bombasses","Les 5 doigts de la main","La chambre des secrets"
				    		,"Les explorateurs de g�ographie","L'asile","Briseurs de r�gles","Les fr�res d'armes")
				);
		 
		        
	            Random random = new Random();
	            Collections.shuffle(eleve);
	            Collections.shuffle(groupe);
	            
	            	
	           
	            List<String> groupe1 = groupe.subList(0, 7);
				List<String> eleve1 = eleve.subList(0, 5);
				System.out.println( "Groupe : " + groupe1.get( random.nextInt(groupe1.size() ) )+  " " + eleve1);
				System.out.println("-----------------------");
				
				List<String> groupe2 = groupe.subList(7, 14);
				List<String> eleve2 = eleve.subList(5, 10);
			    System.out.println( "Groupe : " + groupe2.get( random.nextInt(groupe2.size() ) ) +  " " + eleve2);
				System.out.println("-----------------------");
				
				
				List<String> groupe3 = groupe.subList(14, 25);
			    List<String> eleve3 = eleve.subList(10, 15);
				System.out.println( "Groupe : " + groupe3.get( random.nextInt(groupe3.size() ) ) +  " " + eleve3);
			 }
				

}

