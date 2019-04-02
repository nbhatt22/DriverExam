
public class DriverExam 
{
	private char[] correctAnswers;
	
	public DriverExam(char[] c)
	{
		correctAnswers = c;
	}
	
	public int totalCorrect(char[] studentAnswers)
	{
		int correct = 0;
		for(int i = 0; i < correctAnswers.length; i++)
		{
			if (studentAnswers[i]  == correctAnswers[i])
			{
				correct++;
			}
		}
		return correct;
	}
	public int totalIncorrect(char[] studentAnswers)
	{
		int incorrect = 0;
		for(int i = 0; i < correctAnswers.length; i++)
		{
			if(studentAnswers[i] != correctAnswers[i])
			{
				incorrect++;
			}
		}
		return incorrect;
	}
	public boolean
}
