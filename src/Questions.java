
public class Questions {
	
	private String Question;
	private String Answer1;
	private String Answer2;
	private String Answer3;
	private String Answer4;
	private double CorrectAnswer;
	
	
	public Questions(String question, String answer1, String answer2,
			String answer3, String answer4, double correctAnswer) {
		super();
		Question = question;
		Answer1 = answer1;
		Answer2 = answer2;
		Answer3 = answer3;
		Answer4 = answer4;
		CorrectAnswer = correctAnswer;
	}


	public String getQuestion() {
		return Question;
	}


	public void setQuestion(String question) {
		Question = question;
	}


	public String getAnswer1() {
		return Answer1;
	}


	public void setAnswer1(String answer1) {
		Answer1 = answer1;
	}


	public String getAnswer2() {
		return Answer2;
	}


	public void setAnswer2(String answer2) {
		Answer2 = answer2;
	}


	public String getAnswer3() {
		return Answer3;
	}


	public void setAnswer3(String answer3) {
		Answer3 = answer3;
	}


	public String getAnswer4() {
		return Answer4;
	}


	public void setAnswer4(String answer4) {
		Answer4 = answer4;
	}


	public double getCorrectAnswer() {
		return CorrectAnswer;
	}


	public void setCorrectAnswer(double correctAnswer) {
		CorrectAnswer = correctAnswer;
	}
	
	
	
	


}
