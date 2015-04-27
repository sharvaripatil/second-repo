package simpleJava;


import java.util.Scanner;

public class SquareAreaDiagonal {

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
double side = 0;  
double area = 0;
double diagonal = 0;

System.out.println("Enter the length of side of square ");





side = scanner.nextDouble();

area = side * side;

diagonal = Math.sqrt(2) * side;


System.out.println("Area of Square is : " + area);
System.out.println("Diagonal of a Square is : " + diagonal);
}
}
