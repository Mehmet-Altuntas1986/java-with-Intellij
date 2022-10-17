package day10_controlFlowStatements_Part4;

public class task40_EvenNumbers {

	public static void main(String[] args) {

		for (int num = 2; num <= 100; num += 2) { // num+=2 = num=num+2
			System.out.println("num = " + num);

		}

		System.out.println("*************************************************************************");

		for (int i = 1; i <= 100; i++) {

			if (i % 2 == 0) {

				// System.out.println("i = " + i ); //If we want to see them on the different
				// lines.

				System.out.print(i + " "); // If we want to see them on the same line
			}

		}

	}

}
