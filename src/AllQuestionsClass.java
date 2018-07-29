import java.util.ArrayList;


public class AllQuestionsClass {

	private ArrayList<Questions> QuestionList;
	
	public AllQuestionsClass(){
		
		QuestionList = new ArrayList<Questions>();
		Questions Q01 = new Questions("How Many Players are on a basketball team", "10", "8", "12", "5", 1);
		
		QuestionList.add(Q01);
	}
	
	
}
