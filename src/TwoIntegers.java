public class TwoIntegers 
{
	private int num1;
	private int num2;

	public TwoIntegers()  
	{
		this.num1 = 0;
		this.num2 = 0;
	}
	public TwoIntegers(int num1, int num2)
	{
		this.num1 = num1;
		this.num2 = num2;
	}
	public int getNum1()
	{
		return num1;
	}
	public int getNum2()
	{
		return num2;
	}
	public void setNum1(int num1)
	{
		this.num1 = num1;
	}
	public void setNum2(int num1)
	{
		this.num1 = num1;
	}
	public String arithmetic()
	{
		int sum = num1 + num2;
		int product = num1 * num2;
		int  difference = num1 - num2;
		int quotient = num1 / num2;
		return num1 + "+" + num2+ "=" + sum + "," + num1 + "*" + num2 + "=" + product + "," 
		+ num1 + "-" + num2 + "=" + difference + "," + num1 + "/" + num2 + "=" + quotient;
	}
	public int larger()
	{
		if(num1 > num2)
		{
			return num1;
		}
		if(num1 < num2)
		{
			return num2;
		}
		else
		{
			return 0;
		}
	}
	public boolean isEven()
	{
		if (num1 + num2 % 2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean isDivisible()
	{
		if (num2 % num1 == 0)
		{
			return true;
		}
		else
		{
			return true;
		}
	}

}