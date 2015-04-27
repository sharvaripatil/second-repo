package simpleJava;
import java.io.*;

public class Example 

	{
	   public static void main(String [] args)
	   {
	      Employee e = new Employee();
	      e.name = "Sharvari Patil";
	      e.address = "Gograswadi, Dombivli";
	      e.SSN = 421201;
	      e.number = 123;
	      try
	      {
	         FileOutputStream fileOut =new FileOutputStream("");
	         ObjectOutputStream out = new ObjectOutputStream(fileOut);
	         out.writeObject(e);
	         out.close();
	         fileOut.close();
	         System.out.printf("Serialized data is saved in /tmp/employee.ser");
	      }catch(IOException i)
	      {
	          i.printStackTrace();
	      }
	   }
	} 

