class BreakExample
{
	public static void main(String args[]) // main method
	{
		//int i=0;  //declaring a variable
		/* while(i<=10)
		{
			i++;
			
			if(i==5)
			{ 
				//break;
				continue;
			}			
			System.out.println(i);	
		} */
		for(int i=0;i<=10;i++)
		{
			if(i==5)
			{
				continue;
			}
			System.out.println(i);
		}
	}
}

// a>b  a<b  a==b a!=b  
//i=1, 2, 3, 4, 5