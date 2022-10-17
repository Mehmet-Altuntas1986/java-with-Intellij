package day14_Methods_Part2;

public class Task66_DistanceTraveled {

	public static void main(String[] args) {

		double d = distance(40, 5);        //d is distance travelled

		System.out.println(distance(10, 5));

		System.out.println(d);

		if (d > 500) {
			System.out.println("you spent too much gas");
		} else {
			System.out.println("you spent ok gas");
		}
	}

	public static double distance(double speed, int time) {

		double distanceTraveled = speed * time;

		return distanceTraveled;

	}

}
