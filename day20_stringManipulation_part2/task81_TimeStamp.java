package day20_stringManipulation_part2;

public class task81_TimeStamp {

	public static void main(String[] args) {

		String time = "10/01/2019 15:42:00";

		System.out.println(timeStamp(time)); // We call the method

	}

	public static String timeStamp(String time) { // We create the method

		time = time.replace("/", "").replace(":", "").replace(" ", "");

		return time;
	}

}
