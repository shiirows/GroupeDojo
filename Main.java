package groupe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	
	    System.out.println("Bienvenue de le générateur. "
	    		+ "vous avez la possibilité de former jusqu'a 7 groupe .");
	    
	    System.out.println(" (2) (3) (4) (5) (6) (7) ");
	
		  List<String> eleve = new ArrayList<String>(
				    Arrays.asList("alexandre","Lucas","Mathieu","Maxime","Gabrielle","Loïc","Tju","Fethi",
				    		"Mauranne", "Mohamed", "Fabien", "Laura", "Hermann", "Adel", "Rachid")
				);
		 
		 
		  List<String> groupe = new ArrayList<String>(
				    Arrays.asList("crocodile","mouton","sardine","Les pourris gâtés","Dragon Work","Forever united","Office's kings","Pokemon",
				    		"Les reines du succès", "Les irréductibles", "Les bras cassés", "Les fayots", "Les déglingos", "les idiots du village", "La fête du slip",
				    		"Les knackis","Une baguette s'il vous plait","Jamais 2 sans 3","Les bombasses","Les 5 doigts de la main","La chambre des secrets"
				    		,"Les explorateurs de géographie","L'asile","Briseurs de règles","Les frères d'armes")
				);
		        
		        Scanner userInput = new Scanner(System.in);
		        int response = userInput.nextInt();
	            Random random = new Random();
	            Collections.shuffle(eleve);
	            Collections.shuffle(groupe);
	           
	           
                    
	            
	                if(response == 2) {

	            	List<String> groupe1 = groupe.subList(0, 12);
					List<String> eleve1 = eleve.subList(0, 7);
					System.out.println( "Groupe 1 : " + groupe1.get( random.nextInt(groupe1.size() ) )+  " " + 
					eleve1 + " " + "chef du groupe " + eleve1.get( random.nextInt(eleve1.size() ) ));
					
					System.out.println("-----------------------");
					
					List<String> groupe2 = groupe.subList(12, 25);
					List<String> eleve2 = eleve.subList(7, 15);
				    System.out.println( "Groupe 2 : " + groupe2.get( random.nextInt(groupe2.size() ) ) +  " " +
					eleve2 + " " + "chef du groupe " + eleve2.get( random.nextInt(eleve2.size() ) ));
					System.out.println("-----------------------");
					

	            }
	                
	                if(response == 3) {
	            	  
	                List<String> groupe1 = groupe.subList(0, 7);
				    List<String> eleve1 = eleve.subList(0, 5);
				    System.out.println( "Groupe 1 : " + groupe1.get( random.nextInt(groupe1.size() ) )+  " " + 
				    eleve1 + " " + "chef du groupe " + eleve1.get( random.nextInt(eleve1.size() ) ));
				    System.out.println("-----------------------");
				
			        List<String> groupe2 = groupe.subList(7, 14);
			     	List<String> eleve2 = eleve.subList(5, 10);
			        System.out.println( "Groupe 2 : " + groupe2.get( random.nextInt(groupe2.size() ) ) +  " " +
				    eleve2 + " " + "chef du groupe " + eleve2.get( random.nextInt(eleve2.size() ) ));
			     	System.out.println("-----------------------");
				
				
			     	List<String> groupe3 = groupe.subList(14, 25);
			        List<String> eleve3 = eleve.subList(10, 15);
		     		System.out.println( "Groupe 3 : " + groupe3.get( random.nextInt(groupe3.size() ) ) +  " " + 
			        eleve3 + " " + "chef du groupe " + eleve3.get( random.nextInt(eleve3.size() ) ));
			 
	           }	
	              
	                if(response == 4) {
	            	  
	            	  
	            	List<String> groupe1 = groupe.subList(0, 4);
		  			List<String> eleve1 = eleve.subList(0, 4);
		  			System.out.println( "Groupe 1 : " + groupe1.get( random.nextInt(groupe1.size() ) )+  " " + 
		  			eleve1 + " " + "chef du groupe " + eleve1.get( random.nextInt(eleve1.size() ) ));
		  				
		  			System.out.println("-----------------------");
		  				
		  			List<String> groupe2 = groupe.subList(4, 8);
		  			List<String> eleve2 = eleve.subList(4, 8);
		  		    System.out.println( "Groupe 2 : " + groupe2.get( random.nextInt(groupe2.size() ) ) +  " " +
		  			eleve2 + " " + "chef du groupe " + eleve2.get( random.nextInt(eleve2.size() ) ));
		  			System.out.println("-----------------------");
		  				
		  				
		  			List<String> groupe3 = groupe.subList(8, 12);
		  		    List<String> eleve3 = eleve.subList(8, 12);
		  			System.out.println( "Groupe 3 : " + groupe3.get( random.nextInt(groupe3.size() ) ) +  " " + 
		  		    eleve3 + " " + "chef du groupe " + eleve3.get( random.nextInt(eleve3.size() ) ));
		  			System.out.println("-----------------------");
		  				
		  			List<String> groupe4 = groupe.subList(12, 15);
		  		    List<String> eleve4 = eleve.subList(12, 15);
		  			System.out.println( "Groupe 4 : " + groupe4.get( random.nextInt(groupe4.size() ) ) +  " " + 
		  		    eleve4 + " " + "chef du groupe " + eleve4.get( random.nextInt(eleve4.size() ) ));
		  			System.out.println("-----------------------");
	
	 
	              }
	              
	                if(response == 5) {
	            	  
	            	List<String> groupe1 = groupe.subList(0, 3);
		  			List<String> eleve1 = eleve.subList(0, 3);
		  		    System.out.println( "Groupe 1 : " + groupe1.get( random.nextInt(groupe1.size() ) )+  " " + 
		  			eleve1 + " " + "chef du groupe " + eleve1.get( random.nextInt(eleve1.size() ) ));
		  				
		  			System.out.println("-----------------------");
		  				
		  			List<String> groupe2 = groupe.subList(3, 6);
		  			List<String> eleve2 = eleve.subList(3, 6);
		  		    System.out.println( "Groupe 2 : " + groupe2.get( random.nextInt(groupe2.size() ) ) +  " " +
		  			eleve2 + " " + "chef du groupe " + eleve2.get( random.nextInt(eleve2.size() ) ));
		  			System.out.println("-----------------------");
		  				
		  				
		  			List<String> groupe3 = groupe.subList(6, 9);
		  		    List<String> eleve3 = eleve.subList(6, 9);
		  			System.out.println( "Groupe 3 : " + groupe3.get( random.nextInt(groupe3.size() ) ) +  " " + 
		  		    eleve3 + " " + "chef du groupe " + eleve3.get( random.nextInt(eleve3.size() ) ));
		  			System.out.println("-----------------------");
		  				
		  			List<String> groupe4 = groupe.subList(9, 12);
		  		    List<String> eleve4 = eleve.subList(9, 12);
		  			System.out.println( "Groupe 4 : " + groupe4.get( random.nextInt(groupe4.size() ) ) +  " " + 
		  		    eleve4 + " " + "chef du groupe " + eleve4.get( random.nextInt(eleve4.size() ) ));
		  			System.out.println("-----------------------");
		  				
		  			List<String> groupe5 = groupe.subList(12, 15);
		  		    List<String> eleve5 = eleve.subList(12, 15);
		  			System.out.println( "Groupe 5 : " + groupe5.get( random.nextInt(groupe5.size() ) ) +  " " + 
		  		    eleve5 + " " + "chef du groupe " + eleve5.get( random.nextInt(eleve5.size() ) ));
		  			System.out.println("-----------------------");
	            	  
	              }
	              
	                if(response == 6) {
	            	  
	            	  
	           	    List<String> groupe1 = groupe.subList(0, 3);
		  			List<String> eleve1 = eleve.subList(0, 3);
		  			System.out.println( "Groupe 1 : " + groupe1.get( random.nextInt(groupe1.size() ) )+  " " + 
		  			eleve1 + " " + "chef du groupe " + eleve1.get( random.nextInt(eleve1.size() ) ));
		  				
		  			System.out.println("-----------------------");
		  				
		  			List<String> groupe2 = groupe.subList(3, 6);
		  			List<String> eleve2 = eleve.subList(3, 6);
		  		    System.out.println( "Groupe 2 : " + groupe2.get( random.nextInt(groupe2.size() ) ) +  " " +
		  			eleve2 + " " + "chef du groupe " + eleve2.get( random.nextInt(eleve2.size() ) ));
		  			System.out.println("-----------------------");
		  				
		  				
		  			List<String> groupe3 = groupe.subList(6, 9);
		  		    List<String> eleve3 = eleve.subList(6, 9);
		  			System.out.println( "Groupe 3 : " + groupe3.get( random.nextInt(groupe3.size() ) ) +  " " + 
		  		    eleve3 + " " + "chef du groupe " + eleve3.get( random.nextInt(eleve3.size() ) ));
		  			System.out.println("-----------------------");
		  				
		  			List<String> groupe4 = groupe.subList(9, 11);
		  		    List<String> eleve4 = eleve.subList(9, 11);
		  			System.out.println( "Groupe 4 : " + groupe4.get( random.nextInt(groupe4.size() ) ) +  " " + 
		  		    eleve4 + " " + "chef du groupe " + eleve4.get( random.nextInt(eleve4.size() ) ));
		  			System.out.println("-----------------------");
		  				
		  			List<String> groupe5 = groupe.subList(11, 13);
		  		    List<String> eleve5 = eleve.subList(11, 13);
		  			System.out.println( "Groupe 5 : " + groupe5.get( random.nextInt(groupe5.size() ) ) +  " " + 
		  		    eleve5 + " " + "chef du groupe " + eleve5.get( random.nextInt(eleve5.size() ) ));
		  			System.out.println("-----------------------");
		  				
		  			List<String> groupe6 = groupe.subList(13, 15);
		  		    List<String> eleve6 = eleve.subList(13, 15);
		  			System.out.println( "Groupe 6 : " + groupe6.get( random.nextInt(groupe6.size() ) ) +  " " + 
		  		    eleve6 + " " + "chef du groupe " + eleve6.get( random.nextInt(eleve6.size() ) ));
		  			System.out.println("-----------------------");
	              }
	              
	          
	              
	                if(response == 7) {
	            	  
	            	List<String> groupe1 = groupe.subList(0, 2);
	  				List<String> eleve1 = eleve.subList(0, 2);
	  				System.out.println( "Groupe 1 : " + groupe1.get( random.nextInt(groupe1.size() ) )+  " " + 
	  				eleve1 + " " + "chef du groupe " + eleve1.get( random.nextInt(eleve1.size() ) ));
	  				
	  				System.out.println("-----------------------");
	  				
	  				List<String> groupe2 = groupe.subList(2, 4);
	  				List<String> eleve2 = eleve.subList(2, 4);
	  			    System.out.println( "Groupe 2 : " + groupe2.get( random.nextInt(groupe2.size() ) ) +  " " +
	  				eleve2 + " " + "chef du groupe " + eleve2.get( random.nextInt(eleve2.size() ) ));
	  				System.out.println("-----------------------");
	  				
	  				
	  				List<String> groupe3 = groupe.subList(4, 6);
	  			    List<String> eleve3 = eleve.subList(4, 6);
	  				System.out.println( "Groupe 3 : " + groupe3.get( random.nextInt(groupe3.size() ) ) +  " " + 
	  			    eleve3 + " " + "chef du groupe " + eleve3.get( random.nextInt(eleve3.size() ) ));
	  				System.out.println("-----------------------");
	  				
	  				List<String> groupe4 = groupe.subList(6, 8);
	  			    List<String> eleve4 = eleve.subList(6, 8);
	  				System.out.println( "Groupe 4 : " + groupe4.get( random.nextInt(groupe4.size() ) ) +  " " + 
	  			    eleve4 + " " + "chef du groupe " + eleve4.get( random.nextInt(eleve4.size() ) ));
	  				System.out.println("-----------------------");
	  				
	  				List<String> groupe5 = groupe.subList(8, 10);
	  			    List<String> eleve5 = eleve.subList(8, 10);
	  				System.out.println( "Groupe 5 : " + groupe5.get( random.nextInt(groupe5.size() ) ) +  " " + 
	  			    eleve5 + " " + "chef du groupe " + eleve5.get( random.nextInt(eleve5.size() ) ));
	  				System.out.println("-----------------------");
	  				
	  				List<String> groupe6 = groupe.subList(10, 12);
	  			    List<String> eleve6 = eleve.subList(10, 12);
	  				System.out.println( "Groupe 6 : " + groupe6.get( random.nextInt(groupe6.size() ) ) +  " " + 
	  			    eleve6 + " " + "chef du groupe " + eleve6.get( random.nextInt(eleve6.size() ) ));
	  				System.out.println("-----------------------");
	  				
	  				List<String> groupe7 = groupe.subList(12, 15);
	  			    List<String> eleve7 = eleve.subList(12, 15);
	  				System.out.println( "Groupe 7 : " + groupe7.get( random.nextInt(groupe7.size() ) ) +  " " + 
	  			    eleve7 + " " + "chef du groupe " + eleve7.get( random.nextInt(eleve7.size() ) ));
	  				System.out.println("-----------------------");
	  				
	  				
	  				
	  				
	            	  
	              } 
	                	 
	            	  
	              }
	            	  
	     
				

}

