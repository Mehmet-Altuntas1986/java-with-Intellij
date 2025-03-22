package day_8_control_flow_statements_2;

public class SwitchCaseStatement {

	public static void main(String[] args) {
		
		
		
		// If we do not put break; at the end it will print next case till we see the break;
		
		String weather="snow";
		switch(weather) {
		
		case "sunny":
			System.out.println("Go to park");
			System.out.println("Code Java");
			break;
		case "hot":
			System.out.println("Go to swimming");
			System.out.println("Code Java");
			break;
		case "windy":
			System.out.println("Fly a kite");
			System.out.println("Code Java");
			break;
		case "snow":
			System.out.println("Go snowboarding");
			System.out.println("Code Java");
			break;
		default:    //We can put anywhere it does not matter, but if we but in the middle put break; at the end
			System.out.println("Code Java in any other weather");
		
		}

        //AFTER JAVA 14
        //NO NEED break usage ,  lambda ,  more than one case can be written ,

	}





}
