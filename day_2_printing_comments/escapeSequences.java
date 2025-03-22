package day_2_printing_comments;

public class escapeSequences {

	public static void main(String[] args) {

		System.out.println("Learn\tJava\n\tthe\nEasy\tWay\n\n");
		
		
		// for 2 empty lines we need  \n\n
		// for Tab (space from left side)  \t
		// for double quote (") write in front or at the end of a word  \"
		// if you want to see one backslash (\) we need to write 2 of them (\\)
		
		
		System.out.println("\tLearn Java the \"Easy\" Way!\n");
		
		System.out.println("\\ // -=- \\ //");           //    \ // -=- \ //

		System.out.println("\\\\ \\\\\\ \\\\\\\\");      //    \\ \\\ \\\\
		
		System.out.println("");
		
		//System.out.println("");
		
		System.out.println("Task-4");
		
		System.out.println(" ");
		
		System.out.println("\"\\__/\"");   //     "\__/"
		
		System.out.println(" ");
		
		System.out.println("He said \"Hello\".");    //He said "Hello".
		
		System.out.println(" ");
		
		System.out.println("Would you like 'coffee' or 'tea'?");
		
		System.out.println();
		
		System.out.print( "dolar\rI hope you understand \"escape sequences\" now.\n" );    // I hope you understand "escape sequences" now.

		
		
	}

}

/*
    Escape Sequence	Description

\t	Inserts a tab in the text at this point.

\b	Inserts a backspace in the text at this point.
    (sagindaki ilk harfi 2 adim sola kaydirir, kaydirirekn solda birsey varsa silebilir)

\n	Inserts a newline in the text at this point.
      (onundeki kismi bir sonraki line a tasir)

\r	Inserts a carriage return in the text at this point.
      (koyuldugu yerin sadece sagindaki kisim print olur)

\f	Inserts a form feed in the text at this point.
      Bulundugu yerde sadece 1 harflik  bosluk olusturur

 \'	Inserts a single quote character in the text at this   point.

\"	Inserts a double quote character in the text at this point.

\\	Inserts a backslash \ character in the text at this point.

     */



//    left arrow +option+7  forms  \ olustur






