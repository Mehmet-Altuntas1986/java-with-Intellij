package day19_stringManipulation_part1;

public class Task79_PrintingVowels {

	public static void main(String[] args) {

		String word = "CybertekSchool"; // a,e,i,o,u

		for (int i = 0; i < word.length(); i++) {

			char letter = word.charAt(i);

			if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {

				System.out.print(letter);
				//System.out.print(letter + ",");
				//If we do like line 16 then we will have comma at the end.

				if (i != word.length() - 2) {  //It only works if last letter is a consonant

					System.out.print(",");
				}

			}
		}

	}

}
