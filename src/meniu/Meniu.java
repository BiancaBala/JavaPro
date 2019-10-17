package meniu;

import java.util.Scanner;

public class Meniu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Aperitiv");
		System.out.println("2. Felul I ");
		System.out.println("3. Felul II: somon cu legume");
		System.out.println("4. Desert: tiramisu");
		System.out.println(" Alegeti ce doriti sa mancati");
		int op=sc.nextInt();
		switch(op) {
		case 1: System.out.println("Ai ales aperitiv");
		break;
		case 2: System.out.println("Ai ales felul I");
		break;
		case 3: System.out.println("Ai ales felul II");
		break;
		case 4: System.out.println("Ai ales desert");
		break;
	}

}
}
