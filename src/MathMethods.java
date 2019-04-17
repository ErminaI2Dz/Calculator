
public class MathMethods {

	public static double addition(int broj1, int broj2) {

		return broj1 + broj2;

	}

	public static int subtraction(int broj1, int broj2) {

		if (broj1 < broj2)
			return (-1) * (broj2 - broj1);
		else
			return broj1 - broj2;

	}

	public static int multiplication(int broj1, int broj2) {

		return broj1 * broj2;

	}

	public static double division(double broj1, double broj2) {

		return broj1 / broj2;

	}

	public static double root(double broj1) {

		return Math.sqrt(broj1);

	}

	public static int square(int broj1) {

		return broj1 * broj1;

	}

}
