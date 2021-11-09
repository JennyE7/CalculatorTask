import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		

	}
	
	public static void menu() {
		
		boolean cont = true;
		
		Scanner scan = new Scanner(System.in);
		
		while (cont) {
			System.out.println("Welcome to the Calculator! Please select an operation:");
			System.out.println("For addition press 1.");
			System.out.println("For subtraction press 2.");
			System.out.println("For multiplication press 3.");
			System.out.println("For division press 4.");
			System.out.println();
			System.out.println("To quit press 0.");
			
			int calculation = scan.nextInt();
			scan.nextLine();
			
			switch(calculation) {
				
			case 0: {
				System.out.println("Thanks for using the calculator!");
				cont = false;
				break;
			}
			case 1: {
				System.out.println("Please enter the first number:");
					
				double num1 = scan.nextDouble();
				scan.nextLine();
					
				System.out.println("Please enter the second number:");
					
				double num2 = scan.nextDouble();
				scan.nextLine();
					
				System.out.println(num1 + " plus " + num2 + " is " + Calculator.addition(num1, num2));
				break;
			}
			case 2: {
				System.out.println("Please enter the first number:");
					
				double num1 = scan.nextDouble();
				scan.nextLine();
					
				System.out.println("Please enter the second number:");
					
				double num2 = scan.nextDouble();
				scan.nextLine();
					
				System.out.println(num1 + " minus " + num2 + " is " + Calculator.subtraction(num1, num2));
				break;
			}
			case 3: {
				System.out.println("Please enter the first number:");
					
				double num1 = scan.nextDouble();
				scan.nextLine();
					
				System.out.println("Please enter the second number:");
					
				double num2 = scan.nextDouble();
				scan.nextLine();
					
				System.out.println(num1 + " multiplied by " + num2 + " is " + Calculator.multiplication(num1, num2));				
				break;
			}
			case 4: {
				System.out.println("Please enter the first number:");
					
				double num1 = scan.nextDouble();
				scan.nextLine();
					
				System.out.println("Please enter the second number:");
					
				double num2 = scan.nextDouble();
				scan.nextLine();
					
				System.out.println(num1 + " divided by " + num2 + " is " + Calculator.division(num1, num2));				
				break;
			}
			default: {
				System.out.println("Please try again.");
				break;
			}
			}
			
			System.out.println();
	}
	}

}
