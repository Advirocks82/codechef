// Change the 'custom inputs' below and click 'run'
// Click on 'Submit' once you have tried out to proceed to the next problem

import java.util.Scanner;

class custominputs
{
	public static void main (String[] args)
	{
        Scanner read = new Scanner(System.in);
        
        int t = read.nextInt();
        for(int i=0; i<t; i++)
        {
            int n = read.nextInt();
            System.out.println(n+1);
        }
	}
}