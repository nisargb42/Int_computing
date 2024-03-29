package testing;

public class JunitTesting 
{
	/**
	 * Method squares a given number.
	 * @param x
	 * @return int
	 */
	public int square(int x)
	{
		return x*x;
	}
	
	
	/**
	 * Method divides b into a.
	 * @param d
	 * @param e
	 * @return double
	 */
	public double divide(double d, double e)
	{
		return d / e;
	}
	
	/**
	 *  Method counts all how many 'a' or 'A' characters are in a word.
	 * @param word
	 * @return int
	 */
	public int countA(String word)
	{
		int count = 0;
		
		for(int i = 0; i < word.length(); i++)
		{
			if(word.charAt(i) == 'a' || word.charAt(i) == 'A')
			{
				count++;
			}
		}
		
		return count;
	}

}
