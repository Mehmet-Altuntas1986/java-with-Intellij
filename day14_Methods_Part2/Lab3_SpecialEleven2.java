package day14_Methods_Part2;

public class Lab3_SpecialEleven2 {

	public static void main(String[] args) {

		specialEleven(22);
		specialEleven(23);
		specialEleven(24);
		specialEleven(1);

	}

	public static void specialEleven(int number) {

		if (number % 11 == 0) {
			System.out.println(true);
		}

		else if (number % 11 == 1) {

			System.out.println(true);

		}

		else {

			System.out.println(false);
		}

	}

}
