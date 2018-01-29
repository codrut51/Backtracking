package rec;

public class Main {
	private static String[] s = new String[] {"a","b","s","o","l","v", "e","n","t"};
	private static int[] sol;
	private static int n, k, nr;
	private static void init(int k)
	{
		sol[k]=0;
	}
	
	private static boolean valid(int k)
	{
		for(int i = 1; i < k; i++)
		{
			if(sol[i] == sol[k])
			{
				return false;
			}
		}		
		return true;
	}
	
	private static boolean solutie(int k)
	{
		return (k==n);
	}
	
	private static boolean valori(int k)
	{
		return (sol[k] < n);
	}
	
	private static void tipar(int k)
	{
		for(int i = 1; i <= k; i++)
		{
			System.out.print(s[sol[i]-1]);
		}
		System.out.println();
	}
	
	private static void back()
	{
		if(k>0)
		{
			if(valori(k))
			{
				sol[k]++;
				if(valid(k))
				{
					if(solutie(k))
					{
						tipar(k);
						nr++;
					}else{
						k++;
						init(k);
					}
				}
			}else{
				k--;
			}
			back();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		n = 9;
		sol = new int[n+1];
		nr = 0;
		k = 1;
		init(k);
		back();
		System.out.println(nr);
	}

}
