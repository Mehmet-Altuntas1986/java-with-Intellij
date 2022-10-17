package day45_exceptionsHandling;

public class TyCatch2 {

	public static void main(String[] args) {
		
		int[] nums = {36,6,34,12};
		
		//System.out.println(nums{0]); //compile error
		
		try {
			System.out.println(nums[6]);
		}catch(Exception e) {
			//System.out.println("Wrong index");
			//System.out.println(e.getStackTrace() ); //bu methodu println icine koydu yazdirabilmek icin cunku bu method da return var , javanin throwable adli classinin icinde bu method var
			
			e.printStackTrace();
			System.out.println(e.getMessage() );//bundada return var ,buyuzden print icin println i kullaniyoruz
			
			System.out.println(e.getMessage());
		}
		
		try {
			int j=100;
			int n=j/0;
		}catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}


//rapor verirken onemli