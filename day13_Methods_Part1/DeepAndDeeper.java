package day13_Methods_Part1;

public class DeepAndDeeper {

	public static void main(String[] args) {

		System.out.println("I am starting in main");
		deep();
		System.out.println("Now I am back in main");

	}

	public static void deep() {
		System.out.println("I am now in deep");
		deeper();										//Inside a method we can have more methods.
		System.out.println("Now I am back in deep");
	}

	public static void deeper() {
		System.out.println("I am now in deeper");

	}

}
