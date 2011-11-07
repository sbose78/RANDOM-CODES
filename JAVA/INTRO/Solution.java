import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class Solution {
	
	public void run()
	{
		try
		{
			Scanner input = new Scanner(new FileInputStream("cts12.in"));
			PrintWriter output = new PrintWriter(new FileOutputStream("output.txt"));
			int N = input.nextInt();
			int n, i, j, j1, j2, j3;
			long a, b, c, d, x0, y0, m;
			long x[], y[];
			long xc, yc;
			long answer;
			
			for (i = 0; i < N; i++)
			{
				n = input.nextInt();
				a = input.nextInt();
				b = input.nextInt();
				c = input.nextInt();
				d = input.nextInt();
				x0 = input.nextInt();
				y0 = input.nextInt();
				m = input.nextInt();
				answer = 0;
				
				x = new long[n];
				y = new long[n];
				x[0] = x0;
				y[0] = y0;
				for (j = 1; j < n; j++)
				{
					x[j] = (a * x[j - 1] + b) % m;
					y[j] = (c * y[j - 1] + d) % m;
				}
				
				for (j1 = 0; j1 < n; j1++)
					for (j2 = 0; j2 < n; j2++)
						for (j3 = 0; j3 < n; j3++)
						if (j1 != j2 && j2 != j3 && j1 != j3)
						{
							xc = x[j1] + x[j2] + x[j3];
							yc = y[j1] + y[j2] + y[j3];
							if (xc % 3 == 0 && yc % 3 == 0)
								answer++;
					}
				
				output.println("Case #" + (i + 1) + ": " + (answer / 6));
				System.out.println("Case #" + (i + 1) + ": " + (answer / 6));
			}
		}
		catch (Exception ex)
		{
			
		}
	}
	
	public static void main(String args[])
	{
		Solution solution = new Solution();
		solution.run();
	}
}
