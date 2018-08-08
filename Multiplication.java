package program;

import java.util.Scanner;

public class Multiplication
{

	public static void main(String[] args) 
	{
		int n=1,i,j;
		char a;
		boolean t=true;
		while(t)
		{
			for(i=1;i<=3;i++)
			{
				for (j=1;j<=20;j++)
				{
					System.out.println(j+"*"+n+"="+j*n);
				}
				System.out.println();
				n++;
			}
			System.out.println("press y->continue \n n->exit");
			Scanner s=new Scanner(System.in);
			a=s.next().charAt(0);
			if(a!='y')
				t=false;
		}
	}

}
