import java.util.Random;
public class Dice 
{
	private Random r;
	private int[] num = new int[6];

	public Dice(int seed)
	{
		r = new Random(seed);
		reset();
	}

	public String roll()
	{
		int side = r.nextInt(6);

		if(side == 0)
		{
			num[0]++;
			return "1";
		}

		else if(side == 1)
		{
			num[1]++;
			return "2";
		}

		else if(side == 2)
		{
			num[2]++;
			return "3";
		}

		else if(side == 3)
		{
			num[3]++;
			return "4";
		}

		else if(side == 4)
		{
			num[4]++;
			return "5";
		}

		else
		{
			num[5]++;
			return "6";
		}

	
	}



	public void printStats()
		{
			for(int i=0; i<num.length; i++)
			{
				System.out.println(i+1 + ": " + num[i]);
			}  
		}
		
	public void reset()
	{
		for(int i=0; i<num.length; i++)
		{
			num[i] = 0;
		}
	}

}