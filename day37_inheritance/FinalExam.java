package day37_inheritance;

public class FinalExam extends GradeActivity {   //FinalExam class i uzaniyor(erisiyor)  Grade activitiy sinifina,  ondaki ozellikleri alip kullanabilmek icin

	private int numQuestions;
	private double pointsEach;
	private int numMissed;
	
	
	public FinalExam(int numQuestions,int numMissed) {
		
		double numericScore;
		
		this.numQuestions = numQuestions;   //this exam objectini temsil ediyor
		this.numMissed = numMissed;
		
		pointsEach = 100.0 / numQuestions;
		numericScore = 100.0 - (numMissed * pointsEach);
		
		
		//My goal is to receive the letter based on my numericScore
		//how will I set my numericScore to score
		
		
		setScore(numericScore);   //setter can be inherited   //burda grade activitiden methodu cagirdik
		
	}

}


//exam object belongs to FinalExam class