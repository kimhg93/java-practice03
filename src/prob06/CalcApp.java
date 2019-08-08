package prob06;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);		
		Add add = new Add();
		Sub sub = new Sub();
		Mul mul = new Mul();
		Div div = new Div();
		
		while( true ) {

			System.out.print( ">> " );
			String expression = scanner.nextLine();
			
			if( "quit".equals( expression ) ) {
				break;
			}
			
			String[] tokens = expression.split( " ");
			
			if( tokens.length != 3 ) {
				System.out.println( ">> 알 수 없는 식입니다.");
				continue;
			}
			
			int a = Integer.parseInt(tokens[0]);
			int b = Integer.parseInt(tokens[2]);
			
			switch(tokens[1]) {
			case "+":
				add.setValue(a,b);
				System.out.println(">> "+add.calculate());				
				printQuit();
				return;
			case "-":
				sub.setValue(a,b);
				System.out.println(">> "+sub.calculate());				
				printQuit();
				return;
			case "*":
				mul.setValue(a,b);
				System.out.println(">> "+mul.calculate());				
				printQuit();
				return;
			case "/":
				div.setValue(a,b);
				System.out.println(">> "+div.calculate());				
				printQuit();
				return;
			}			
		}		
		scanner.close();
	}
	public static void printQuit() {
		System.out.println(">> quit");
	}

}
