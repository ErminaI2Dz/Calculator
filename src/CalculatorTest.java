import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int unos;

		do {

			System.out.println("Izaberite!\n");
			System.out.println("1---sabiranje");
			System.out.println("2---oduzimanje");
			System.out.println("3---mnozenje");
			System.out.println("4---dijeljenje");
			System.out.println("5---korjenovanje");
			System.out.println("6---kvadriranje");
			System.out.println("0---izlaz");
			unos = input.nextInt();

			if (unos == 1) {

				System.out.print("\nUnesite prvi broj: ");
				int broj1 = input.nextInt();
				System.out.print("Unesite drugi broj:");
				int broj2 = input.nextInt();

				System.out.println(broj1 + " + " + broj2 + " = " + MathMethods.addition(broj1, broj2) + "\n");

			} else if (unos == 2) {

				System.out.print("\nUnesite prvi broj: ");
				int broj1 = input.nextInt();
				System.out.print("Unesite drugi broj:");
				int broj2 = input.nextInt();

				System.out.println(broj1 + " - " + broj2 + " = " + MathMethods.subtraction(broj1, broj2) + "\n");
			} else if (unos == 3) {

				System.out.print("\nUnesite prvi broj: ");
				int broj1 = input.nextInt();
				System.out.print("Unesite drugi broj:");
				int broj2 = input.nextInt();

				System.out.println(broj1 + " * " + broj2 + " = " + MathMethods.multiplication(broj1, broj2) + "\n");
			} else if (unos == 4) {

				System.out.print("\nUnesite prvi broj: ");
				int broj1 = input.nextInt();
				System.out.print("Unesite drugi broj:");
				int broj2 = input.nextInt();

				System.out.println(broj1 + " : " + broj2 + " = " + MathMethods.division(broj1, broj2) + "\n");
			} else if (unos == 5) {

				System.out.print("\nUnesite broj: ");
				double broj1 = input.nextDouble();

				System.out.println(" Korijen " + broj1 + " je " + MathMethods.root(broj1) + "\n");
			} else if (unos == 6) {

				System.out.print("\nUnesite broj: ");
				int broj1 = input.nextInt();

				System.out.println(broj1 + " * " + broj1 + " = " + MathMethods.square(broj1) + "\n");
			} else if (unos < 0 || unos > 6) {
				System.out.println("Pogresan unos!\n");
			}

		} while (unos != 0);

		input.close();

	}

}
