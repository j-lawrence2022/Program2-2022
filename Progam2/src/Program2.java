//Application: Program 2
//Name: Brad Messner 
//GitHub User: j-lawrence2022
//Date: Sep 23 2022
//Version: 1.0
//Description: Conditionals

//Header
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Initialize scanner for keyboard input		
		Scanner keyboard = new Scanner(System.in);


//collect input
System.out.println("What is the first number?");
int first = keyboard.nextInt(); 
System.out.println("What is the second number?");
int second = keyboard.nextInt();
System.out.println("What is the third number?");
int third = keyboard.nextInt();

//Create menu
System.out.println("Menu of options");
System.out.println("1. Addition");
System.out.println("2.Subtraction");
System.out.println("3. Multiplication");
System.out.println("4.Division");
System.out.println("What choose do you want to make?");

//Initialize the starting sum as 0
int option = keyboard.nextInt();
int sum=0;

// Create actions for options on menu 
switch(option)
{
case 1:
sum = first + second;
System.out.println("The sum of these two numbers is " +sum);
break;

case 2:
	sum = first - second;
	System.out.println("The sum of the two numbers is " +sum);
	break;

case 3:
	sum = first * second;
	break;
	
case 4:
	sum = first / second;
	break;
}
//If statement to determine if sum is greater then the third number
	if(sum > third)
	{
		System.out.println(sum+ " is a greater value than " +third);
	} else {
		System.out.println(sum+ " is a lesser value than " +third);
	}
		
}
	

}
