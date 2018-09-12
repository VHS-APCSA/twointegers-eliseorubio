public class TwoIntegers 
{
	private int one;
	private int two;
	
	public TwoIntegers()
	{
		one = 0;
		two = 0;
	}
	public TwoIntegers(int one, int two)
	{
		this.one = one;
		this.two = two;
	}
	public int setOne()
	{
		return one;
	}
	public void getOne(int one)
	{
		this.one = one;
	}
	public int setTwo()
	{
		return two;
	}
	public void getTwo(int two)
	{
		this.two = two;
	}
	public String arithmetic()
	{
		int sum = one + two;
		int dif = one - two;
		int mult = one * two;
		double div = (double) one / two;		
		return "Sum:" + sum + " Difference:" + dif + " Multiplication:" + mult + " Division:" + div;
	}
	public String Larger()
	{
		if(one > two)
		{
			return one + " > " + two;
		}
		else if (one < two)
		{
			return one + " < " + two;
		}
		else
		{
			return one + " = " + two;
		}
	}
	public boolean isEven()	
	{
		if((one + two) % 2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean isMultiple()
	{
		if(one % two == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}