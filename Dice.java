import java.util.Random;
public class Dice 
{
	final int  ONE = 1;
	final int TWO = 2;
	final int THREE = 3;
	final int FOUR = 4;
	final int FIVE = 5;
	final int SIX = 6;
	private Random r;
	private int[] num = new int[5];

	public Dice(int seed)
	{
		r = new Random(seed);
		reset();
	}

	public String roll()
	{
		int side = r.nextInt(7);

		if(side == ONE)
		{
			setNum(side);
			return "1";
		}

		else if(side == TWO)
		{
			setNum(side);
			return "2";
		}

		else if(side == THREE)
		{
			setNum(side);
			return "3";
		}

		else if(side == FOUR)
		{
			setNum(side);
			return "4";
		}

		else if(side == FIVE)
		{
			setNum(side);
			return "5";
		}

		else if(side == SIX)
		{
			setNum(side);
			return "6";
		}

	return "what";
	}



	public String printStats()
	{
		return "1: " + num[1]; 
	}

	private void setNum(int value)
	{
		num[value]++;
	}
	
public void reset()
{
	for(int i=0; i<num.length; i++)
	{
		num[i] = 0;
	}
}

}