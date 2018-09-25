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
		return one + " + " + two + " = " + sum + ", " + one + " - " + two + " = " + dif + ", " + one + " * " + two + " = " + mult + ", " + one + " / " + two + " = " + div;
	}
	public int larger()
	{
		if(one > two)
		{
			return one;
		}
		else
		{
			return two;
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