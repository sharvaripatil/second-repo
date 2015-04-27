package simpleJava;

import java.util.Scanner;



public class SquChecksare { 
	
	  public static Scanner in = new Scanner(System.in); 
	 
	  public static char abc; 
	  public static double area; 
	  public static double length; 
	  public static double height; 
	  public static double a;
	  
	  public static String str, error; 

	  public static double getArea(double x, double y) { 
	 
	  switch (abc) { 
	   
	

	    case 'R' : 
	      System.out.println("Enter length of rectangle"); 
	      length = in.nextDouble(); 
	      System.out.println("Enter height of rectangle"); 
	      height = in.nextDouble(); 
	      area = length * height; 
	      break; 

	    case 'S' : 
	      System.out.println("Enter length of side"); 
	      length = in.nextDouble(); 
	      area = length * length; 
	      System.out.println("Diagonal of square is");
	       a = Math.sqrt(2)*length;
	      break; 
	  } 

	    return area; 
	  } 

	  
	  public static void main(String[] args) { 
	   
	    System.out.println("Calculate the Area of a Square, Rectangle"); 
	    System.out.println("Press S for square, R for Rectangle"); 
	  
	    str = in.next(); 
	   
	    abc = Character.toUpperCase(str.charAt(0)); 

	   
	   
	     if (abc == 'S') { 
	      getArea(length, length); 
	      System.out.println("The area of your square is " + area); 
	      System.out.println("The diagonal of square is" +a);
	    } 
	    else if (abc == 'R') { 
	      getArea(length, height); 
	      System.out.println("The area of your rectangle is " + area); 
	      
	    } 
	    else { 
	      System.out.println(error); 
	    } 
	  } 
	}
