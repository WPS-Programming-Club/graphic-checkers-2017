import java.util.*;
public class Movie {

	public static void main(String[] args) {
		
		
		try{
			Thread.sleep(1500);
			} 
		catch(Exception e) {}
		System.out.println("Hello, please tell me your age: ");
		Scanner kb = new Scanner (System.in);
		int aje = kb.nextInt();
		try{
			Thread.sleep(2000);
			} 
		catch(Exception e) {}
		System.out.println("Are you here for a matinee showing?     ('Y' or 'N')");
		String x = kb.nextLine();
		
		try{
			Thread.sleep(5000);
			} 
		catch(Exception e) {}
		
		System.out.println("Are you here for a regular showing?     ('Y' or 'N')");
		String y = kb.nextLine();
		
		try{
			Thread.sleep(2000);
			} 
		catch(Exception e) {}
		
		System.out.println("Let me see.....");
		
		try{
			Thread.sleep(2000);
			} 
		catch(Exception e) {}
		
		Movieinfo steve = new Movieinfo(aje, x, y); 		//First parameter is for age, second a Y or N for matinee, and the third a Y or N for regular.
		String movietype = null;
	
		int decision = 5;
		
		if (steve.getAge() < 10 && steve.getCheck1() == "Y"){
			    
				  movietype = "matinee";
				  decision = 2;
				  System.out.println ("Your age is " + steve.getAge() + ", you are here for a " + movietype + " showing " + "and your cost would be " + decision +" dollars.");
				 
				}
		else if (steve.getAge() > 55 && steve.getCheck2() == "Y" ) {
			
				   movietype = "regular";
				   decision = 7;
				   System.out.println ("Your age is " + steve.getAge() + ", you are here for a " + movietype + " showing " + "and your cost would be " + decision +" dollars.");
				}
		else if  (steve.getAge() > 10 && steve.getCheck1() == "Y"){ 	
					movietype = "matinee";
					decision = 5;
					System.out.println ("Your age is " + steve.getAge() + ", you are here for a " + movietype + " showing " + "and your cost would be " + decision +" dollars.");
					}	
		else if (steve.getAge() < 55 && steve.getCheck2() == "Y") {
					movietype = "regular"; 
					decision = 10;
					System.out.println ("Your age is " + steve.getAge() + ", you are here for a " + movietype + " showing " + "and your cost would be " + decision +" dollars.");
					}
		else {}
				}
		} 
			
				
	

import java.util.*;
public class Movie {

	public static void main(String[] args) {
	
		System.out.println("Hello, please tell me your age: ");
		Scanner kb = new Scanner (System.in);
		Scanner kb2 = new Scanner(System.in);
		Scanner kb3 = new Scanner(System.in);
		int aje = kb.nextInt();
		System.out.println("Are you here for a matinee showing?     ('Y' or 'N')");
		String x = kb2.nextLine();
		System.out.println("Are you here for a regular showing?     ('Y' or 'N')");
		String y = kb3.nextLine();
		Movieinfo steve = new Movieinfo(aje, x, y); 		//First parameter is for age, second a Y or N for matinee, and the third a Y or N for regular.
		String movietype = null;
		int decision = 0;
		if (steve.getAge() < 10 || steve.getAge() > 55) {   
			
				if (steve.getCheck1() == "Y") {     //Determine type of showing
				
				  movietype = "matinee";
				  decision = 2;
				  
				  System.out.println ("Your age is " + steve.getAge() + ", you are here for a " + movietype + " showing " + "and your cost would be " + decision +" dollars.");
				 
				}
				else {
			
				    movietype = "regular";
				    decision = 7;
				    
				    System.out.println ("Your age is " + steve.getAge() + ", you are here for a " + movietype + " showing " + "and your cost would be " + decision +" dollars.");
				}
					
		}
			
		else if  (steve.getAge() > 10 || steve.getAge() < 55){ 		
				
					if (steve.getCheck1() == "Y") {     //Determine type of showing
					
					  movietype = "matinee";
					  decision = 5;
					  
					  System.out.println ("Your age is " + steve.getAge() + ", you are here for a " + movietype + " showing " + "and your cost would be " + decision +" dollars.");
					}	
					
					else { 
					    movietype = "regular"; 
					    decision = 10;
					    
					    System.out.println ("Your age is " + steve.getAge() + ", you are here for a " + movietype + " showing " + "and your cost would be " + decision +" dollars.");
					}
					
				}
			

			
		} 
			
				
	}








import java.util.*;
public class Movie {

	public static void main(String[] args) {
		
		
		System.out.println("Hello, please tell me your age: ");
		Scanner kb = new Scanner (System.in);
		int aje = kb.nextInt();
	
		System.out.println("Are you here for a matinee showing?     ('Y' or 'N')");
		Scanner kb2 = new Scanner (System.in);
		String x = kb2.nextLine();

		System.out.println("Are you here for a regular showing?     ('Y' or 'N')");
		Scanner kb3 = new Scanner (System.in);
		String y = kb3.nextLine();
		
	
		System.out.println("Let me see.....");
		
	
		Movieinfo steve = new Movieinfo(aje, x, y); 		//First parameter is for age, second a Y or N for matinee, and the third a Y or N for regular.
		String movietype = null;
	
		int decision = 5;
		
		if (steve.getAge() < 10 && steve.getCheck1() == "Y" && steve.getCheck2() == "N"){
			    
				  movietype = "matinee";
				  decision = 2;
				  System.out.println ("Your age is " + steve.getAge() + ", you are here for a " + movietype + " showing " + "and your cost would be " + decision +" dollars.");
				 
				}
		else if (steve.getAge() > 55 && steve.getCheck2() == "Y" && steve.getCheck1() == "N") {
			
				   movietype = "regular";
				   decision = 7;
				   System.out.println ("Your age is " + steve.getAge() + ", you are here for a " + movietype + " showing " + "and your cost would be " + decision +" dollars.");
				}
		else if  (steve.getAge() > 10 && steve.getCheck1() == "Y" && steve.getCheck2() == "N"){ 	
					movietype = "matinee";
					decision = 5;
					System.out.println ("Your age is " + steve.getAge() + ", you are here for a " + movietype + " showing " + "and your cost would be " + decision +" dollars.");
					}	
		else if (steve.getAge() < 55 && steve.getCheck2() == "Y" && steve.getCheck1() == "N") {
					movietype = "regular"; 
					decision = 10;
					System.out.println ("Your age is " + steve.getAge() + ", you are here for a " + movietype + " showing " + "and your cost would be " + decision +" dollars.");
					}
		else {}
				}
		} 
			
				
	






