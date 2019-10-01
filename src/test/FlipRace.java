package test;


public class FlipRace {   // Flips two coins until one of them comes up heads three times in a row

	public static void main(String[] args) {
		
		int numOfTies = 0;
		final int TRIALS = 10;
		for (int i = 0; i < TRIALS; i++)
		{
			Coin coin1 = new Coin();
			Coin coin2 = new Coin();
			int counter1 = 0;
			int counter2 = 0;
			
			while(counter1 < 3 && counter2 < 3)
			{
				coin1.flip();
				coin2.flip();
				
				System.out.print("Coin 1: " + coin1.toString());
				System.out.println("; Coin 2: " + coin2.toString());
				
				if(coin1.isHeads())
				{
					counter1++;
				}
				else
				{
					counter1 = 0;
				}
				if(coin2.isHeads())
				{
					counter2++;
				}
				else
				{
					counter2 = 0;
				}
			}
			
			if (counter1 == counter2)
			{
				numOfTies++;
			}if (counter1 == 3)
			{
				System.out.println("Coin 1");
			}else
			{
				System.out.println("Coin 2");
			}
			System.out.println(100.0*numOfTies/(i+1));
		}
	}

}

class Coin
{
	private final int HEADS = 0;
	private final int TAILS = 1;
	
	private int face;
	
	public Coin ()
	{
		flip();
	}
	
	public void flip ()
	{
		face = (int) (Math.random() * 2);
	}
	
	public boolean isHeads ()
	{
		return (face == HEADS);
	}
	
	public String toString()
	{
		String faceName;
		if (face == HEADS)
			faceName = "Heads";
		else
			faceName = "Tails";
		return faceName;
	}
}