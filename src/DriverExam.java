
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
	public boolean passed(char[] studentAnswers)
	{
		return ((totalIncorrect(studentAnswers)/ correctAnswers.length)>=0.75);
	}
	public int[] questionsMissed(char[] studentAnswers)
	{
			int[] incorrect = new int[totalIncorrect(studentAnswers)];
			int index = 0;
			for (int i =0; i<correctAnswers.length; i++)
			{
				if (correctAnswers[i] != studentAnswers[i])
				{
					incorrect[index] = i+1;
					index++;
				}
			}
			return incorrect;
			
	}
	
}
